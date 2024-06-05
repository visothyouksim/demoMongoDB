package com.example.demoMongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoMongoDB.model.Movie;
import com.example.demoMongoDB.repository.MovieRepository;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
    }

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @PostMapping("/updateMovie/{id}")
    public Movie updateMovie(@PathVariable String id, @RequestBody Movie newMovie) {
        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existingMovie.setName(newMovie.getName());
        existingMovie.setDescription(newMovie.getDescription());

        return movieRepository.save(existingMovie);
    }

    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(@PathVariable String id) {
        movieRepository.deleteById(id);
    }
}
