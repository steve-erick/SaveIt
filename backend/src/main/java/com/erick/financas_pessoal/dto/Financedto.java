package com.erick.financas_pessoal.dto;
import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class Financedto {
    public String name;
    @NotNull
    public String getvalue;
    public LocalDate date;
    @NotNull
    public Long getuser_id;
    @NotNull 
    public Long type_id;

     public String getName() {
        return name;
    }

    public String getGetvalue() {
        return getvalue;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getGetuser_id() {
        return getuser_id;
    }

    public Long getType_id() {
        return type_id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGetvalue(String getvalue) {
        this.getvalue = getvalue;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setGetuser_id(Long getuser_id) {
        this.getuser_id = getuser_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }
}