package ecommerce.tshopping.example.ecommerce_tshopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateUsersDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Users;

@Service
public interface UsersService {

  List<Users> findAll();

  Users createUser(CreateUsersDTO createUsersDTO);

}
