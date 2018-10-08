Spring底层的AOP实现原理
      动态代理：
       JDK动态代理：只能对实现了接口的类产生代理
       Cglib动态代理（类似于Javassist第三方代理技术）：对没有实现接口的类产生代理对象，生成了子类对象

Spring AOP相关术语
    Joinpoint:连接点，可以被拦截到的点
    Pointcut:切入点，真正被拦截到的点
    Advice:通知、增强
    Introduction:引介。类层面增强
    Target:被增强的对象
    Weaving:织入，将通知应用（Advice）到目标（Target）过程
    Proxy:代理对象
    Aspect:切面，多个通知和多个切入点组合

Spring通知类型
        前置通知：获得切入点的信息
        后置通知：获得方法的返回值
        环绕通知：在目标方法执行之前和之后进行操作,可以阻止目标方法的执行
        异常抛出通知：在程序出现异常的时候，进行的操作
        最终通知：无论代码是否有异常，总会执行
        引介通知（基本不会用）：  
        
Spring切入点表达式语法：
        基于execution的函数完成的
        [访问修饰符] 方法返回值 包名.类名.方法名(参数)
        public void com.thinking.CustomerDao.save(..)   ..表示任意参数

Spring的AOP的通知类型
    @Before:前置通知
    @AfterReturing:后置通知
    @Around:环绕通知
    @AfterThrowing:异常抛出通知
    @After:最终通知





      