package ecommerce.tshopping.example.ecommerce_tshopping.services.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateProductDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Users;
import ecommerce.tshopping.example.ecommerce_tshopping.repository.ProductRepository;
import ecommerce.tshopping.example.ecommerce_tshopping.repository.UsersRepository;
import ecommerce.tshopping.example.ecommerce_tshopping.services.ProductService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final UsersRepository usersRepository;

  public ProductServiceImpl(ProductRepository productRepository, UsersRepository usersRepository) {
    this.productRepository = productRepository;
    this.usersRepository = usersRepository;
  }

  @Override
  public Product geProduct(String id) {
    var productId = UUID.fromString(id);

    return productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Product not found"));
  }

  @Override
  public Product createProduct(String id, CreateProductDTO createProductDTO) {
    var userId = UUID.fromString(id);

    Users user = usersRepository.findById(userId)
        .orElseThrow(() -> new EntityNotFoundException("User not found"));

    Product product = new Product();

    product.setNameImage(createProductDTO.nameImage());
    product.setProductName(createProductDTO.productName());
    product.setSize(createProductDTO.size());
    product.setValue(createProductDTO.value());

    product.setUsers(user);

    productRepository.save(product);
    usersRepository.save(user);

    return product;
  }
}
