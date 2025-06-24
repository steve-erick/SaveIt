package com.erick.financas_pessoal.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Finance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String value;
    private LocalDate expirationDate;
    private String type_id;
    private long  user_id;

    public Finance() {
    }

     public Finance(String description, String value, LocalDate expirationDate, String type_id,long user_id) {
        this.description = description;
        this.value = value;
        this.expirationDate = expirationDate;
        this.type_id = type_id;
        this.user_id = user_id;

        
    }

    public Long getId() {
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void setvalue(String value){
        this.value = value;
    }

    public String getvalue(){
        return value;
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public LocalDate getDate(){
        return expirationDate;
    }

    public void setDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }
    
    public String getType_id(){
        return type_id;
    }

    public void setType_id(String type_id){
        this.type_id = type_id;
    }
    
    public Long getuser_id(){
        return user_id;
    }

    public void setuser_id(Long user_id){
        this.user_id = user_id;
    }
}
