package com.project.product.service;

import com.project.product.entity.Product;
import com.project.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long productId){
        return productRepository.findById(productId).orElseThrow( () -> new RuntimeException("Product not found"));
    }

    public Product updateProduct(Long productId,Product product){
        Product newProduct = productRepository.findById(productId).orElseThrow( () -> new RuntimeException("Product Not found"));
        newProduct.setProductName(product.getProductName());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantity(product.getQuantity());

        return productRepository.save(newProduct);
    }

    public String deleteProduct(Long productId){
        productRepository.deleteById(productId);
        return "Product with " + productId + " is deleted from database successfully";
    }
}
