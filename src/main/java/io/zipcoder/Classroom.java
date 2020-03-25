package io.zipcoder;

import java.util.*;
import java.util.logging.Logger;

import io.zipcoder.Student;

public class Classroom   {
    private ArrayList<Student> students;
    private static final Logger LOGGER = Logger.getLogger(Classroom.class.getName());
    private int maxNumberOfStudents;
    private TreeMap<String, ArrayList<Student>> gradeBook;
    private ArrayList<Student> letterGradeA;
    private ArrayList<Student> letterGradeB;
    private ArrayList<Student> letterGradeC;
    private ArrayList<Student> letterGradeD;
    private ArrayList<Student> letterGradeF;
    public Classroom() {

        this.students = new ArrayList<>(30);
    }

    public Classroom(int maxNumberOfStudents) {

        students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;

    }

    public ArrayList<Student> getStudents(){

        return this.students;
    }

    public double getAverageClassroomExamScore(){
        double sum = 0;
        for(Student index : students){
            sum += index.getAverageExamScore();
        }
        double average = sum/students.size();
        return average;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        for(Student a : this.students) {
            if (a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)) {
                this.students.remove(a);
            }
        }
    }

    public void getStudentsByScore() {
        Collections.sort(students);

    }

    public ArrayList<Student> checkIfStudentIsA(){
        letterGradeA = new ArrayList<>();
        for(Student student : students){
            if(student.getAverageExamScore() >= 90){
                letterGradeA.add(student);
            }
        }
        return letterGradeA;
    }

    public ArrayList<Student> checkIfStudentIsB(){
        letterGradeB = new ArrayList<>();
        for(Student student : students){
            if(student.getAverageExamScore() >= 71 && student.getAverageExamScore() < 89){
                letterGradeB.add(student);
            }
        }
        return letterGradeB;
    }

    public ArrayList<Student> checkIfStudentIsC(){
        letterGradeC = new ArrayList<>();
        for(Student student : students){
            if(student.getAverageExamScore() >= 50 && student.getAverageExamScore() < 70){
                letterGradeC.add(student);
            }
        }
        return letterGradeC;
    }

    public ArrayList<Student> checkIfStudentIsD(){
        letterGradeD = new ArrayList<>();
        for(Student student : students){
            if(student.getAverageExamScore() >= 11 && student.getAverageExamScore() < 49){
                letterGradeD.add(student);
            }
        }
        return letterGradeD;
    }

    public ArrayList<Student> checkIfStudentIsF(){
        letterGradeF = new ArrayList<>();
        for(Student student : students){
            if(student.getAverageExamScore() < 11){
                letterGradeF.add(student);
            }
        }
        return letterGradeF;
    }

    public TreeMap<String, ArrayList<Student>> getGradeBook(){
        gradeBook = new TreeMap<>();
        gradeBook.put("A",letterGradeA);
        gradeBook.put("B",letterGradeB);
        gradeBook.put("C",letterGradeC);
        gradeBook.put("D",letterGradeD);
        gradeBook.put("F",letterGradeF);

        return gradeBook;
    }

    public ArrayList<Student> getLetterGradeA() {
        return letterGradeA;
    }

    public ArrayList<Student> getLetterGradeB() {
        return letterGradeB;
    }

    public ArrayList<Student> getLetterGradeC() {
        return letterGradeC;
    }

    public ArrayList<Student> getLetterGradeD() {
        return letterGradeD;
    }

    public ArrayList<Student> getLetterGradeF() {
        return letterGradeF;
    }




}