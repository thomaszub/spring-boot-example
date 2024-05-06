CREATE TABLE users (
    id         UNIQUEIDENTIFIER PRIMARY KEY,
    username   VARCHAR(255)     NOT NULL,
    password   VARCHAR(255)     NOT NULL,
    email      VARCHAR(255)     NOT NULL,
    created_at DATETIME         NOT NULL,
    updated_at DATETIME         NOT NULL
);