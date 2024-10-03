package ecommerce.tshopping.example.ecommerce_tshopping.controller;

import java.util.List;
import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ecommerce.tshopping.example.ecommerce_tshopping.DTO.CreateUsersDTO;
import ecommerce.tshopping.example.ecommerce_tshopping.entity.Users;
import ecommerce.tshopping.example.ecommerce_tshopping.services.UsersService;

@Controller
@RequestMapping("/users")
public class UserController {
  private final UsersService usersService;

  public UserController(UsersService usersService) {
    this.usersService = usersService;
  }

  @RequestMapping("/all")
  public ResponseEntity<List<Users>> findAll() {
    var users = usersService.findAll();

    return ResponseEntity.ok(users);
  }

  @PostMapping
  public ResponseEntity<Users> createUser(@RequestBody CreateUsersDTO createUsersDTO) {
    var createUsers = usersService.createUser(createUsersDTO);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(createUsers.getClientId()).toUri();

    return ResponseEntity.created(location).body(createUsers);
  }
}
