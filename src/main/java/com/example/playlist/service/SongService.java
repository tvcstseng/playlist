package com.example.playlist.service;

import com.example.playlist.entity.Song;

import java.util.List;

public interface SongService {
    public List<Song> findAllSongs();

    public void saveSong(Song song);

    public List<Song> findSongByGenre(String genre);

    public void updateSong(Song song);

    public void deleteSong(int id);

    public List<Song> findFavorites();
}
