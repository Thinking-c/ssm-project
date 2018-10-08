package com.thinking.system;
/**
 *@Author:caoj
 *@Date:2018/06/22
 *@version:v1.0
 *@Description:
 */
public class SystemDemo1 {
	
	public static void main(String args[]){  
        long startTime = System.currentTimeMillis() ;   // 取得开始计算之前的时间  
        int sum = 0 ;             
        for(int i=0;i<30000000;i++){   
            sum += i ;  
        }  
        long endTime = System.currentTimeMillis() ; // 取得计算之后的时间  
        // 结束时间减去开始时间  
        System.out.println("计算所花费的时间：" + (endTime-startTime) +"毫秒") ; 
        
        System.out.println(System .currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000);
    }  
	

}
