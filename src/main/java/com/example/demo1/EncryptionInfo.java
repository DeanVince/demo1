package com.example.demo1;

import lombok.Data;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;

/**
 * @Author: Vince
 * @Date: 2020-01-07 13:00
 * @Description:
 */
@Entity
@Data
@Table(name="encryptioninfo", schema = "dbo", catalog = "lhjy")
public class EncryptionInfo {
    @Id
    private Integer id;
//    private Integer empId;
    private String encryptionId;
    private String encryptionPhone;
    @ManyToOne(optional=false)
    @JoinColumn(name="emp_id",referencedColumnName="empId")
    private TCeEmployee employee;
}
