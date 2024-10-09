package ecommerce.tshopping.example.ecommerce_tshopping.services;

import java.util.List;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateProductDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;

public interface ProductService {

  List<Product> findAllProduct();

  Product createProduct(CreateProductDTO createProductDTO);

}
