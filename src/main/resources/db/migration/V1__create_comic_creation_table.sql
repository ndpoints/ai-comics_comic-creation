CREATE TABLE comic_creation (
    comic_id INTEGER NOT NULL UNIQUE,
    title VARCHAR(255) NOT NULL,
    author_id INTEGER NOT NULL,
    content TEXT NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME,
    PRIMARY KEY (comic_id)
);

CREATE INDEX idx_author_id ON comic_creation(author_id);

INSERT INTO comic_creation (comic_id, title, author_id, content, created_at) VALUES
(1, 'The Adventures of AI', 101, 'Content of the comic...', NOW()),
(2, 'AI in Wonderland', 102, 'Content of the comic...', NOW()),
(3, 'AI and the Magic Pen', 103, 'Content of the comic...', NOW());