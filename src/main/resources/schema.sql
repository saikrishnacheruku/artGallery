-- Create Artist table
CREATE TABLE artist (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    genre TEXT
);

-- Create Art table
CREATE TABLE art (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title TEXT,
    theme TEXT,
    artistid INTEGER,
    FOREIGN KEY (artistId) REFERENCES artist(id)
);

-- Create Gallery table
CREATE TABLE gallery (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT
);

-- Create Artist_Gallery junction table
CREATE TABLE artist_gallery (
    artistid INTEGER,
    galleryid INTEGER,
    PRIMARY KEY (artistid, galleryid),
    FOREIGN KEY (artistid) REFERENCES artist(id),
    FOREIGN KEY (galleryid) REFERENCES gallery(id)
);