package com.example.playlist.util;

import com.example.playlist.entity.Artist;
import com.example.playlist.entity.Song;

public class TestData {

    public static final int DB_ID_NONE = 0;

    public static final String ARTIST_NAME = "artist name";

    public static final String SONG_NAME = "song name";
    public static final int SONG_YEAR = 1971;
    public static final String ALBUM_NAME = "album name";
    public static final int BPM = 127;
    public static final int DURATION = 120;
    public static final String GENRE = "genre";
    public static final String SPOTIFY_ID = "spotify_id";

    public static Artist createArtist() {
        Artist artist = new Artist();
        artist.setId(DB_ID_NONE);
        artist.setName(ARTIST_NAME);
        return artist;
    }

    public static Song createSong() {
        Song song = new Song();
        song.setId(DB_ID_NONE);
        song.setName(SONG_NAME);
        song.setYear(SONG_YEAR);
        song.setArtist(createArtist().getName());
        song.setShortName(createArtist().getName());
        song.setBpm(BPM);
        song.setDuration(DURATION);
        song.setGenre(GENRE);
        song.setSpotifyId(SPOTIFY_ID);
        song.setAlbum(ALBUM_NAME);
        return song;
    }

}
