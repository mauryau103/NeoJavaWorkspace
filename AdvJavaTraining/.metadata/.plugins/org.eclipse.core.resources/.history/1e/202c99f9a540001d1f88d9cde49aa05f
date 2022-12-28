package com.neosoft.spring.jdbctemp;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class StudentDaoImpl implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        jdbcTemplate=new JdbcTemplate();
    }

    @Override
    public List<Student> listStudent() {
        return null;
    }

    @Override
    public void create(int id, String name, String course) {
        String qr="insert into student_data values(?,?,?)";
        Object[] input=new Object[]{id,name,course};
        jdbcTemplate.update(qr,input);

    }

    @Override
    public void update(int id, String name) {

    }

    @Override
    public void delete(int id) {

    }
}