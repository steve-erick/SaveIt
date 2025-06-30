package com.erick.financas_pessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.erick.financas_pessoal.model.Finance;
public interface  FinanceRepository extends JpaRepository<Finance,Long> {

List<Finance> findByUserId(Long userId); // Aqui está o método!
}
