package com.thinking.relationship;

import com.thinking.domain.Customer;
import com.thinking.domain.LinkMan;
import com.thinking.domain.Role;
import com.thinking.domain.User;
import com.thinking.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RelationshipTest {

    @Test
    public void test(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("广告公司");
        customer.setCust_source("网络");
        customer.setCust_industry("互联网");
        customer.setCust_level("VIP");
        customer.setCust_linkman("张三");
        customer.setCust_mobile("123456");
        customer.setCust_phone("13523456786");

        LinkMan linkMan = new LinkMan();
        linkMan.setLkm_name("余助理");
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("小王");

        //建立关系
        customer.getLinkMens().add(linkMan);
        customer.getLinkMens().add(linkMan1);
        linkMan.setCustomer(customer);
        linkMan1.setCustomer(customer);

        session.save(customer);
        session.save(linkMan);
        session.save(linkMan1);

        tx.commit();

        session.close();



    }

    @Test
    public void test1(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("广告公司");
        customer.setCust_source("网络");
        customer.setCust_industry("互联网");
        customer.setCust_level("VIP");
        customer.setCust_linkman("李四");
        customer.setCust_mobile("123456");
        customer.setCust_phone("13523456786");

        LinkMan linkMan = new LinkMan();
        linkMan.setLkm_name("王五");

        //建立关系
        customer.getLinkMens().add(linkMan);
        linkMan.setCustomer(customer);

        session.save(customer);
//        session.save(linkMan);

        tx.commit();

        session.close();

    }

    @Test
    public void test2(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Customer customer = session.get(Customer.class, 1l);

        session.delete(customer);

        tx.commit();

        session.close();

    }

    @Test
    public void saveUserAndRole(){

        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setUser_name("张三");
        user.setUser_code("1");
        user.setUser_password("123");
        user.setUser_state(new Character('a'));

        User user1 = new User();
        user1.setUser_name("李四");
        user1.setUser_code("2");
        user1.setUser_password("456");
        user1.setUser_state(new Character('b'));

        Role role = new Role();
        role.setRole_name("前台");
        Role role1 = new Role();
        role1.setRole_name("人事");
        Role role2 = new Role();
        role2.setRole_name("助理");

        user.getRoles().add(role);
        user.getRoles().add(role1);

        user1.getRoles().add(role1);
        user1.getRoles().add(role2);

        role.getUsers().add(user);
        role1.getUsers().add(user);
        role1.getUsers().add(user1);
        role2.getUsers().add(user1);

        session.save(user);
        session.save(user1);
        session.save(role);
        session.save(role1);
        session.save(role2);

        tx.commit();


    }

    @Test
    public void innerJoinTest(){

        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Customer> list = session.createQuery("select  distinct c from Customer c inner join fetch c.linkMens").list();

        for (Customer customer : list){
            System.out.println(customer);
        }

        tx.commit();
    }

}
