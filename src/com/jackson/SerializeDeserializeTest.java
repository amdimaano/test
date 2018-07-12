package com.jackson;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeDeserializeTest {
	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void serializeTest() throws JsonProcessingException {
		Student student = new Student();
		student.setAge(30);
		student.setName("arvin");
		System.out.println(mapper.writeValueAsString(student));
	}

	@Test
	public void serializeTestWithAddress() throws JsonProcessingException {
		Student student = new Student();
		student.setAge(30);
		student.setName("arvin");
		student.setAddress("mandaluyong");
		System.out.println(mapper.writeValueAsString(student));
	}

	@Test
	public void serializeDifferentGetterName() throws JsonProcessingException {
		Student2 student = new Student2();
		student.setName("Arvin");
		student.setAge(30);
		System.out.println(mapper.writeValueAsString(student));
	}
	
	@Test
	public void deserializeTest() throws JsonParseException, JsonMappingException, IOException {
		String json = "{\"pangalan\":\"Arvin\",\"edad\":30}";
		Student2 t = mapper.readValue(json, Student2.class);
		System.out.println(t);
	}

	@Test
	public void deserializeTestOrigFieldName() throws JsonParseException, JsonMappingException, IOException {
		String json = "{\"name\":\"Arvin\",\"age\":30}";
		Student2 t = mapper.readValue(json, Student2.class);
		System.out.println(t);
	}

}
