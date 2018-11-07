package com.thinking.test;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/12
 */
public class Test1 {

    //Exception in thread "main" java.lang.StackOverflowError
    private String name;

    private Test2 test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", test2=" + test2 +
                '}';
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.setName("test1");

        Test2 test2 = new Test2();
        test2.setName("test2");

        test1.setTest2(test2);
        test2.setTest1(test1);

        System.out.println(test1);



    }
}
