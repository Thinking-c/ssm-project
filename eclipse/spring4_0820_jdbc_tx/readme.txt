什么是事务：
    逻辑上的一组操作，组成这组操作的各个单元，要么全部都成功，要么全都失败。

事物的特性：
    原子性：事物不可分割
    一致性：事物执行前后数据完整性保持一致
    隔离性：一个事物的执行不应该收到其他事物的干扰
    持久性：一旦事务结束，数据就持久化到数据库
    
不考虑隔离性依法安全性问题
    读问题
        脏读：一个事物读到另一个事物未提交的数据。
        不可重复读：一个事物读到另一个事物已经提交的update的数据，导致一个事物中多次查询结果不一致
        虚读、幻读：一个事物读到另一个事物已经提交的insert的数据，导致一个事物中多次查询结果不一致
    写问题：
        丢失更新

解决读问题：
    Read uncommitted:未提交读，任何读问题都解决不了
    Read committed:已提交读，解决脏读，但是不可重复读和虚读有可能发生 （mysql 默认）
    Repeatable read:重复读，解决脏读和不可重复读，但是虚读有可能发生    （Oracle 默认）
    Serializable：解决所有读的问题  
-----------------------------------------------------------------------------------------

Spring的事物管理API：
    PlatformTransactionManager:平台事物管理器。接口，是Spring用于管理事物的真正的对象
         DataSourceTransactionManager:底层使用JDBC管理事物
         HibernateTransactionManager:底层使用Hibernate管理事物
    TransactionDefinition:事物定义信息。用于定义事物的相关的信息，隔离级别、超时信息、传播行为、是否只读
    TransactionStatus:事物状态。用于记录再事物管理过程中，事物的状态的对象
事物管理的API的关系
    Spring进行事物管理的时候，首先平台事物管理器根据事物的定义信息进行事物的管理，在事物管理过程中，产生各种状态，
        将这些状态的信息记录到事物状态的对象中
    
Spring的事物传播行为
    Spring中提供了七种事物的传播行为
            保证多个操作在同一个事物中
          PROPAGATION_REQUIRED：默认值，如果A中有事物，使用A中的事物，如果A中没有事物，创建一个新的事物，将操作包含进来
          PROPAGATION_NOT_SUPPORTS：支持事物，如果A中有事物，使用A中的事物。如果A中没有事物就不使用事物
          PROPAGATION_MANDATORY：如果A中有事物，使用A中的事物，如果A中没有事物，抛出异常
            保证多个操作不在同一个事物中
          PROPAGATION_REQUIRES_NEW：如果A中有事物，将A的事物挂起（暂停），创建新的事物，只包含自身操作。如果A中没有事物，
                                                                        创建一个新事物，包含自身操作
          PROPAGATION_NOT_SUPPORTED：如果A中有事物，将A的事物挂起。不适用事物
          PROPAGATION_NEVER：如果A中有事物，报异常
            嵌套式事物
          PROPAGATION_NESTED：嵌套事物，如果A中有事物，按照A的事物执行，执行完成后，设置一个保存点，执行B中的操作，
                                                           如果没有异常，执行通过，如果有异常，可以选择回滚到最初始位置，也可以回滚到保存点
    
 --------------------------------------------------------------------------------------------------------------------------
Spring的事物管理：
     编程式事物管理(需要手动编写代码)
     1. 配置平台事物管理器
	    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		    <property name="dataSource" ref="dataSource"></property>
	    </bean>
	 2.配置spring事物管理的模板类
	 
    声明式事物管理---aop思想
     1.xml方式的声明式的事物管理
     
     2.注解方式的声明式事物管理
    
    
    
    
    
    
    