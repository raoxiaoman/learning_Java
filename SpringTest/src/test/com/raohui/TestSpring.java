package com.raohui;

import com.raohui.dao.StudentDao;
import com.raohui.model.DITest;
import com.raohui.model.HelloWorld;
import com.raohui.model.SingleTypeTest;
import com.raohui.model.Student;
import com.raohui.pointcut.AopTest;
import com.raohui.template.StudentJDBCTemplate;
import com.raohui.tool.CustomEventPublisher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class TestSpring {
    private ApplicationContext context = null;
    public TestSpring(){
        context = new FileSystemXmlApplicationContext("D:\\share\\code\\learning_Java\\SpringTest\\src\\main\\resources\\beans.xml");
//        context = new XmlWebApplicationContext();
//        context = new ClassPathXmlApplicationContext("beans.xml");
    }
    private void test1(){
        HelloWorld world = (HelloWorld) context.getBean("helloWorld");
        System.out.println(world);

        SingleTypeTest typeTest = (SingleTypeTest) context.getBean("singleTest");
        typeTest.setMessage("single !!!!");
        System.out.println(typeTest.getMessage());
        SingleTypeTest typeTest1 = (SingleTypeTest) context.getBean("singleTest");
        System.out.println(typeTest1.getMessage());
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
    private  void test2(){
        ((ClassPathXmlApplicationContext) context).start();
        DITest diTest = (DITest) context.getBean("diTest");
        System.out.println(diTest.getHelloWorld1());
        System.out.println(diTest.getHelloWorld2());
        System.out.println(diTest.getLists());
        System.out.println(diTest.getSets());
        System.out.println(diTest.getMaps());
        System.out.println(diTest.getProperties());
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        customEventPublisher.publish();
        ((ClassPathXmlApplicationContext) context).stop();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
    private void test3(){
        AopTest aopTest = (AopTest) context.getBean("aopTest");
        System.out.println(aopTest.getName());
        System.out.println(aopTest.getAge());
        aopTest.printThrowsException();
    }
    private void test4(){
        StudentDao studentJDBCTemple = (StudentDao) context.getBean("studentJDBCTemple");
        studentJDBCTemple.create("20118","wudi",20,"man");
        List<Student> studentList = studentJDBCTemple.listsStudent();
        for (Student s:studentList){
            System.out.println(s);
        }
        studentJDBCTemple.delete("20118");
        studentList = studentJDBCTemple.listsStudent();
        for (Student s:studentList){
            System.out.println(s);
        }
    }

    @Test
    public void test(){
        test4();
    }
}
