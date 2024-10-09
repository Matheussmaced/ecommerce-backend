package ecommerce.tshopping.example.ecommerce_tshopping.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ecommerce.tshopping.example.ecommerce_tshopping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
