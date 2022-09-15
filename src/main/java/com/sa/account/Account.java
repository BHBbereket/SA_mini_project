package com.sa.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_table")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    @OneToOne(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private UserEntity user;
}
