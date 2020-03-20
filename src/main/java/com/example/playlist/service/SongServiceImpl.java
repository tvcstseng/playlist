package com.example.playlist.service;

import com.example.playlist.dao.SongDAO;
import com.example.playlist.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongDAO songDAO;

    @Override
    @Transactional
    public List<Song> findAllSongs() {
        return songDAO.findAll();
    }

    @Override
    @Transactional
    public void saveSong(Song song) {
        songDAO.save(song);
    }

    @Override
    @Transactional
    public List<Song> findSongByGenre(String genre) {
        return songDAO.findByGenre(genre);
    }

    @Override
    @Transactional
    public void updateSong(Song song) {
        songDAO.update(song);
    }

    @Override
    @Transactional
    public void deleteSong(int id) {
        songDAO.delete(id);
    }

    @Override
    @Transactional
    public List<Song> findFavorites() {
        return songDAO.findFavorites();
    }
}
