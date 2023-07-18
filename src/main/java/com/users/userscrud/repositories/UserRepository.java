package com.users.userscrud.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.userscrud.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
  public abstract ArrayList<UserModel> findByUserpriority(Integer userPriority);
}
