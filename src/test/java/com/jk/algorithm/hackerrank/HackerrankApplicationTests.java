package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    static class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    static class CustomComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getCgpa() == o2.getCgpa()) {
                if (o1.getFname().compareTo(o2.getFname()) == 0) {
                    return o1.getId() - o2.getId();
                } else {
                    return o1.getFname().compareTo(o2.getFname());
                }
            } else {
                if (o1.getCgpa() > o2.getCgpa()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    @Test
    public void contextLoads() {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));

        studentList.sort(new CustomComparator());

        System.out.println("J tag");
    }
}
