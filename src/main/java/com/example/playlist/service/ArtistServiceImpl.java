package com.example.playlist.service;

import com.example.playlist.dao.ArtistDAO;
import com.example.playlist.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistDAO artistDAO;

    @Override
    @Transactional
    public List<Artist> findAllArtists() {
        return artistDAO.findAll();
    }

    @Override
    @Transactional
    public void saveArtist(Artist artist) {
        artistDAO.save(artist);
    }

    @Override
    @Transactional
    public Artist findArtistByName(String name) {
        return artistDAO.findByName(name);
    }

    @Override
    @Transactional
    public void updateArtist(Artist artist) {
        artistDAO.update(artist);
    }

    @Override
    @Transactional
    public void deleteArtist(int id) {
        artistDAO.delete(id);
    }
}
