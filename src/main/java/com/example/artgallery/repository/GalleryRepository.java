/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.artgallery.repository;

import com.example.artgallery.model.*;
import com.example.artgallery.model.Gallery;

import java.util.List;

public interface GalleryRepository {

    List<Gallery> getGalleries();

    Gallery getGalleryById(int galleryId);

    Gallery addGallery(Gallery gallery);

    Gallery updateGallery(int galleryId, Gallery gallery);

    void deleteGallery(int galleryId);

    List<Artist> getGalleryArtists(int galleryId);
}
