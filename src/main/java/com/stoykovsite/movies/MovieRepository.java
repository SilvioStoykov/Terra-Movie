package com.stoykovsite.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The Repository layer is the data access layer that communicates with the database
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
