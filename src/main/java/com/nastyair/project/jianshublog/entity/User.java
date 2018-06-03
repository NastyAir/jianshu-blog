package com.nastyair.project.jianshublog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class User {
    @GeneratedValue
    private Integer id;
    @Id
    private String userId;
    private String username;
    private String password;
    private String phoneNumber;
    private Date createTime;
    private Date updateTime;
    private String description;


}
