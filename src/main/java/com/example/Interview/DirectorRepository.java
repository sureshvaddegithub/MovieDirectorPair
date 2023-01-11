package com.example.Interview;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DirectorRepository {

    HashMap<String,String> movieDirectorPair = new HashMap<>();

    public String addMovieDirectortoDb(Director director){
        movieDirectorPair.put(director.getMovieName(), director.getDirectorName());
        return "added successfully";
    }
    public String getDirectorByMovieNameFromDb(String movieName){
        return movieDirectorPair.get(movieName);
    }
}
