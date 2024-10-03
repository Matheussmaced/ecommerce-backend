package ecommerce.tshopping.example.ecommerce_tshopping.services;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {

  List<User> findAll();

}
