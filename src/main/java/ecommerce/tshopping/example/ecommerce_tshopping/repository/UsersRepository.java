package ecommerce.tshopping.example.ecommerce_tshopping.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.tshopping.example.ecommerce_tshopping.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID> {

}
