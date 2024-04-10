INSERT INTO artist (name, genre) VALUES
('Artist 1', 'Abstract'),
('Artist 2', 'Impressionist'),
('Artist 3', 'Surrealist');

-- Insert sample data into Art table
INSERT INTO art (title, theme, artistid) VALUES
('Artwork 1', 'Abstract Composition', 1),
('Artwork 2', 'Landscape', 2),
('Artwork 3', 'Dreamscape', 3);

-- Insert sample data into Gallery table
INSERT INTO gallery (name, location) VALUES
('Gallery A', 'New York'),
('Gallery B', 'London'),
('Gallery C', 'Paris');

-- Insert sample data into Artist_Gallery junction table
INSERT INTO artist_gallery (artistid, galleryid) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3);