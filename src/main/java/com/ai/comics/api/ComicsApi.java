package com.ai.comics.api;

import com.ai.comics.model.Comic;
import com.ai.comics.model.ComicResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-13T13:04:20.399893Z[Etc/UTC]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "comics", description = "the comics API")
public interface ComicsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /comics/{comicId} : Delete a comic by ID
     *
     * @param comicId  (required)
     * @return Comic deleted successfully (status code 204)
     */
    @Operation(
        operationId = "comicsComicIdDelete",
        summary = "Delete a comic by ID",
        responses = {
            @ApiResponse(responseCode = "204", description = "Comic deleted successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/comics/{comicId}"
    )
    
    default ResponseEntity<Void> comicsComicIdDelete(
        @Parameter(name = "comicId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("comicId") Integer comicId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /comics/{comicId} : Get a comic by ID
     *
     * @param comicId  (required)
     * @return A single comic (status code 200)
     */
    @Operation(
        operationId = "comicsComicIdGet",
        summary = "Get a comic by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "A single comic", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ComicResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/comics/{comicId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ComicResponse> comicsComicIdGet(
        @Parameter(name = "comicId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("comicId") Integer comicId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"comic_id\" : 0, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title\" : \"title\", \"author_id\" : 6, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /comics/{comicId} : Update a comic by ID
     *
     * @param comicId  (required)
     * @param comic  (required)
     * @return Comic updated successfully (status code 200)
     */
    @Operation(
        operationId = "comicsComicIdPut",
        summary = "Update a comic by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "Comic updated successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/comics/{comicId}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> comicsComicIdPut(
        @Parameter(name = "comicId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("comicId") Integer comicId,
        @Parameter(name = "Comic", description = "", required = true) @Valid @RequestBody Comic comic
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /comics : Get all comics
     *
     * @return A list of comics (status code 200)
     */
    @Operation(
        operationId = "comicsGet",
        summary = "Get all comics",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of comics", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComicResponse.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/comics",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<ComicResponse>> comicsGet(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"comic_id\" : 0, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title\" : \"title\", \"author_id\" : 6, \"content\" : \"content\" }, { \"comic_id\" : 0, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title\" : \"title\", \"author_id\" : 6, \"content\" : \"content\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /comics : Create a new comic
     *
     * @param comic  (required)
     * @return Comic created successfully (status code 201)
     */
    @Operation(
        operationId = "comicsPost",
        summary = "Create a new comic",
        responses = {
            @ApiResponse(responseCode = "201", description = "Comic created successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/comics",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> comicsPost(
        @Parameter(name = "Comic", description = "", required = true) @Valid @RequestBody Comic comic
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}