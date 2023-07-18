package com.users.userscrud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.userscrud.models.UserModel;
import com.users.userscrud.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public ArrayList<UserModel> getUsers() {
    return (ArrayList<UserModel>) userRepository.findAll();
  }

  public UserModel saveUser(UserModel user) {
    return userRepository.save(user);
  }

  public Optional<UserModel> getById(Long id) {
    return userRepository.findById(id);
  }

  public ArrayList<UserModel> getByPriority(Integer priority) {
    return userRepository.findByUserpriority(priority);
  }

  public boolean deleteUser(Long id) {
    try {
      userRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
