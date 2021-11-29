package com.sarra.livres.service;

import java.util.List;

import com.sarra.livres.entities.Client;
import com.sarra.livres.entities.Livre;
public interface LivreService {
	Livre saveLivre(Livre l);
	Livre updateLivre(Livre l);
void deleteLivre(Livre l);
 void deleteLivreById(Long id);
 Livre getLivre(Long id);
List<Livre> getAllLivres();
List<Livre> findByNomLivre(String nom);
List<Livre> findByNomLivreContains(String nom);
List<Livre> findByNomPrix (String nom, Double prix);
List<Livre> findByClient (Client client);

List<Livre> findByOrderByNomLivreAsc();
List<Livre> trierLivresNomsPrix();
}

