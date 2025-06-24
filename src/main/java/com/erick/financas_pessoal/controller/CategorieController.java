package com.erick.financas_pessoal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erick.financas_pessoal.model.Categorie;
import com.erick.financas_pessoal.service.CategorieService;

@RestController
@RequestMapping("/categorie")
public class CategorieController {


    private final CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

     @GetMapping 
    public List<Categorie> getAll(){return categorieService.getAll();}

    @PostMapping
    public Categorie create(@RequestBody Categorie categorie){ return categorieService.save(categorie);} 

    @PutMapping
    public Categorie update(@RequestBody Categorie categorie){ return categorieService.update(categorie);} 

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) { categorieService.delete(id);return ResponseEntity.noContent().build();}   
}
