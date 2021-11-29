package com.sarra.livres;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarra.livres.entities.Client;
import com.sarra.livres.entities.Livre;
import com.sarra.livres.repos.LivreRepository;

@SpringBootTest
class LivresApplicationTests {
	@Autowired
	private LivreRepository livreRepository;
	@Test
	public void testCreateLivre() {
		Livre liv = new Livre("sindbad",5.900,new Date());
		livreRepository.save(liv);
	}
	@Test
	public void testFindLivre()
	{
		Livre l = livreRepository.findById(1L).get(); 
	System.out.println(l);
	}
	@Test
	public void testUpdateLivre()
	{
		Livre l = livreRepository.findById(1L).get();
	l.setPrixLivre(1.8);
	livreRepository.save(l);
	System.out.println(l);
	}
	 
	@Test
	public void testListerTousLivres()
	{
	List<Livre> livs = livreRepository.findAll();
	for (Livre l : livs)
	{
	System.out.println(l);
	}}
	@Test
	public void testFindByNomLivre()
	{
	List <Livre> livs = livreRepository.findByNomLivre("school");
	for (Livre l : livs)
	{
	System.out.println(l);
	}}
	
	@Test
	public void testFindByNomLivreLike()
	{
	List <Livre> livs = livreRepository.findByNomLivreLike("s");
	for (Livre l : livs)
	{
	System.out.println(l);
	}}
	@Test
	public void testFindByNomLivreContains()
	{
	List <Livre> livs = livreRepository.findByNomLivreContains("s");
	for (Livre l : livs)
	{
	System.out.println(l);
	}}
	@Test
	public void testfindByNomPrix()
	{
	List<Livre> livs = livreRepository.findByNomPrix("paris", 4.9);
	for (Livre l : livs)
	{
	System.out.println(l);
	}
	}

	@Test
	public void testfindByClient()
	{
		Client cl = new Client();
	cl.setIdCl(1L);
	
	List<Livre> livs = livreRepository.findByClient(cl);
	for (Livre l : livs)
	{
	System.out.println(l);
	}
	

	
	 }
	@Test
	public void testfindByOrderByNomLivreAsc()
	{
	List<Livre> livs = 
			livreRepository.findByOrderByNomLivreAsc();
	for (Livre l : livs)
	{
	System.out.println(l);
	}
	}
	@Test
	public void testTrierLivresNomsPrix()
	{
	List<Livre> livs =livreRepository.trierLivresNomsPrix();
	for (Livre l : livs)
	{
	System.out.println(l);
	}
	}
	}

	
	
	

	
	
	

