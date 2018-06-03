package com.nastyair.project.jianshublog.repository;

import com.nastyair.project.jianshublog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
