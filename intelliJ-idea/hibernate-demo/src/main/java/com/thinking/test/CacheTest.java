package com.thinking.test;

import com.thinking.domain.Customer;
import com.thinking.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/12
 */
public class CacheTest {

    @Test
    public void cacheTest(){

        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();
        Customer customer = session.get(Customer.class, 4L);
        System.out.println(customer);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Customer customer1 = session.get(Customer.class, 4L);
        System.out.println(customer1);

        System.out.println(customer == customer1);
        session.close();

    }

    @Test
    public void snapshotTest(){
        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();
        Customer customer = session.get(Customer.class, 4L);
        customer.setCust_name("李四");

        tx.commit();
        session.close();


    }



}
