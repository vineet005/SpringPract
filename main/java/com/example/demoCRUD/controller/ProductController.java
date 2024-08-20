package com.example.demoCRUD.controller;

import com.example.demoCRUD.model.Product;
import com.example.demoCRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{category}/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String category, @PathVariable String id){
        Product product = productService.getProduct(category, id);
        if (product != null)
            return ResponseEntity.ok(product);

        return ResponseEntity.notFound().build();
    }
}
