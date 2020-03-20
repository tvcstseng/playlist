package com.example.playlist.rest;

import com.example.playlist.entity.Artist;
import com.example.playlist.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/artists")
    public List<Artist> getAllArtists() {
        return artistService.findAllArtists();
    }

    @PostMapping("/artists")
    public void saveArtist(@RequestBody Artist artist) {
        artistService.saveArtist(artist);
    }

    @GetMapping("/artists/{name}")
    public Artist getArtistByName(@PathVariable String name) {
        Artist artist = artistService.findArtistByName(name);

        if(artist == null) {
            throw new ArtistNotFoundException("Artist with name " + name + " not found");
        }

        return artist;
    }

    @PutMapping("/artists")
    public void updateArtist(@RequestBody Artist artist) {
        artistService.updateArtist(artist);
    }

    @DeleteMapping("/artists/{id}")
    public void deleteArtist(@PathVariable Integer id) {
        artistService.deleteArtist(id);
    }
}
