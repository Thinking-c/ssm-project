package com.thinking.test;

import com.thinking.domain.Customer;
import com.thinking.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class HQLCriteriaTest {

    @Test
    public void findAll() {

//        Session session = HibernateUtils.openSession();
        Session session = HibernateUtils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        CriteriaQuery<Customer> query = session.getCriteriaBuilder().createQuery(Customer.class);
        query.from(Customer.class);
        List<Customer> resultList = session.createQuery(query).getResultList();

        System.out.println(resultList);

    }

    @Test
    public void conditionSelect() {

        //1.获得session
        Session session = HibernateUtils.openSession();
        //2.开启事物
        Transaction tx = session.beginTransaction();
        //3.创建CriteriaBuilder,用于创建查询
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        //4.创建CriteriaQuery,用于设置查询语句的信息
        CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
        //4.定义查询的From子句中能出现的类型,也可以用root.get()获取具体的某个属性
        Root<Customer> root = criteriaQuery.from(Customer.class);
        //5.设置WHERE字句的条件
        criteriaQuery.select(root);
//        criteriaQuery.where(criteriaBuilder.equal(root.get("cust_name"), "广告公司1"));
        criteriaQuery.where(criteriaBuilder.like(root.<String>get("cust_name"), "%" +"广告公司" + "%"));
        //6.设置排序标准与排序方式
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("cust_id")));
        //7.创建Query对象
        Query<Customer> query = session.createQuery(criteriaQuery);
        //8.获取结果集list
        List<Customer> list = query.list();

        System.out.println(list);

    }


}
