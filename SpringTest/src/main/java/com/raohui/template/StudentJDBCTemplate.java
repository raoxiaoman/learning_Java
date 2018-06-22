package com.raohui.template;

import com.raohui.Mapper.StudentMapper;
import com.raohui.dao.StudentDao;
import com.raohui.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
@Component("StudentDao")
public class StudentJDBCTemplate implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    //使用编程事务被注解代替
//    private PlatformTransactionManager transactionManager;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
//    public void setTransactionManager(PlatformTransactionManager transactionManager) {
//        this.transactionManager = transactionManager;
//    }

    @Override
    public void create(String sno, String sname, Integer sage, String sex) {
        //使用编程事务
//        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
//        try{
        String sql = "insert into student(sno,sname,sage,sex) value(?,?,?,?)";
        jdbcTemplate.update(sql, sno, sname, sage, sex);
        System.out.println("插入一条记入,sno=" + sno);
//        测试是否真的回滚！
//            throw  new NullPointerException();
//        使用编程事务
//            transactionManager.commit(status);
//        }catch (DataAccessException e){
//            System.out.println("error rolling back");
        //使用编程事务
//            transactionManager.rollback(status);
//        }
    }

    @Override
    public Student getStudent(String sno) {
        String sql = "select * from student where sno = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{sno}, new StudentMapper());
    }

    @Override
    public List<Student> listsStudent() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, new StudentMapper());
    }

    @Override
    public void delete(String sno) {
        //使用xml配置事务
//        try{
        String sql = "delete from student where sno = ?";
        jdbcTemplate.update(sql, sno);
        System.out.println("删除一条记入,sno=" + sno);
//        }catch (DataAccessException e){
//            System.out.println("error rolling back");
//        }
    }

    @Override
    public void update(String sno, String sname, Integer sage, String sex) {
        //使用xml配置事务
//        try{
        String sql = "update student set sage = ?,sname = ? where  sno = ?";
        jdbcTemplate.update(sql, sage, sname, sno);
        System.out.println("更新一条记入,sno=" + sno);
//        }catch (DataAccessException e){
//            System.out.println("error rolling back");
//        }
    }
}
