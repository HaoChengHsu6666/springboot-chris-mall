package com.chrishsu.springbootchrismall.dao;

import com.chrishsu.springbootchrismall.dto.ProductRequest;
import com.chrishsu.springbootchrismall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId,ProductRequest productRequest);

}
