package com.thinking.test;

import com.thinking.domain.Customer;
import com.thinking.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.junit.Test;

import java.util.List;

public class SQLTest {

    @Test
    public void sqlQuery(){
        Session session = HibernateUtils.openSession();
        NativeQuery sqlQuery = session.createSQLQuery("SELECT * FROM cst_customer");
        sqlQuery.addEntity(Customer.class);
        List<Customer> list = sqlQuery.list();
        System.out.println(list);

    }


}
