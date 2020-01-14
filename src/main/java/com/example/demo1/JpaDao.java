package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Vince
 * @Date: 2020-01-07 18:03
 * @Description:
 */
public interface JpaDao extends JpaRepository<EncryptionInfo,Integer> {

}
