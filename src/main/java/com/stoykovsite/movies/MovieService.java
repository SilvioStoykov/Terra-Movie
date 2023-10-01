package com.stoykovsite.movies;

import com.stoykovsite.movies.Movie;
import com.stoykovsite.movies.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/*
The MovieService class contains most of the business logic code.
*The class contains all the database access methods.
The MovieService class talks to the database using the MovieRepository interface
to talk to the database and fetch the list of movies.
*/
@Service
public class MovieService {

    @Autowired //Auto-instantiates the class
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    //Optional means that the method might return null
    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
    }

}
