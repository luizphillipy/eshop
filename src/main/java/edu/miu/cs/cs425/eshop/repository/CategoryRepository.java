package edu.miu.cs.cs425.eshop.repository;

import edu.miu.cs.cs425.eshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
