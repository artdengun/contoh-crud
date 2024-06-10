package com.astratech.simple_api_2.usecases;

import com.astratech.simple_api_2.models.ProductModel;
import com.astratech.simple_api_2.repositories.ProductRepo;
import com.astratech.simple_api_2.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductUsecase implements ProductService {

    @Autowired
    private ProductRepo productRepository;

    public ProductModel saveProduct(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public List<ProductModel> getProduct() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id);
    }

    public ProductModel updateProduct(Long id, ProductModel productModel) {
        if (productRepository.existsById(id)) {
            productModel.setId(id); // assuming the model has a setId method
            return productRepository.save(productModel);
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }

    public void deleteDataProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }

}
