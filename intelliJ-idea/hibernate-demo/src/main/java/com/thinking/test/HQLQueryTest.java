package com.thinking.test;

import com.thinking.domain.Customer;
import com.thinking.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/12
 */
public class HQLQueryTest {

    @Test
    public void findAll(){
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery("from Customer");
        List<Customer> list = query.list();
        System.out.println(list);

    }

    @Test
    public void conditionSelect1(){
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery("from Customer where cust_name = ?0");
        query.setParameter(0, "广告公司1");
        List list = query.list();
        System.out.println(list);

    }

    @Test
    public void conditionSelect2(){
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery("from Customer c where c.cust_name = :name");
        query.setParameter("name","广告公司2");
        List list = query.list();
        System.out.println(list);
        System.out.println(list.size());


    }

    @Test
    public void conditionSelect3(){
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery("from Customer");
        query.setFirstResult(3);
        query.setMaxResults(10);
        List list = query.list();
        System.out.println(list);
        System.out.println(list.size());
    }


}
