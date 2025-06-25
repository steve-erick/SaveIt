package com.erick.financas_pessoal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erick.financas_pessoal.model.Finance;
import com.erick.financas_pessoal.repository.FinanceRepository;


@Service
public class FinanceService {

    private final FinanceRepository financeRepository;


    public FinanceService(FinanceRepository financeRepository){
        this.financeRepository = financeRepository;
    }
    
    //listar
    public List<Finance> getAll(){
        return financeRepository.findAll();
    }

  
    public Optional<Finance> getById(long id) {
        return financeRepository.findById(id);
    }

    //criar
    public Finance save(Finance finance){
        return financeRepository.save(finance);
    }
    //deletar
    public void delete(Long id){
        financeRepository.deleteById(id);
    }
    
    //update
    public Finance update(Finance finance) {
    // Verifica se o registro existe
    if (finance.getId() == null || !financeRepository.existsById(finance.getId())) {
        throw new IllegalArgumentException("Finance not found or ID is null");
    }
    return financeRepository.save(finance);
}
    
}
