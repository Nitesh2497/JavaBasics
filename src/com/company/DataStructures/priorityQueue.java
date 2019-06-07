package com.company.DataStructures;

import java.util.*;

class Student{
    int id;
    String name;
    double cgpa;
    Student(int id,String name,double cgpa){
        this.id =id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    private Comparator<Student> student = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getCGPA()>o2.getCGPA()){
                return -1;
            }else if(o1.getCGPA()==o2.getCGPA()){
                if (o1.getName().equals(o2.getName())){
                    if(o1.getID()>o2.getID()){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                        return o1.getName().compareTo(o2.getName());
                }
            }else{
                return 1;
            }
        }
    };

    private PriorityQueue<Student> students = new PriorityQueue<>(11,student);
    List<Student> getStudents(List<String> events){
        for(String event : events){
            String[] studentInfo = event.split(" ");
            if(event.contains("ENTER")){
                students.add(new Student(Integer.valueOf(studentInfo[3]),studentInfo[1],Double.valueOf(studentInfo[2])));
            }else{
//                System.out.println(students.element().getName());
                students.poll();
            }
        }
        Student first = students.poll();
        List<Student> studentList = new ArrayList<>();
        if (first == null) {
            return new ArrayList<>(studentList);
        } else {
            while (first != null) {
                studentList.add(first);
                first = students.poll();

            }
            return new ArrayList<>(studentList);
        }
    }
}
/*
 * Create the Student and Priorities classes here.
 */


public class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}