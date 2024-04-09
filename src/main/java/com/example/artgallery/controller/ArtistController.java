package com.example.artgallery.controller;

import com.example.artgallery.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.artgallery.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ArtistController {

    @Autowired
    private ArtistJpaService artistJpaService;

    @GetMapping("/galleries/artists")
    public List<Artist> getArtists() {
        return artistJpaService.getArtists();
    }

    @GetMapping("galleries/artists/{artistId}")
    public Artist getArtistById(@PathVariable("artistId") int artistId) {
        return artistJpaService.getArtistById(artistId);

    }

    @PostMapping("/galleries/artists")

    public Artist addArtist(@RequestBody Artist artist) {
        return artistJpaService.addArtist(artist);
    }

    @PutMapping("/galleries/artists/{artistId}")
    public Artist updateArtist(@PathVariable("artistId") int artistId, @RequestBody Artist artist) {
        return artistJpaService.updateArtist(artistId, artist);
    }

    @DeleteMapping("/galleries/artists/{artistId}")
    public void deleteArtist(@PathVariable("artistId") int artistId) {
        artistJpaService.deleteArtist(artistId);
    }

    @GetMapping("/artists/{artistId}/arts")
    public List<Art> getArtistArts(@PathVariable("artistId") int artistId) {
        return artistJpaService.getArtistArts(artistId);
    }

    @GetMapping("/artists/{artistId}/galleries")
    public List<Gallery> getArtistGalleries(@PathVariable("artistId") int artistId) {
        return artistJpaService.getArtistGalleries(artistId);
    }

}