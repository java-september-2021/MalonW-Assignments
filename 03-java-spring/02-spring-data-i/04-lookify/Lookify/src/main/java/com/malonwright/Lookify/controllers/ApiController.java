package com.malonwright.Lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malonwright.Lookify.models.Song;
import com.malonwright.Lookify.services.songService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private songService sService;
	
	@GetMapping("/songList")
	public List<Song> songsList(){
		return this.sService.getAllSongs();
		
	}
	@PostMapping("/create")
	public Song createSong(Song song) {
		return this.sService.createSong(song);
	}
}
