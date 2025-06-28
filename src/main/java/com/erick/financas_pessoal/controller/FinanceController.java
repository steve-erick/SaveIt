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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erick.financas_pessoal.model.Finance;
import com.erick.financas_pessoal.service.FinanceService;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    private final FinanceService financeService;

    @Autowired
    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    // aqui você coloca seus endpoints, ex:
    // @GetMapping, @PostMapping, etc.
    @GetMapping
    public List<Finance> getByUser(@RequestParam Long userId) {
    return financeService.getByUserId(userId);
}
    @PostMapping
    public Finance create(@RequestBody Finance finance){ return financeService.save(finance);} 

    @PutMapping
    public Finance update(@RequestBody Finance finance){ return financeService.update(finance);} 

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) { financeService.delete(id);return ResponseEntity.noContent().build();}   
}
