package com.malonwright.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malonwright.Lookify.models.Song;

@Repository
public interface songRepository extends CrudRepository<Song, Long> {
	List<Song> findAll();
	
	List<Song> findTop10ByOrderByRatingDesc();
	
	List<Song> findByartistNameContaining(String artist);
}
