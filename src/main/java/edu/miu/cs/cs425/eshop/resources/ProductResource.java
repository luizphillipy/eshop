package edu.miu.cs.cs425.eshop.resources;

import edu.miu.cs.cs425.eshop.model.Product;
import edu.miu.cs.cs425.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/products"})
public class ProductResource {
    @Autowired
    private ProductService productService;
    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productService.findAllProducts();

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{productId}")
    public ResponseEntity<Product> findProductById(@PathVariable Long productId){
        return ResponseEntity.ok().body(productService.findProductById(productId));
    }
}
