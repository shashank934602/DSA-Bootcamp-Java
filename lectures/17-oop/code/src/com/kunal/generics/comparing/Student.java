package com.kunal.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno; // variables of roll no and marks
    float marks;
    
// having a constructor of rollno and marks
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    // overided string method

    @Override
    public String toString() {
        return marks + "";
    }
     // created a methon in the name of campareTo and used student class and we also used object so that we can have our own genirics 

    @Override
    public int compareTo(Student o) {
        System.out.println("in compareto method");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }
}
