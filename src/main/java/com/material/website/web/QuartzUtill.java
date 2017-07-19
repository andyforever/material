 package com.material.website.web;

import javax.annotation.Resource;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.material.website.service.IGoodsService;

@Component //申明成为spring 组件 
public class QuartzUtill extends QuartzJobBean{
	    
	    @Resource
	    private  IGoodsService goodsService;    
	
	    public QuartzUtill() {  
	          
	    }  
	  
	    @Override  
	    protected void executeInternal(JobExecutionContext context)  
	            throws JobExecutionException {  
	        System.out.println("定时任务执行中......");  
	        JobDataMap jobDataMap = context.getTrigger().getJobDataMap();  
	        System.out.println(jobDataMap+"-------");  
	    }  
	  
	    public   void start() {  
	        System.out.println("清除临时表垃圾数据开始......");  
	        try {  
	        	goodsService.delTempData();
	            System.out.println("清除成功");  
	        } catch (Exception e) {  
	            System.out.println("清除失败");  
	            e.printStackTrace();  
	        }  
	        System.out.println("清除临时表垃圾数据结束......");  
	    }  
}
