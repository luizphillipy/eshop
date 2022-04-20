package edu.miu.cs.cs425.eshop.service;

import edu.miu.cs.cs425.eshop.model.Product;
import edu.miu.cs.cs425.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
    public Product findProductById(Long productId){
        return productRepository.findById(productId).orElse(null);
    }
}
