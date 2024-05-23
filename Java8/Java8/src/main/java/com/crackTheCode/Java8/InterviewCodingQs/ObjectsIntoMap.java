package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ObjectsIntoMap {
	public String name;
	public int age;
	public int id;
	
	public ObjectsIntoMap(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

public static void main(String[] args) {
	List<ObjectsIntoMap> objectsList = new ArrayList<>();
        
        // Adding sample data
        objectsList.add(new ObjectsIntoMap("Alice", 30, 1));
        objectsList.add(new ObjectsIntoMap("Bob", 25, 2));
        objectsList.add(new ObjectsIntoMap("Charlie", 28, 3));
        objectsList.add(new ObjectsIntoMap("Diana", 35, 4));
        objectsList.add(new ObjectsIntoMap("Bob", 22, 5));
        objectsList.add(new ObjectsIntoMap("Frank", 40, 6));
        objectsList.add(new ObjectsIntoMap("Grace", 29, 7));
		
		//convert objects to map
		
		Map<String, Integer> map = objectsList.stream()
		.sorted(Comparator.comparingInt(ObjectsIntoMap::getId).reversed())
		.collect(Collectors.toMap(ObjectsIntoMap::getName, ObjectsIntoMap::getAge,
		(oldValue, newValue)-> oldValue, LinkedHashMap::new));
		
		//sort on the basis of name
		
		List<ObjectsIntoMap> newList = objectsList.stream()
		.sorted(Comparator.comparing(ObjectsIntoMap::getName).reversed())
		.collect(Collectors.toList());
		
		for(ObjectsIntoMap m : newList) {
			System.out.println(m.getName() + " " + m.getAge() + " " + m.getId());
		}
	
}
}