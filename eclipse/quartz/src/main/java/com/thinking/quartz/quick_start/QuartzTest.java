package com.thinking.quartz.quick_start;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Author:caoj
 * @Date:2018/09/28
 * @version:v1.0
 * @Description:
 */
public class QuartzTest {

	public static void main(String[] args) {

		Scheduler scheduler;
		try {
			// Grab the Scheduler instance from the Factory
			scheduler = StdSchedulerFactory.getDefaultScheduler();

			// and start it off
			scheduler.start();

			// define the job and tie it to our HelloJob class
			JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1")
					.usingJobData("jobSays", "hello world")
					.usingJobData("myFloatValue", 3.1415f)
					.build();

			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").startNow()
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(40).repeatForever())
					.build();

			// Tell quartz to schedule the job using our trigger
			scheduler.scheduleJob(job, trigger);

//			Thread.sleep(1000);
//			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} /*catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
