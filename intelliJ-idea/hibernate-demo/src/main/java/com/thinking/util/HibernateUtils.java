package com.thinking.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/11
 */
public class HibernateUtils {

    private static final Configuration CONFIGURATION;
    private static final SessionFactory SESSION_FACTORY;

    static {
        CONFIGURATION = new Configuration().configure();
        SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
    }

    public static Session openSession(){
        return SESSION_FACTORY.openSession();
    }

    public static Session getCurrentSession(){
        return SESSION_FACTORY.getCurrentSession();
    }
}
