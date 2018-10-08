package com.thinking.quartz.quick_start;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

/**
 * @Author:caoj
 * @Date:2018/09/28
 * @version:v1.0
 * @Description:
 */
public class HelloJob implements Job {
	
	

	public HelloJob() {
	}

	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss").format(new Date()));
		
		JobKey key = context.getJobDetail().getKey();
		System.out.println(key);
		
		JobDataMap dataMap = context.getMergedJobDataMap();
		
		String jobSays = dataMap.getString("jobSays");
		float myFloatValue = dataMap.getFloat("myFloatValue");
		System.out.println("Instance " + key + " of DumbJob says: " + jobSays + ", and val is: " + myFloatValue);
		
		
	}

}
