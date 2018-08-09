package com.sbk.SoapSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.io.File;

@SpringBootApplication
public class SoapSerializerApplication {

	public static XmlMapper xmlMapper;
	public static File file;
	public static String xmlString;

	public static void main(String[] args) throws JsonProcessingException, java.io.IOException {
		SpringApplication.run(SoapSerializerApplication.class, args);

		serializeJavaToXMLString();
		serializeXMLToJavaObject();
	}

	public static void serializeJavaToXMLString() throws JsonProcessingException, java.io.IOException
	{
		xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File("student_bean.xml"), new Student());
		file = new File("student_bean.xml");
		xmlString = FileUtils.readFileToString(file, "UTF-8");
		System.out.println("Saved File Name:" + file.getAbsolutePath());
		System.out.println("Serialized XML Output: " + xmlString);
	}

	public static void serializeXMLToJavaObject() throws JsonProcessingException, java.io.IOException
	{
		if(!StringUtils.isEmpty(xmlString))
		{
			Student myStudent = xmlMapper.readValue(xmlString, Student.class);
			System.out.println("Transformed Java Object: " + myStudent.toString());
		}
	}
}
