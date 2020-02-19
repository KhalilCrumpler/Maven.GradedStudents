package io.zipcoder;

import java.util.ArrayList;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        for(int i = 0; i< testScores.length; i++) {
            this.examScores.add(testScores[i]);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getExamScores(){
        String newString = "";
        int counter = 1;
        for(int i = 0; i < examScores.size(); i++){
            newString += "Exam " + counter + examScores.get(i) + "\n";
        }
        return newString;
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int )


}
