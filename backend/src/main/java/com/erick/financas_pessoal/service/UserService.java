package com.erick.financas_pessoal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erick.financas_pessoal.model.User;
import com.erick.financas_pessoal.repository.UserRepository;


@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    //listar
    public List<User> getAll(){
        return userRepository.findAll();
    }

    //listar por id
    public Optional<User> getById(long id) {
        return userRepository.findById(id);
    }
  
    //criar
    public User save(User user){
        return userRepository.save(user);
    }
    //deletar
    public void delete(Long id){
        userRepository.deleteById(id);
    }
    
    //update
    public User update(User user) {
    if (user.getId() == null || !userRepository.existsById(user.getId())) {
        throw new IllegalArgumentException("User not found or ID is null");
    }
    return userRepository.save(user);
}
    
}
