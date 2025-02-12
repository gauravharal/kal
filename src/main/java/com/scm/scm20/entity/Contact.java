package com.scm.scm20.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {

     @Id
     private String id;

     private String contactName;

     private String contactEmail;

     private String contactPhone;

     private String contactAddress;
    
     private String contactPic;

     @Column(columnDefinition = "TEXT")
     private String description;

     private boolean favourite=false;

     private String weblink;

     private String lindinlink;

  @ManyToOne
  private User user;

}
