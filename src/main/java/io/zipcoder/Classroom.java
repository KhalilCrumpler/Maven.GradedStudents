package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import io.zipcoder.Student;

public class Classroom {
    public List<Student> students = new ArrayList<>();

    public Classroom() {
        students = new ArrayList<>(30);
    }

    public Classroom(int maxNumberOfStudents) {
        students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(Student[] allStudents) {
        for(int i = 0; i< allStudents.length; i++){
            students.add(allStudents[i]);
        }
    }

    public List<Student> getStudents(){
        return students;
    }

    public Double getAverageExamScore(){
        double sum = 0.0;
        return 1.0;
    }


}