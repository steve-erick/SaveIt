package com.erick.financas_pessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.erick.financas_pessoal.model.Finance;
public interface  FinanceRepository extends JpaRepository<Finance,Long> {

}
