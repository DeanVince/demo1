package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Vince
 * @Date: 2020-01-07 12:25
 * @Description:
 */

public interface Dao extends JpaRepository<EncryptionInfo,Integer> {

    @Query(value = "select top 10 * from EncryptionInfo b", nativeQuery = true)
    List<EncryptionInfo> findTop10();
}
