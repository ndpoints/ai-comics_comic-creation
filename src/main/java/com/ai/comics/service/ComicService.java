package com.ai.comics.service;

import com.ai.comics.model.Comic;
import com.ai.comics.model.ComicResponse;
import java.util.List;

/**
 * Service interface for managing comics.
 */
public interface ComicService {

    /**
     * Delete a comic by its ID.
     *
     * @param comicId the ID of the comic to delete
     * @throws Exception if an error occurs during deletion
     */
    void deleteComicById(Integer comicId) throws Exception;

    /**
     * Get a comic by its ID.
     *
     * @param comicId the ID of the comic to retrieve
     * @return the comic response
     * @throws Exception if an error occurs during retrieval
     */
    ComicResponse getComicById(Integer comicId) throws Exception;

    /**
     * Update a comic by its ID.
     *
     * @param comicId the ID of the comic to update
     * @param comic the comic data to update
     * @throws Exception if an error occurs during update
     */
    void updateComicById(Integer comicId, Comic comic) throws Exception;

    /**
     * Get all comics.
     *
     * @return a list of comic responses
     * @throws Exception if an error occurs during retrieval
     */
    List<ComicResponse> getAllComics() throws Exception;

    /**
     * Create a new comic.
     *
     * @param comic the comic data to create
     * @throws Exception if an error occurs during creation
     */
    void createComic(Comic comic) throws Exception;
}