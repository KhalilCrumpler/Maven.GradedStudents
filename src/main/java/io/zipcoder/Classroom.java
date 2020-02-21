package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import io.zipcoder.Student;

public class Classroom {
    public ArrayList<Student> students = new ArrayList<>();

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

    public Student[] getStudents(){
        for(int i = 0; i< students.size(); i++){

        }
        return students;
    }

    public double getAverageExamScore(){
        double sum = 0;
        double numTests = 0;
        for(int i = 0; i < students.size(); i++){
            for (int j = 0; j < students.size(); j++){
            sum += students.get(i).examScores.get(j);
            numTests++;
        }
            }
        return sum/numTests;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    



}