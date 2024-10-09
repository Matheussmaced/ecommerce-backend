package ecommerce.tshopping.example.ecommerce_tshopping.services;

import org.springframework.stereotype.Service;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateProductDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;

@Service
public interface ProductService {

  Product geProduct(String id);

  Product createProduct(String id, CreateProductDTO createProductDTO);

}
