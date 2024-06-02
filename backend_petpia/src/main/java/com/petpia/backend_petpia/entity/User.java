package com.petpia.backend_petpia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email", unique = true)
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "Phone_Number")
    private String phoneNumber;

    @Column(name = "Grade")
    private String grade;

    // Getters and Setters
}
