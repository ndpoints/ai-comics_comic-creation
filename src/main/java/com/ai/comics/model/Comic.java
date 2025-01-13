package com.ai.comics.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comic {
    private Integer comicId;
    private String title;
    private Integer authorId;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Integer getComicId() {
        return comicId;
    }

    public void setComicId(Integer comicId) {
        this.comicId = comicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // toString method
    @Override
    public String toString() {
        return "Comic{" +
                "comicId=" + comicId +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    // toIndentedString method
    private String toIndentedString(String value) {
        return value.replace("\n", "\n    ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comic comic = (Comic) o;
        return Objects.equals(comicId, comic.comicId) &&
                Objects.equals(title, comic.title) &&
                Objects.equals(authorId, comic.authorId) &&
                Objects.equals(content, comic.content) &&
                Objects.equals(createdAt, comic.createdAt) &&
                Objects.equals(updatedAt, comic.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comicId, title, authorId, content, createdAt, updatedAt);
    }
}