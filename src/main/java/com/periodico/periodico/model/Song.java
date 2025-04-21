package com.periodico.periodico.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty
    @Size(max = 255)
    @Column(nullable = false)
    private String title;

    @NotEmpty
    @Size(min = 50, max = 2000)
    @Column(nullable = false)
    private String lyrics;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    @JsonBackReference 
    private Artist artist;

    @NotNull
    @Min(1900)
    @Max(2100)
    @Column(nullable = false)
    private short release;

    @NotEmpty
    @Column(nullable = false)
    private String topic;

    public Song() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return this.lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public short getRelease() {
        return this.release;
    }

    public void setRelease(short release) {
        this.release = release;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    
}
