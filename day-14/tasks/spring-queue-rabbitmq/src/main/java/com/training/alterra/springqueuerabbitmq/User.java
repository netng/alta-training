package com.training.alterra.springqueuerabbitmq;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "users")
@EntityListeners(AutoCloseable.class)
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String email;
    private String password;
}
