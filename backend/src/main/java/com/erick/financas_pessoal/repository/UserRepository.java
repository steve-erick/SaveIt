package com.erick.financas_pessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erick.financas_pessoal.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
