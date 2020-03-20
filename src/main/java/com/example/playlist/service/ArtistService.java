package com.example.playlist.service;

import com.example.playlist.entity.Artist;

import java.util.List;

public interface ArtistService {
    public List<Artist> findAllArtists();

    public void saveArtist(Artist artist);

    public Artist findArtistByName(String name);

    public void updateArtist(Artist artist);

    public void deleteArtist(int id);
}
