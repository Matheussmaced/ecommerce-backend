package ecommerce.tshopping.example.ecommerce_tshopping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

  @RequestMapping("/{name}")
  public ResponseEntity<String> test(@PathVariable String name) {
    return ResponseEntity.ok("Nome: " + name);
  }

}
