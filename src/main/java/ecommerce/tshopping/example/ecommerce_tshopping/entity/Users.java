package ecommerce.tshopping.example.ecommerce_tshopping.entity;

import java.time.Instant;
import java.util.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_users")
public class Users {
  @Id
  @Column(name = "client_id")
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID clientId;

  @Column(name = "name")
  private String name;

  private String email;

  private String password;

  private String cpf;

  private String cep;

  @Column(name = "createTimestamp")
  @CreationTimestamp
  private Instant createTimestamp;

  @Column(name = "updateTimestamp")
  @UpdateTimestamp
  private Instant updateTimestamp;

  @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonManagedReference
  private List<Product> product;

  public Users(UUID clientId, String name, String email, String password, String cpf, String cep,
      Instant createTimestamp, Instant updateTimestamp, List<Product> product) {
    this.clientId = clientId;
    this.name = name;
    this.email = email;
    this.password = password;
    this.cpf = cpf;
    this.cep = cep;
    this.createTimestamp = createTimestamp;
    this.updateTimestamp = updateTimestamp;
    this.product = product;
  }

  public Users() {
  }

  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Instant getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Instant createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public Instant getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(Instant updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
  }

}
