package com.chrishsu.springbootchrismall.service;

import com.chrishsu.springbootchrismall.dto.ProductRequest;
import com.chrishsu.springbootchrismall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
