package com.example.demo1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.util.Optional;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private Dao dao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void contextLoads() {
        Optional<EncryptionInfo> info  = dao.findById(12721);
        System.out.println(info.get());

    }
    @Test
    void pager(){
        Pageable pageable = PageRequest.of(12,1000);

        for (EncryptionInfo encryptionInfo : dao.findAll(pageable)) {
            System.out.println(encryptionInfo);
        }

    }

    @Test

    void testEmployee(){
        for (TCeEmployee tCeEmployee : employeeDao.findAll(PageRequest.of(1, 10))) {
            System.out.println(tCeEmployee);
        }

    }
}
