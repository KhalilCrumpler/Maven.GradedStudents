package io.zipcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Logger;

public class Student implements Comparable<Student> {
    public String firstName;
    public String lastName;
    ArrayList<Double> examScores;
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        for(Double score : testScores){
            examScores.add(score);
        }
    }
    public Student(String firstName){
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getNumberOfExamsTaken(){
        return this.examScores.size();
    }

    public void setExamScore(int examNumber, double newScore){
     int index = examNumber - 1;
     this.examScores.add(index, newScore);
    }

    public String getExamScores(){
        String newString = "";
        int counter = 1;
        for(int i = 0; i < examScores.size(); i++){
            newString += "Exam " + counter + ": " + Math.round(examScores.get(i)) + "\n";
            counter++;
        }
        return newString;
    }


    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public double getAverageExamScore(){
        int len = examScores.size();
        double sum = 0;
        for( double a : examScores){
            sum += a;
        }
        double average = sum / examScores.size();
        return (int)average;
    }

    public String toString(){
        return "Student Name: " + this.firstName + " " + this.lastName + "\n" + "Average Score: " + getAverageExamScore() + "\nExam Scores: \n"  + getExamScores();
    }

    @Override
    public int compareTo(Student otherStudent) {
        int difference = (int) otherStudent.getAverageExamScore() - (int) this.getAverageExamScore();
        if (difference == 0) {
            if (this.getLastName().equals(otherStudent.getLastName())) {
                return this.getFirstName().compareTo(otherStudent.getFirstName());
            }
            return this.getLastName().compareTo(otherStudent.getLastName());
        } else {

            return difference;
        }
    }

}
