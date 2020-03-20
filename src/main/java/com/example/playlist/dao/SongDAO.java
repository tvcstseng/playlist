package com.example.playlist.dao;

import com.example.playlist.entity.Song;

import java.util.List;

public interface SongDAO {

    public List<Song> findAll();

    public void save(Song song);

    public List<Song> findByGenre(String genre);

    public void update(Song song);

    public void delete(int id);

    public List<Song> findFavorites();
}
