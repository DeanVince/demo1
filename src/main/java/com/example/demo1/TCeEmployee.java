package com.example.demo1;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Vince
 * @Date: 2020-01-07 17:56
 * @Description:
 */
@Entity
@Data
@Table(name = "tCeEmployee")
public class TCeEmployee {
    @Id
    private Integer empId;
    private String empName;
}
