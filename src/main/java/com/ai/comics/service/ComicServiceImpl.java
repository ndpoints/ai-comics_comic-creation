package com.ai.comics.service;

import com.ai.comics.entity.ComicEntity;
import com.ai.comics.model.Comic;
import com.ai.comics.model.ComicResponse;
import com.ai.comics.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of the ComicService interface for managing comics.
 */
@Service
public class ComicServiceImpl implements ComicService {

    @Autowired
    private ComicRepository comicRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteComicById(Integer comicId) throws Exception {
        try {
            comicRepository.deleteById(comicId);
        } catch (Exception e) {
            // Log the exception
            throw new Exception("Error deleting comic with ID: " + comicId, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComicResponse getComicById(Integer comicId) throws Exception {
        try {
            ComicEntity comicEntity = comicRepository.findById(comicId)
                    .orElseThrow(() -> new Exception("Comic not found with ID: " + comicId));
            return convertEntityToModel(comicEntity);
        } catch (Exception e) {
            // Log the exception
            throw new Exception("Error retrieving comic with ID: " + comicId, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateComicById(Integer comicId, Comic comic) throws Exception {
        try {
            ComicEntity comicEntity = convertModelToEntity(comic);
            comicEntity.setComicId(comicId);
            comicRepository.save(comicEntity);
        } catch (Exception e) {
            // Log the exception
            throw new Exception("Error updating comic with ID: " + comicId, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ComicResponse> getAllComics() throws Exception {
        try {
            List<ComicEntity> comicEntities = comicRepository.findAll();
            return comicEntities.stream()
                    .map(this::convertEntityToModel)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            // Log the exception
            throw new Exception("Error retrieving all comics", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createComic(Comic comic) throws Exception {
        try {
            ComicEntity comicEntity = convertModelToEntity(comic);
            comicRepository.save(comicEntity);
        } catch (Exception e) {
            // Log the exception
            throw new Exception("Error creating comic", e);
        }
    }

    /**
     * Converts a ComicEntity to a ComicResponse.
     *
     * @param comicEntity the entity to convert
     * @return the converted ComicResponse
     */
    private ComicResponse convertEntityToModel(ComicEntity comicEntity) {
        ComicResponse comicResponse = new ComicResponse();
        comicResponse.setComicId(comicEntity.getComicId());
        comicResponse.setTitle(comicEntity.getTitle());
        comicResponse.setAuthorId(comicEntity.getAuthorId());
        comicResponse.setContent(comicEntity.getContent());
        comicResponse.setCreatedAt(comicEntity.getCreatedAt());
        comicResponse.setUpdatedAt(comicEntity.getUpdatedAt());
        return comicResponse;
    }

    /**
     * Converts a Comic to a ComicEntity.
     *
     * @param comic the model to convert
     * @return the converted ComicEntity
     */
    private ComicEntity convertModelToEntity(Comic comic) {
        ComicEntity comicEntity = new ComicEntity();
        comicEntity.setComicId(comic.getComicId());
        comicEntity.setTitle(comic.getTitle());
        comicEntity.setAuthorId(comic.getAuthorId());
        comicEntity.setContent(comic.getContent());
        comicEntity.setCreatedAt(comic.getCreatedAt());
        comicEntity.setUpdatedAt(comic.getUpdatedAt());
        return comicEntity;
    }
}
