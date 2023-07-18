package com.users.userscrud.models;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Long id;
  private String username;
  private String useremail;
  private Integer userpriority;


  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getUseremail() {
    return useremail;
  }
  public void setUseremail(String useremail) {
    this.useremail = useremail;
  }
  public Integer getUserpriority() {
    return userpriority;
  }
  public void setUserpriority(Integer userpriority) {
    this.userpriority = userpriority;
  }
}
