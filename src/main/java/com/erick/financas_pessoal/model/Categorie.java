package com.erick.financas_pessoal.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

    public Categorie() {
    }

     public Categorie(String name, String type) {
        this.name = name;   
        this.type = type;
        
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
     public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
