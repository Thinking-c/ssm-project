package com.thinking.test;

import com.thinking.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/11
 */
public class HibernateTest {

    @Test
    public void demo1() {
        //1.加载配置文件
        Configuration cfg = new Configuration().configure();
        //2.创建一个SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        //3.创建session对象
        Session session = sessionFactory.openSession();
        //4.开启事物
        Transaction tx = session.beginTransaction();
        //5.执行相关操作
        Customer customer = new Customer();
        customer.setCust_name("张三");
        customer.setCust_source("网络");
        session.save(customer);
        //6.提交事物
        tx.commit();
        //7.释放资源
        session.close();

    }

    @Test
    public void demo2() {
        //1.加载配置文件
        Configuration cfg = new Configuration().configure();
        //2.创建一个SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        //3.创建session对象
        Session session = sessionFactory.openSession();
        //4.开启事物
        Transaction tx = session.beginTransaction();
        //5.执行相关操作
        Customer customer = new Customer();
        customer.setCust_id(3L);
        customer.setCust_name("张三");
        customer.setCust_source("网络");
        session.delete(customer);
        //6.提交事物
        tx.commit();
        //7.释放资源
        session.close();

    }

    @Test
    public void find() {
        //1.加载配置文件
        Configuration cfg = new Configuration().configure();
        //2.创建一个SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        //3.创建session对象
        Session session = sessionFactory.openSession();
        //4.开启事物
        Transaction tx = session.beginTransaction();
        //5.执行相关操作
        Customer customer = session.get(Customer.class, 4L);
        System.out.println(customer.getCust_name());
        //6.提交事物
        tx.commit();
        //7.释放资源
        session.close();

    }

    @Test
    public void insert() {
        //1.加载配置文件
        Configuration cfg = new Configuration().configure();
        //2.创建一个SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        //3.创建session对象
        Session session = sessionFactory.openSession();
        //4.开启事物
        Transaction tx = session.beginTransaction();
        //5.执行相关操作
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer();
            customer.setCust_name("广告公司" + i);
            customer.setCust_source("网络");
            customer.setCust_industry("互联网");
            customer.setCust_level("VIP");
            customer.setCust_linkman("张三" + i);
            customer.setCust_mobile("123456");
            customer.setCust_phone("13523456786");
            session.save(customer);
        }
        //6.提交事物
        tx.commit();
        //7.释放资源
        session.close();

    }


}
