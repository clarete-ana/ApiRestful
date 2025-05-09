package me.dio.projetoApiRest.repository;

import me.dio.projetoApiRest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);
}
