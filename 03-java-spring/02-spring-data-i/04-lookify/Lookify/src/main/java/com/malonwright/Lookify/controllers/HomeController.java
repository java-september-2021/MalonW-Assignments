package com.malonwright.Lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.malonwright.Lookify.models.Song;
import com.malonwright.Lookify.services.songService;



@Controller
public class HomeController {
	@Autowired
	private songService sService;
	
	//index
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	//song list all songs
	@GetMapping("/songList")
	public String songList(Model viewModel) {
		viewModel.addAttribute("song", this.sService.getAllSongs());
		return "songList.jsp";
	}
	//New Song Page
	@GetMapping("/new")
	public String newSong(@ModelAttribute("song")Song song) {
		return "newSong.jsp";
	}
	//Create
	@PostMapping("/create")
	public String addSong(@Valid @ModelAttribute("song")Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "newSong.jsp";			
		}
		this.sService.createSong(song);
		return "redirect:/songList.jsp";
	}
	//Top 10 Songs
	@GetMapping("/topSongs")
	public String topSongs(Model viewModel) {
		viewModel.addAttribute("song", this.sService.top10Songs());
		return "/topSongs.jsp";
	}
	//Search by Artist
	@GetMapping("/search")
	public String searchResults(@RequestParam("artistName")String search, Model viewModel) {
		viewModel.addAttribute("song",sService.searchByArtist(search));
		return "search.jsp";
	}
	//Song Details
	@GetMapping("/details/{id}")
	public String songDetails(@PathVariable("id")Long id,Model viewModel) {
		viewModel.addAttribute("song", this.sService.getOneSong(id));
		return "details.jsp";
	}
	//Delete Song
	@DeleteMapping("/delete/{id}")
	public void deleteSong(@PathVariable("id")Long id) {
		sService.deleteSong(id);
	}
	
	
	
}
