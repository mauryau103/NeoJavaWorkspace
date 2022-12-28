package com.neosoft.spring.jdbctemp;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {
    void setDataSource(DataSource dataSource);
    List<Student> listStudent();
    void create(int id,String name,String course);
    void update(int id,String name);
    void delete(int id);
}
