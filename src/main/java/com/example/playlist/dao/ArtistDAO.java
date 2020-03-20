package com.example.playlist.dao;

import com.example.playlist.entity.Artist;

import java.util.List;

public interface ArtistDAO {

    public List<Artist> findAll();

    public void save(Artist artist);

    public Artist findByName(String name);

    public void update(Artist artist);

    public void delete(int id);
}
