
package com.example.artgallery.controller;

import com.example.artgallery.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.artgallery.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ArtController {

    @Autowired
    private ArtJpaService artJpaService;

    @GetMapping("/galleries/artists/arts")
    public List<Art> getArts() {
        return artJpaService.getArts();
    }

    @GetMapping("/galleries/artists/arts/{artId}")
    public Art getArtById(@PathVariable("artId") int artId) {
        return artJpaService.getArtById(artId);
    }

    @PostMapping("/galleries/artists/arts")
    public Art addArt(@RequestBody Art art) {
        return artJpaService.addArt(art);
    }

    @PutMapping("/galleries/artists/arts/{artId}")
    public Art updateArt(@PathVariable("artId") int artId, @RequestBody Art art) {
        return artJpaService.updateArt(artId, art);
    }

    @DeleteMapping("/galleries/artists/arts/{artId}")
    public void deleteArt(@PathVariable("artId") int artId) {
        artJpaService.deleteArt(artId);
    }

    @GetMapping("/arts/{artId}/artist")
    public Artist getArtArtist(@PathVariable("artId") int artId) {
        return artJpaService.getArtArtist(artId);
    }

}
