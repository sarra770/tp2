package com.sarra.livres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sarra.livres.entities.Client;
import com.sarra.livres.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
 List <Livre> findByNomLivre(String nom);
 List <Livre> findByNomLivreLike(String nom);
 List <Livre> findByNomLivreContains(String nom);
 /*@Query("select l from Livre l where l.nomLivre like %?1 and l.prixLivre > ?2")
 List<Livre> findByNomPrix (String nom, Double prix);*/

 @Query("select l from Livre l where l.nomLivre like %:nom and l.prixLivre > :prix")
 List<Livre> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
 

 @Query("select l from Livre l where l.client = ?1")
 List<Livre> findByClient (Client client);

 List<Livre> findByOrderByNomLivreAsc();
 @Query("select l from Livre l order by l.nomLivre ASC, l.prixLivre DESC")
 List<Livre> trierLivresNomsPrix ();


}
