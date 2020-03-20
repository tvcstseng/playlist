package com.example.playlist.entity;

import javax.persistence.*;

@Entity
@Table(name="song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="year")
    private Integer year;

    @Column(name="artist")
    private String artist;

    @Column(name="short_name")
    private String shortName;

    @Column(name="bpm")
    private Integer bpm;

    @Column(name="duration")
    private Integer duration;

    @Column(name="genre")
    private String genre;

    @Column(name="spotify_id")
    private String spotifyId;

    @Column(name="album")
    private String album;

    public Song() {}

    public Song(String name, Integer year, String artist, String shortName, Integer bpm, Integer duration, String genre,
                String spotifyId, String album) {
        this.name = name;
        this.year = year;
        this.artist = artist;
        this.shortName = shortName;
        this.bpm = bpm;
        this.duration = duration;
        this.genre = genre;
        this.spotifyId = spotifyId;
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getBpm() {
        return bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSpotifyId() {
        return spotifyId;
    }

    public void setSpotifyId(String spotifyId) {
        this.spotifyId = spotifyId;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", artist='" + artist + '\'' +
                ", shortName='" + shortName + '\'' +
                ", bpm=" + bpm +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", spotifyId='" + spotifyId + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

}
