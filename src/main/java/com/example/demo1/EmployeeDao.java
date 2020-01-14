package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: Vince
 * @Date: 2020-01-07 12:25
 * @Description:
 */

public interface EmployeeDao extends JpaRepository<TCeEmployee,Integer> {


}
