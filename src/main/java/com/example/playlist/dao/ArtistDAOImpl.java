package com.example.playlist.dao;

import com.example.playlist.entity.Artist;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ArtistDAOImpl implements ArtistDAO {

    private EntityManager entityManager;

    @Autowired
    public ArtistDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Artist> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Artist> query = currentSession.createQuery("from Artist", Artist.class);

        List<Artist> artists = query.getResultList();

        return artists;
    }

    @Override
    public void save(Artist artist) {
        Session currentSession = entityManager.unwrap(Session.class);

        // check if artist name already exists
        Query<Artist> query = currentSession.createQuery("from Artist where name=:name", Artist.class);
        query.setParameter("name", artist.getName());

        List<Artist> foundArtist = query.getResultList();

        // only save artist if name is unique
        if (foundArtist == null || foundArtist.isEmpty()) {
            entityManager.createNativeQuery("insert into Artist (id, name) values (?,?);")
                    .setParameter(1, artist.getId())
                    .setParameter(2, artist.getName())
                    .executeUpdate();
        }
    }

    @Override
    public Artist findByName(String name){
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Artist> query = currentSession.createQuery("from Artist where name=:name", Artist.class);
        query.setParameter("name", name);

        return query.getSingleResult();
    }

    @Override
    public void update(Artist artist) {
        // only update name and not id
        entityManager.createQuery("update Artist set name=:name where id=:id")
                .setParameter("id", artist.getId())
                .setParameter("name", artist.getName())
                .executeUpdate();
    }

    @Override
    public void delete(int id) {
        entityManager.createQuery("delete from Artist where id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
