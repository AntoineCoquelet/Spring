package com.springcore.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springcore.rest.model.Site;
import com.springcore.rest.service.SiteServiceInterface;

@RestController
public class SiteController {
	
	@Autowired
	private SiteServiceInterface siteService;
	
	/*
	@Autowired
	public SiteController(SiteServiceInterface siteService) {
		this.siteService = siteService;
	}
	
	public void setSiteService(SiteServiceInterface siteService) {
		this.siteService = siteService;
	}
	*/
	
	@GetMapping("/findallsites")
	public List<Site> findAll() {
		return siteService.findAll(); 
	}
	
	@GetMapping("/findsitesbyid")
	public Site findById() {
		Long id = (long) 1;
		return siteService.findById(id); 
	}
	
	@GetMapping("/createsite")
	public Long create() {
		Site site = new Site("Nom", "Location", "Type");
		return siteService.save(site); 
	}
	
	@GetMapping("/updatesite")
	public Site update() {
		Site site = siteService.findById((long) 7);
		site.setNom("Nouveau Nom");
		site.setLocation("Nouvelle Location");
		site.setType("Nouveau Type");
		siteService.save(site); 
		return site;
	}
	
	@GetMapping("/deletesite")
	public void delete() {
		siteService.deleteById((long) 7);
	}
}
