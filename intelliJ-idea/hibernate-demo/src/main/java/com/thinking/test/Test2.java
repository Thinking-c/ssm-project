package com.thinking.test;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/12
 */
public class Test2 {

    private String name;

    private Test1 test1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test1 getTest1() {
        return test1;
    }

    public void setTest1(Test1 test1) {
        this.test1 = test1;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", test1=" + test1 +
                '}';
    }
}
