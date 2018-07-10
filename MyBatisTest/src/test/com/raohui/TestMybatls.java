package com.raohui;

import com.raohui.mapper.StudentMapper;
import com.raohui.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class TestMybatls {
    SqlSession session = null;

    @Before
    public void testBefore() {
        try {
            // 读取配置信息
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            // 选择不同的环境
            String env = "development";
            SqlSessionFactory factory = builder.build(inputStream, env);
            // 产生SqlSession对象
            session = factory.openSession();
            System.out.println(session);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @After
    public void testAfter() {
        if (session != null) {
            session.close();
        }
    }

    @Test
    public void test() {
        // 获取映射对象
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        // 获取id为1的账户
        Student student = studentMapper.selectByPrimaryKey("20111");
        System.out.println(student);
        Student student1 = new Student("20119","jiayoua",18,"man");
        studentMapper.insertSelective(student1);
        List<Student> students = studentMapper.selectAll();
        for(Student s:students){
            System.out.println(s);
        }
        List<String> snos = new ArrayList<>();
        snos.add("20111");
        snos.add("20112");
        snos.add("20119");

        List<Student> students1 = studentMapper.selectAllInSnos(snos);
        for(Student s:students1){
            System.out.println(s);
        }
    }

}
