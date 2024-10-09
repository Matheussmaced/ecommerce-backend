package ecommerce.tshopping.example.ecommerce_tshopping.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateProductDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;
import ecommerce.tshopping.example.ecommerce_tshopping.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> findProductById(@PathVariable("id") String id) {
    var getId = productService.geProduct(id);

    return ResponseEntity.ok(getId);
  }

  @PostMapping("/{id}")
  public ResponseEntity<Product> createProduct(@PathVariable("id") String id,
      @RequestBody CreateProductDTO CreateProductDTO) {
    var createProduct = productService.createProduct(id, CreateProductDTO);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(createProduct.getId()).toUri();

    return ResponseEntity.created(location).body(createProduct);
  }
}
