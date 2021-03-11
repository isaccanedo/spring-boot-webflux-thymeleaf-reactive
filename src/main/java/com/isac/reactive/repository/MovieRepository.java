package com.isac.reactive.repository;

import com.isac.reactive.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
