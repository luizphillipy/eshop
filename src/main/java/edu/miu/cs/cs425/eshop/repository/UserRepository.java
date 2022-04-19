package edu.miu.cs.cs425.eshop.repository;

import edu.miu.cs.cs425.eshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
