package dev.varev.managementsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String emailAddress;

    private String password;

    public enum Type {
        EMPLOYEE,
        BROKER,
        CLIENT
    }

}
