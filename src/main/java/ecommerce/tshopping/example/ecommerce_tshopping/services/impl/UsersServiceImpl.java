package ecommerce.tshopping.example.ecommerce_tshopping.services.impl;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import ecommerce.tshopping.example.ecommerce_tshopping.repository.UsersRepository;
import ecommerce.tshopping.example.ecommerce_tshopping.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
  List<User> users;

  private final UsersRepository usersRepository;

  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  public List<User> findAll() {
    usersRepository.findAll();
    if (users != null) {
      return users;
    } else {
      return List.of();
    }
  }
}
