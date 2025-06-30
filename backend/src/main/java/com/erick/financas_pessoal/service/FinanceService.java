package com.erick.financas_pessoal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erick.financas_pessoal.dto.Financedto;
import com.erick.financas_pessoal.model.Categorie;
import com.erick.financas_pessoal.model.Finance;
import com.erick.financas_pessoal.model.User;
import com.erick.financas_pessoal.repository.CategorieRepository;
import com.erick.financas_pessoal.repository.FinanceRepository;
import com.erick.financas_pessoal.repository.UserRepository;

@Service
public class FinanceService {

    private final FinanceRepository financeRepository;
    private final UserRepository userRepository;
    private final CategorieRepository categorieRepository;

    public FinanceService(FinanceRepository financeRepository,
                          UserRepository userRepository,
                          CategorieRepository categorieRepository) {
        this.financeRepository = financeRepository;
        this.userRepository = userRepository;
        this.categorieRepository = categorieRepository;
    }

    public List<Finance> getAll(){
        return financeRepository.findAll();
    }

    public List<Finance> getByUserId(Long userId) {
        return financeRepository.findByUserId(userId);
    }

    public Optional<Finance> getById(long id) {
        return financeRepository.findById(id);
    }

    public Finance save(Finance finance){
        return financeRepository.save(finance);
    }

    public Finance saveFromDTO(Financedto dto) {
        User user = userRepository.findById(dto.getGetuser_id())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Categorie categorie = categorieRepository.findById(dto.type_id)
                .orElseThrow(() -> new IllegalArgumentException("Categorie not found"));

        Finance finance = new Finance();
        finance.setName(dto.name);
        finance.setvalue(dto.getvalue);
        finance.setDate(dto.date);
        finance.setuser_id(user);
        finance.setType_id(categorie); // Aqui estamos usando o nome antigo "type_id" no model

        return financeRepository.save(finance);
    }

    public void delete(Long id){
        financeRepository.deleteById(id);
    }

    public Finance update(Finance finance) {
        if (finance.getId() == null || !financeRepository.existsById(finance.getId())) {
            throw new IllegalArgumentException("Finance not found or ID is null");
        }
        return financeRepository.save(finance);
    }
}
