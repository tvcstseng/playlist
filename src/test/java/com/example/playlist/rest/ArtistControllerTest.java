package com.example.playlist.rest;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.playlist.entity.Artist;
import com.example.playlist.util.TestData;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// TODO: Wat is er architectuur technisch mis met deze test class
// TODO: Hoe testen we onze te verwachte exception cases
// TODO: Hoe testen we error responses? en hoe wijkt dit af van een happy case response
// TODO: Wat geven we terug aan de caller en wat niet
// TODO: Hoe passen we deze class aan dat deze gaat testen naar controller functionaliteit
// TODO: Zou je deze Test Class af willen maken?
@SpringBootTest
public class ArtistControllerTest {

    @Autowired
    private ArtistController artistController;

    @Before
    public void init() {

    }

    @After
    public void tearDown() {
        List<Artist> artists = artistController.getAllArtists();
        for (Artist artist : artists) {
            artistController.deleteArtist(artist.getId());
        }
    }

    // TODO: wat is er mis met deze testcase
    @Test
    public void testGetAllArtists() {
        // preparation
        Artist artist = TestData.createArtist();
        artistController.saveArtist(artist);

        // action
        List<Artist> result = artistController.getAllArtists();

        // verify
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
    }

    @Test
    public void testExceptionCase() {

    }

    @Test
    public void testSaveArtist() {
    }

    @Test
    public void testGetArtistByName() {
    }

    @Test
    public void testUpdateArtist() {
    }

    @Test
    public void testDeleteArtist() {
    }
}
