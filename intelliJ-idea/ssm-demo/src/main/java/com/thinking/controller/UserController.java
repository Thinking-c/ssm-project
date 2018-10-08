package com.thinking.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.thinking.dao.model.User;
import com.thinking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:caoj
 * @Date:2018/06/13
 * @version:v1.0
 * @Description:
 */
@Controller
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showName", method = RequestMethod.GET)
    public String showUserName(@RequestParam("uid") int uid, HttpServletRequest request, Model model) {

        LOG.info("[showName]userid={}", uid);

        User user = userService.getUserById(uid);
        if (user != null) {
            request.setAttribute("name", user.getUserName());
            model.addAttribute("name", user.getUserName());
            return "showName";
        }
        request.setAttribute("error", "没有找到该用户！");
        return "error";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(@RequestParam("userName") String userName) {

        LOG.info("[hello]{}", userName);
        return "hello";
    }

    @RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object user(@RequestParam("uid") int uid, HttpServletRequest request, Model model) {

        String jsonString = null;
        User user = userService.getUserById(uid);
        if (user != null) {
            jsonString = JSONObject.toJSONString(user);
            LOG.info("[user]{}", jsonString);
        }
        return user;
    }

    @RequestMapping("/returnObjectValue")
    @ResponseBody
    public Object doObjectValue() {
        return 12.34;

    }

    @RequestMapping(value = "/returnObjectString", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object doObjectString() {
        return "Hello SpringMVC, 这是第一个例子";

    }

    @RequestMapping(value = "/returnObjectList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object doObjectList() {
        List<String> list = new ArrayList<String>();
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("你好，世界");
        return list;
    }

    @RequestMapping(value = "/returnObjectMap", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object doObjectMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("mk1", "kv1");
        map.put("mk2", "kv2");
        map.put("mk3", "kv3");
        return map;
    }

}
