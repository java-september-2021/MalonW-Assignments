package com.malonwright.Lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.Lookify.models.Song;
import com.malonwright.Lookify.repositories.songRepository;

@Service
public class songService {
	@Autowired
	private songRepository sRepo;
	//get all
	public List<Song> getAllSongs(){
		return this.sRepo.findAll();
	}
	//get one song
	public Song getOneSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	//create
	public Song createSong(Song song) {
		return this.sRepo.save(song);
	}
	//update
	public Song updateSong(Song song) {
		return this.sRepo.save(song);
	}
	
	//Delete
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	
	//Find Top 10
	public List<Song> top10Songs(){
		return this.sRepo.findTop10ByOrderByRatingDesc();
	}
	
	//Search By Artist
	public List<Song> searchByArtist(String artist){
		return this.sRepo.findByartistNameContaining(artist);
	}
	
}
