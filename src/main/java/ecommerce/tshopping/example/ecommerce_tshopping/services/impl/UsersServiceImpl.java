package ecommerce.tshopping.example.ecommerce_tshopping.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateUsersDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Users;
import ecommerce.tshopping.example.ecommerce_tshopping.repository.UsersRepository;
import ecommerce.tshopping.example.ecommerce_tshopping.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

  private final UsersRepository usersRepository;

  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  public List<Users> findAll() {
    List<Users> users = usersRepository.findAll();
    usersRepository.findAll();
    if (users != null && !users.isEmpty()) {
      return users;
    } else {
      return List.of();
    }
  }

  public Users createUser(CreateUsersDTO createUsersDTO) {
    Users user = new Users();
    user.setName(createUsersDTO.name());
    user.setEmail(createUsersDTO.email());
    user.setPassword(createUsersDTO.password());

    return usersRepository.save(user);
  }
}
