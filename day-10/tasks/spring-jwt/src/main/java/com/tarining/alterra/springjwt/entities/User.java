package com.tarining.alterra.springjwt.entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlan
    private String name;
    private String phone;
    private String email;
    private String password;
}
