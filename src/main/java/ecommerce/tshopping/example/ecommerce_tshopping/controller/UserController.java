package ecommerce.tshopping.example.ecommerce_tshopping.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ecommerce.tshopping.example.ecommerce_tshopping.services.UsersService;

@Controller
@RequestMapping("/users")
public class UserController {
  private final UsersService usersService;

  public UserController(UsersService usersService) {
    this.usersService = usersService;
  }

  @RequestMapping("/all")
  public ResponseEntity<List<User>> findAll() {
    var users = usersService.findAll();

    return ResponseEntity.ok(users);
  }

}
