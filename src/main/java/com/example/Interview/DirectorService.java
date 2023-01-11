package com.example.Interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    public String addMovieDirector(Director director){
      return  directorRepository.addMovieDirectortoDb(director);
    }

    public String getDirectorByMovieName(String movieName){
        return directorRepository.getDirectorByMovieNameFromDb(movieName);
    }
}
