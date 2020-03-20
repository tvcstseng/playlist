package com.example.playlist.dao;

import com.example.playlist.entity.Song;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SongDAOImpl implements SongDAO {

    private EntityManager entityManager;

    @Autowired
    public SongDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Song> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Song> query = currentSession.createQuery("from Song", Song.class);

        return query.getResultList();
    }

    @Override
    public void save(Song song) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(song);
    }

    @Override
    public List<Song> findByGenre(String genre) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Song> query = currentSession.createQuery("from Song where genre=:genre", Song.class);
        query.setParameter("genre", genre);

        return query.getResultList();
    }

    @Override
    public void update(Song song) {
        // update all data except the id
        entityManager.createQuery("update Song set name=:name, year=:year, artist=:artist, shortName=:shortName," +
            "bpm=:bpm, duration=:duration, genre=:genre, spotifyId=:spotifyId, album=:album where id=:id")
            .setParameter("id", song.getId())
            .setParameter("name", song.getName())
            .setParameter("year", song.getYear())
            .setParameter("artist", song.getArtist())
            .setParameter("shortName", song.getShortName())
            .setParameter("bpm", song.getBpm())
            .setParameter("duration", song.getDuration())
            .setParameter("genre", song.getGenre())
            .setParameter("spotifyId", song.getSpotifyId())
            .setParameter("album", song.getAlbum())
            .executeUpdate();
    }

    @Override
    public void delete(int id) {
        entityManager.createQuery("delete from Song where id=:id")
            .setParameter("id", id)
            .executeUpdate();
    }

    public List<Song> findFavorites() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Song> query = currentSession.createQuery("from Song where genre='metal' and year < 2016", Song.class);

        return query.getResultList();
    }
}
