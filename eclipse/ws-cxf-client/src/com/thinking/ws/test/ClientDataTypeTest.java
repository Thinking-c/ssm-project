package com.thinking.ws.test;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.thinking.ws.data_type.DataTypeWS;
import com.thinking.ws.data_type.DataTypeWSImplService;
import com.thinking.ws.data_type.GetAllStudentsResponse.Return;
import com.thinking.ws.data_type.GetAllStudentsResponse.Return.Entry;
import com.thinking.ws.data_type.Student;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
public class ClientDataTypeTest {
	
	public static void main(String[] args) {
		
//		client1();
		
		client2();
		
	}
	
	public static void client1() {
		DataTypeWSImplService fartroy = new DataTypeWSImplService();
		DataTypeWS dataTypeWS = fartroy.getDataTypeWSImplPort();
		boolean addStudentResult = dataTypeWS.addStudent(new Student(45, "yiyi", 10000));
		System.out.println(addStudentResult);
		
		List<Student> studentsByPrice = dataTypeWS.getStudentsByPrice(23);
		System.out.println(studentsByPrice);
		
		Return allStudents = dataTypeWS.getAllStudents();
		List<Entry> entrys = allStudents.getEntry();
		for(Entry entry : entrys) {
			Integer key = entry.getKey();
			Student student = entry.getValue();
			System.out.println(key + "_" + student);
		}
	}
	
	//动态调用
	public static void client2() {
		JaxWsDynamicClientFactory dynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = dynamicClientFactory.createClient("http://localhost:8080/services/CommonService?wsdl");
		
		try {
			Object[] objects = client.invoke("sayHello", "Tom");
			System.out.println(objects.length);
			for(int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
			
//			Object[] objects2 = client.invoke("addStudent", new Student(12, "zhangsan", 10));
//			System.out.println(objects2.length);
//			for(int i = 0; i < objects2.length; i++) {
//				System.out.println(objects2[i]);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
