package org.NextInn.CI;

import java.util.*;
public class Student {
	private String name;
	private int studentId;
	private Certification certification;
	private List<String> list;

	public Student(String name, int studentId, Certification certification, List<String> list) {
		this.name = name;
		this.studentId = studentId;
		this.certification = certification;
		this.list = list;
	}

	@Override
	public String toString() {
		return 	"name = " + name + ", studentId =" + studentId +", certification = " + certification + ", list = "+ list;
	}

}