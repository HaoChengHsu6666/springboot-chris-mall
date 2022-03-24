package com.chrishsu.springbootchrismall.rowmapper;

import com.chrishsu.springbootchrismall.constant.ProductCategory;
import com.chrishsu.springbootchrismall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {


    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));

        //從資料庫取屬性值，轉成字串，再將取得字串的變數比對到寫好的Enum常數值，最後將此常數值傳入set方法中
//        String categoryStr = resultSet.getString("category");
//        ProductCategory category = ProductCategory.valueOf(categoryStr);
//        product.setCategory(category);

        //簡化寫法與上段同意
        product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));

        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreatedDate(resultSet.getDate("created_date"));
        product.setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
