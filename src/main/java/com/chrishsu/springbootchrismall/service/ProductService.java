package com.chrishsu.springbootchrismall.service;

// import com.chrishsu.springbootchrismall.constant.ProductCategory;
import com.chrishsu.springbootchrismall.dto.ProductQueryParams;
import com.chrishsu.springbootchrismall.dto.ProductRequest;
import com.chrishsu.springbootchrismall.model.Product;
import com.chrishsu.springbootchrismall.model.ProductDto;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    ProductDto getOneProductNameAndPriceById(Integer id);

    List<ProductDto> getAllProductNameAndPrice(ProductQueryParams productQueryParams);
}
