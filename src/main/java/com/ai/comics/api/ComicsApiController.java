package com.ai.comics.api;

import com.ai.comics.model.Comic;
import com.ai.comics.model.ComicResponse;
import com.ai.comics.service.ComicService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@Validated
@Tag(name = "comics", description = "the comics API")
public class ComicsApiController implements ComicsApi {

    private final ComicService comicService;

    @Autowired
    public ComicsApiController(ComicService comicService) {
        this.comicService = comicService;
    }

    @Override
    public ResponseEntity<Void> comicsComicIdDelete(@PathVariable("comicId") Integer comicId) throws Exception {
        comicService.deleteComicById(comicId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<ComicResponse> comicsComicIdGet(@PathVariable("comicId") Integer comicId) throws Exception {
        ComicResponse comicResponse = comicService.getComicById(comicId);
        return new ResponseEntity<>(comicResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> comicsComicIdPut(@PathVariable("comicId") Integer comicId, @Valid @RequestBody Comic comic) throws Exception {
        comicService.updateComicById(comicId, comic);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ComicResponse>> comicsGet() throws Exception {
        List<ComicResponse> comics = comicService.getAllComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> comicsPost(@Valid @RequestBody Comic comic) throws Exception {
        comicService.createComic(comic);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}