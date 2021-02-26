package com.tata.assignment.business;

import com.tata.assignment.dao.ProductDao;
import com.tata.assignment.dao.ProductDaoImpl;
import com.tata.assignment.entities.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductOps {
    ProductDao productDao = new ProductDaoImpl();

    public void displayProducts() throws SQLException {
        List<Product> list = productDao.display();
        if (list == null)
            System.out.println("Empty Product");
        else
            for (Product product : list) {
                System.out.println(product.getProductId() + " "+ product.getProductName()+ " "+product.getPrice()+" "+product.getQuantity() + " " + product.getDate());
            }
    }
}
