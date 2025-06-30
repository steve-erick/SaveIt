package com.erick.financas_pessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erick.financas_pessoal.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {

}
