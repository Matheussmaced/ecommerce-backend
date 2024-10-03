package ecommerce.tshopping.example.ecommerce_tshopping.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

  @Column(name = "createTimestamp")
  @CreationTimestamp
  private Instant createTimestamp;

  @Column(name = "updateTimestamp")
  @UpdateTimestamp
  private Instant updateTimestamp;

  public Users(UUID clientId, String name, String email, String password, Instant createTimestamp,
      Instant updateTimestamp) {
    this.clientId = clientId;
    this.name = name;
    this.email = email;
    this.password = password;
    this.createTimestamp = createTimestamp;
    this.updateTimestamp = updateTimestamp;
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

}
