@Component组件
    修饰一个类，将这个类交给spring管理
    这个注解有三个衍生注解（功能类似）
    @Controller    :web层
    @Service       :service层
    @Repository    :dao层

属性注入的注解
    普通属性：@Value,设置普通属性的值
    对象类型属性：
    @Autowired,设置对象类型的属性的值，但是按照类型完成属性注入。
            如果要按照名称完成属性注入，必须让@Autowired注解和@Qualifier一起使用完成按照名称属性注入
    @Resource:完成对象类型的属性的注入，按照名称完成属性注入
    
Bean的其他注解
    Bean的生命周期的注解：
        @PostConstruct    :初始化方法
        @PreDestroy       :销毁方法
    Bean的作用范围的注解：
        @Scope    :作用范围
            singleton:默认单例
            protorype:多例
            session:
            globalsession:

xml和注解的比较
    xml:优点是可以使用任何场景;结构清晰，维护方便。缺点是配置太多太繁琐
        注解:优点是开发方便快捷，缺点是有些地方用不了,比如说这个类不是自己提供的，使用插件的时候
    xml和注解整合开发：框架的整合（xml配置），使用注解来完成属性的注入
 
<!-- 扫描是为了扫描类上的注解 -->
<!-- <context:component-scan base-package="com.thinking"></context:component-scan> -->

<!-- 在没有扫描的情况下，使用属性注入的注解   @Resource @Value @Autowired @Qulifier -->
<context:annotation-config/>            

-------------------------------------------------------------------------------------------------
Spring底层的AOP实现原理
      动态代理：
       JDK动态代理：只能对实现了接口的类产生代理
       Cglib动态代理（类似于Javassist第三方代理技术）：对没有实现接口的类产生代理对象，生成了子类对象
             
            
            
            
            
            