package com.stoykovsite.movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//Document denotes that the class represents each document(movie) in the database
@Document(collection = "movies")
@Data //takes care of getters, setters, toString, etc.
@AllArgsConstructor //annotation for a constructor that takes all the fields below
@NoArgsConstructor //annotation for a constructor with no arguments
public class Movie {
    @Id //@Id denotes that the property shall be treated as the unique identifier for each movie
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;
}
