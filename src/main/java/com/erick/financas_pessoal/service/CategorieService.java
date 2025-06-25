package com.erick.financas_pessoal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erick.financas_pessoal.model.Categorie;
import com.erick.financas_pessoal.repository.CategorieRepository;


@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;


    public CategorieService(CategorieRepository categorieRepository){
        this.categorieRepository = categorieRepository;
    }
    
    //listar
    public List<Categorie> getAll(){
        return categorieRepository.findAll();
    }

    public Optional<Categorie> getById(long id) {
        return categorieRepository.findById(id);
    }

    //criar
    public Categorie save(Categorie categorie){
        return categorieRepository.save(categorie);
    }
    //deletar
    public void delete(Long id){
        categorieRepository.deleteById(id);
    }
    
    //update
    public Categorie update(Categorie categorie) {
    // Verifica se o registro existe
    if (categorie.getId() == null || !categorieRepository.existsById(categorie.getId())) {
        throw new IllegalArgumentException("Categorie not found or ID is null");
    }
    return categorieRepository.save(categorie);
}
    
}
