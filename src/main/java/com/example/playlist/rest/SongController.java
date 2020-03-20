package com.example.playlist.rest;

import com.example.playlist.entity.Song;
import com.example.playlist.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songService.findAllSongs();
    }

    @PostMapping("/songs")
    public void saveArtist(@RequestBody Song song) {
        songService.saveSong(song);
    }

    @GetMapping("/songs/{genre}")
    public List<Song> getSongsByGenre(@PathVariable String genre) {
        return songService.findSongByGenre(genre);
    }

    @PutMapping("/songs")
    public void updateSong(@RequestBody Song song) {
        songService.updateSong(song);
    }

    @DeleteMapping("/songs/{id}")
    public void deleteSong(@PathVariable int id) {
        songService.deleteSong(id);
    }

    @GetMapping("/songs/favorites")
    public List<Song> getFavorites() {
        return songService.findFavorites();
    }
}
