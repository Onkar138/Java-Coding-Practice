package com.collection.list;

import java.util.*;

public class sortListBySalary {

	public static void main(String[] args) {
		List<List<Object>> employees = new ArrayList<>();

		employees.add(List.of(101, "Onkar", 50000));
		employees.add(List.of(102, "Rahul", 30000));
		employees.add(List.of(103, "Amit", 40000));

		Collections.sort(employees, (a, b) -> 
			(Integer)a.get(2) - (Integer)b.get(2));

		System.out.println(employees);
	}

}
