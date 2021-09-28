package com.sebastian.staybooking.repository;

import com.sebastian.staybooking.model.Stay;
import com.sebastian.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StayRepository extends JpaRepository <Stay, Long>{
    List<Stay> findByHost(User user);
}
// 为什么要继承 JpaRepository？
// 继承后就有了一些操作数据库的基本方法