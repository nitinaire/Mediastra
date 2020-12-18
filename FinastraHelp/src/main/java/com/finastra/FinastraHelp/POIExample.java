package com.finastra.FinastraHelp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class POIExample {

	public static void main (String args[]){
		//System.out.println("asdsd");
		String s= "nitin";
		String s2= new String("nitin");
		String s3= null;
		Set<String> s4= new HashSet<>();
		s4.add(s);
		s4.add(s2);
		s4.add(s2.concat(s));
		System.out.println("sdsd"+s4.size());
		Employee e1= new Employee();
		e1.setId("1");
		e1.setName("1");
		Employee e2= new Employee();
		e2.setId("2");
		e2.setName("3");
		Department d1= new Department();
		d1.setId("1");
		d1.setName("1");
	Map<Employee,Employee> emap= new HashMap<Employee, Employee>();
	emap.put(e1, e1);
	e2=e1;
	//e1 =(Employee) ((Object)e2);
	System.out.println("map value"+emap.get(e2));
		
	}
}

