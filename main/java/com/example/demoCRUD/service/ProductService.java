package com.example.demoCRUD.service;

import com.example.demoCRUD.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private static final Map<String, Map<String, Product>> products = new HashMap<>();

    static {
        Map<String, Product> electronics = new HashMap<>();
        electronics.put("456", new Product("456", "Smartphone", 699, "BrandA"));
        electronics.put("789", new Product("789", "Laptop", 999, "BrandB"));

        Map<String, Product> furniture = new HashMap<>();
        furniture.put("123", new Product("123", "Chair", 49, "BrandC"));
        furniture.put("456", new Product("456", "Table", 149, "BrandD"));

        products.put("electronics", electronics);
        products.put("furniture", furniture);
    }

    public Product getProduct(String category, String id){
        Map<String, Product> categoryProduct = products.get(category);
        if (categoryProduct != null)
            return categoryProduct.get(id);

        return null;
    }
}
