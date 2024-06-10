package com.astratech.simple_api_2.controllers;

import com.astratech.simple_api_2.models.ProductModel;
import com.astratech.simple_api_2.usecases.ProductUsecase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping(value = "/api/v1")
public class ProductController{

    @Autowired
    private ProductUsecase productUsecase;

    @RequestMapping(value = "/simpan-product", method = RequestMethod.POST)
    public ProductModel save(@RequestBody ProductModel productModel) {
        return productUsecase.saveProduct(productModel);
    }

    @RequestMapping(value = "/ambil-product", method = RequestMethod.GET)
    public List<ProductModel> getAllProducts() {
        return productUsecase.getProduct();
    }

    @RequestMapping(value = "/ambil-product/{id}", method = RequestMethod.GET)
    public Optional<ProductModel> getProductById(@PathVariable(value = "id") Long id) {
        return productUsecase.findById(id);
    }

    @RequestMapping(value = "/update-product/{id}", method = RequestMethod.PUT)
    public ProductModel updateProduct(@PathVariable(value = "id") Long id, @RequestBody ProductModel productModel) {
        return productUsecase.updateProduct(id, productModel);
    }

    @RequestMapping(value = "/delete-product/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "id") Long id) {
        productUsecase.deleteDataProduct(id);
    }

}
