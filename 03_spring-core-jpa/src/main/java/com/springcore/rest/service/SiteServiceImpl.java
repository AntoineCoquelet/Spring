package com.springcore.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcore.rest.dao.DaoInterface;
import com.springcore.rest.model.Site;

@Service
public class SiteServiceImpl implements SiteServiceInterface {
	
	@Autowired
	private DaoInterface dao;

	@Override
	public List<Site> findAll() {
		return dao.findAll();
	}

	@Override
	public Site findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public Long save(Site site) {
		return dao.save(site);
	}

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
	}
}
