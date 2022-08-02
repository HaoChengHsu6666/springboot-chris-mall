package com.chrishsu.springbootchrismall.service.impl;

// import com.chrishsu.springbootchrismall.constant.ProductCategory;
import com.chrishsu.springbootchrismall.dao.ProductDao;
import com.chrishsu.springbootchrismall.dto.ProductQueryParams;
import com.chrishsu.springbootchrismall.dto.ProductRequest;
import com.chrishsu.springbootchrismall.model.Product;
import com.chrishsu.springbootchrismall.model.ProductDto;
import com.chrishsu.springbootchrismall.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDao productDao ;


    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest) ;
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }

    @Override
    public ProductDto getOneProductNameAndPriceById(Integer id) {
        ProductDto productDto = new ProductDto();
        Product product = productService.getProductById(id);
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    @Override
    public List<ProductDto> getAllProductNameAndPrice(ProductQueryParams productQueryParams) {
        List<ProductDto> dtoList = new ArrayList<>();
        List<Product> productList = productService.getProducts(productQueryParams);
        for (Product product : productList) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product, productDto);
            dtoList.add(productDto);
        }
        return dtoList;
    }


}
