package edu.miu.cs.cs425.eshop.repository;

import edu.miu.cs.cs425.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
