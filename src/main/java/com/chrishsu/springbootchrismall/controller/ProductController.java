package com.chrishsu.springbootchrismall.controller;


import com.chrishsu.springbootchrismall.constant.ProductCategory;
import com.chrishsu.springbootchrismall.dto.ProductQueryParams;
import com.chrishsu.springbootchrismall.dto.ProductRequest;
import com.chrishsu.springbootchrismall.model.Product;
import com.chrishsu.springbootchrismall.model.ProductDto;
import com.chrishsu.springbootchrismall.service.ProductService;
import com.chrishsu.springbootchrismall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Validated //為了使@Max() @Min()生效
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Page<Product>> getProducts(
            // 查詢條件 Filtering  //沒傳值就是null
            @RequestParam(required = false ) ProductCategory category,
            @RequestParam(required = false) String search,

            //排序 Sorting
            @RequestParam(defaultValue = "created_date") String orderBy,
            @RequestParam(defaultValue = "desc") String sort,

            //分頁 Pagination
            //取?筆數
            @RequestParam(defaultValue = "5") @Max(1000) @Min(0) Integer limit,
            //從第?筆開始取
            @RequestParam(defaultValue = "0") @Min(0) Integer offset
    ){

        ProductQueryParams productQueryParams = new ProductQueryParams();
        productQueryParams.setCategory(category);
        productQueryParams.setSearch(search);
        productQueryParams.setOrderBy(orderBy);
        productQueryParams.setSort(sort);
        productQueryParams.setLimit(limit);
        productQueryParams.setOffset(offset);

        //取得 product list
        List<Product> productList = productService.getProducts(productQueryParams);

        //取得 product 總數
        Integer total = productService.countProduct(productQueryParams);

        //分頁
        Page<Product> page = new Page<>();
        page.setLimit(limit);
        page.setOffset(offset);
        page.setTotal(total);
        page.setResults(productList);

        return ResponseEntity.status(HttpStatus.OK).body(page);
    }

    @GetMapping("/products/nameAndPrice")
    public ResponseEntity<Page<ProductDto>> getAllProductNameAndPrice(
            // 查詢條件 Filtering  //沒傳值就是null
    @RequestParam(required = false ) ProductCategory category,
    @RequestParam(required = false) String search,

    //排序 Sorting
    @RequestParam(defaultValue = "created_date") String orderBy,
    @RequestParam(defaultValue = "desc") String sort,

    //分頁 Pagination
    //取?筆數
    @RequestParam(defaultValue = "5") @Max(1000) @Min(0) Integer limit,
    //從第?筆開始取
    @RequestParam(defaultValue = "0") @Min(0) Integer offset
    ) {


        ProductQueryParams productQueryParams = new ProductQueryParams();
        productQueryParams.setCategory(category);
        productQueryParams.setSearch(search);
        productQueryParams.setOrderBy(orderBy);
        productQueryParams.setSort(sort);
        productQueryParams.setLimit(limit);
        productQueryParams.setOffset(offset);

        //取得 product list
        List<ProductDto> productList = productService.getAllProductNameAndPrice(productQueryParams);

        //取得 product 總數
        Integer total = productService.countProduct(productQueryParams);

        //分頁
        Page<ProductDto> page = new Page<>();
        page.setLimit(limit);
        page.setOffset(offset);
        page.setTotal(total);
        page.setResults(productList);

        return ResponseEntity.status(HttpStatus.OK).body(page);

    }




    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);
        if (product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,
                                                 @RequestBody @Valid ProductRequest productRequest){

        Product product = productService.getProductById(productId);

        //檢查商品若不存在就回傳404給前端
        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        //商品若有存在就更新商品
        productService.updateProduct(productId, productRequest);

        //再次查詢更新後的產品
        Product updateProduct = productService.getProductById(productId);

        //將更新後的產品物件及成功取得數據狀態回傳給前端
        return ResponseEntity.status(HttpStatus.OK).body(updateProduct);

    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){
        productService.deleteProductById(productId);

        //回傳已刪除數據狀態給前端
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @GetMapping("/products/nameAndPrice/{id}")
    public ProductDto getOneProductNameAndPriceById(@PathVariable Integer id){
        return productService.getOneProductNameAndPriceById(id);
    }




}
