package com.erick.financas_pessoal.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Finance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String value;
    private LocalDate expirationDate;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  

    public Finance() {
    }

     public Finance(String name, String value, LocalDate expirationDate, Categorie categorie,User user) {
        this.name = name;
        this.value = value;
        this.expirationDate = expirationDate;
        this.categorie = categorie;
        this.user = user;

        
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setvalue(String value){
        this.value = value;
    }

    public String getvalue(){
        return value;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public LocalDate getDate(){
        return expirationDate;
    }

    public void setDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }
    
    public Categorie getType_id(){
        return categorie;
    }

    public void setType_id(Categorie type_id){
        this.categorie = type_id;
    }
    
    public User getuser_id(){
        return user;
    }

    public void setuser_id(User user_id){
        this.user = user_id;
    }
}
