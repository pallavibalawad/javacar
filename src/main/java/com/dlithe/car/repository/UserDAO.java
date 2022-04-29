package com.dlithe.car.repository;

import com.dlithe.car.entity.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO  extends JpaRepository<User, Integer> {

}
