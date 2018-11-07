package com.thinking.struts2.dynamic;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/10/15
 */
public class Dynamic {

    public String add(){
        System.out.println("添加用户!");
        return "success";
    }
    public String delete(){
        System.out.println("删除用户!");
        return "success";
    }
    public String update(){
        System.out.println("修改用户!");
        return "success";
    }
    public String find(){
        System.out.println("查找用户!");
        return "success";
    }

}
