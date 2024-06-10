package com.astratech.simple_api_2.services;

import com.astratech.simple_api_2.models.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductModel saveProduct(ProductModel productModel);
    ProductModel updateProduct(Long id, ProductModel productModel);
    List<ProductModel> getProduct();
    Optional<ProductModel> findById(Long id);
    void deleteDataProduct(Long id);
}
