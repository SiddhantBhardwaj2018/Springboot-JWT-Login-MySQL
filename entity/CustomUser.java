package com.siddhantbhardwaj.jwtspringbootmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class CustomUser {

    @Id
    private Integer id;
    private String username;
    private String password;
    private String email;

}
