package com.thinking.base;

import com.thinking.dao.model.Page;
import com.thinking.utils.PageData;
import com.thinking.utils.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/6/22
 */
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * @return pageData
     */
    public PageData getPageData(){
        return new PageData(this.getRequest());
    }

    /**
     * @return request
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * @return modelAndView
     */
    public ModelAndView getModelAndView(){
        return new ModelAndView();
    }

    /**
     * @return 32 byte uuid
     */
    public String get32UUID(){
        return UuidUtil.get32UUID();
    }

    /**
     * @return page
     */
    public Page getPage(){
        return new Page();
    }

    public static void logBefore(Logger log, String interfaceName){
        log.info("");
        log.info("start");
        log.info(interfaceName);
    }

    public static void logAfter(Logger log){
        log.info("end");
        log.info("");
    }


}
