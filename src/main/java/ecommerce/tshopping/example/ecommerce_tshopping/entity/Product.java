package ecommerce.tshopping.example.ecommerce_tshopping.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne
  @JoinColumn(name = "client_id")
  @JsonBackReference
  private Users users;

  private String nameImage;

  private String productName;

  private String value;

  private int size;

  public Product(UUID id, Users users, String nameImage, String productName, String value, int size) {
    this.id = id;
    this.users = users;
    this.nameImage = nameImage;
    this.productName = productName;
    this.value = value;
    this.size = size;
  }

  public Product() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public String getNameImage() {
    return nameImage;
  }

  public void setNameImage(String nameImage) {
    this.nameImage = nameImage;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

}
