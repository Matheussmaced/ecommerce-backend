package ecommerce.tshopping.example.ecommerce_tshopping.services.impl;

import java.util.List;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateProductDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;
import ecommerce.tshopping.example.ecommerce_tshopping.repository.ProductRepository;
import ecommerce.tshopping.example.ecommerce_tshopping.services.ProductService;

public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<Product> findAllProduct() {
    List<Product> products = productRepository.findAll();
    productRepository.findAll();

    if (products != null && !products.isEmpty()) {
      return products;
    } else {
      return List.of();
    }
  }

  @Override
  public Product createProduct(CreateProductDTO createProductDTO) {
    Product product = new Product();

    product.setNameImage(createProductDTO.nameImage());
    product.setProductName(createProductDTO.productName());
    product.setSize(createProductDTO.size());
    product.setValue(createProductDTO.value());

    return productRepository.save(product);
  }

}
