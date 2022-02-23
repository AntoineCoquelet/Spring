package com.springcore.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.springcore.rest.model.Site;

@Repository
@Primary
public class DaoSiteImplJpa implements DaoInterface{
	
	@Autowired
	private EntityManager em;

	@Override
	@Transactional
	public List<Site> findAll() {
		TypedQuery<Site> typeQuery = em.createQuery("from Site", Site.class);
		return typeQuery.getResultList();
	}

	@Override
	@Transactional
	public Site findById(Long id) {
		em.find(Site.class, id);
		return em.find(Site.class, id);
	}

	@Override
	@Transactional
	public Long save(Site site) {
		Site storedSite = em.merge(site);
		return storedSite.getId();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		Query query = em.createQuery("delete from Site where id = :siteId");
		query.setParameter("siteId", id);
		query.executeUpdate();
		
	}
}
