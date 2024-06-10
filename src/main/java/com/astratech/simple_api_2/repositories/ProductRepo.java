package com.astratech.simple_api_2.repositories;

import com.astratech.simple_api_2.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long> {
}
