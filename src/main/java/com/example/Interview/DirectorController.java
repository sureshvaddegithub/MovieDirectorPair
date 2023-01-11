package com.example.Interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("director")
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @PostMapping("add-movie-director")
    public ResponseEntity<String> addMovieDirector(@RequestBody() Director director){
        String result = directorService.addMovieDirector(director);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("get-director-by-moviename")
    public ResponseEntity<String> getDirectorByMovieName(@RequestParam String movieName){
        String directorName = directorService.getDirectorByMovieName(movieName);
        return new ResponseEntity<>(directorName,HttpStatus.CREATED);
    }
}
