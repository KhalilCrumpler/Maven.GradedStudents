package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassroomTest {
    Logger logger = Logger.getLogger(ClassroomTest.class.getName());
    ArrayList<Student> letterGradeA;
    ArrayList<Student> letterGradeB;
    @Test
    public void testGetAverageExamScore(){
        //given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom();
        classroom.addStudent(s1);
        classroom.addStudent(s2);

        //when
        double output = classroom.getAverageClassroomExamScore();

        //then
        logger.log(Level.INFO, String.valueOf(output));
    }

    @Test
    public void testAddStudent(){
        //Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Khalil", "Crumpler", examScores);
        String str = "";
        //when
        classroom.addStudent(student);

        //then
        Assert.assertTrue(classroom.getStudents().contains(student));
    }
    @Test
    public void removeStudent(){
        //Given
        int maxNumberOfStudents = 5;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Khalil", "Crumpler", examScores);
        Student student2 = new Student("John", "Crumpler", examScores);

        //when
        classroom.addStudent(student);
        classroom.addStudent(student2);
        classroom.removeStudent("Khalil", "Crumpler");
        Collections.sort(classroom.getStudents());
        //then

        Assert.assertFalse(classroom.getStudents().contains(student));
    }

    @Test
    public void testGetStudentScore(){
        //given
        int maxNumberOfStudents = 5;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0};
        Double[] examScores2 = { 100.0, 150.0, 120.0, 0.0};
        Student student = new Student("Khalil", "Crumpler", examScores);
        Student student2 = new Student("John", "Crumpler", examScores2);

        //when
        classroom.addStudent(student);
        classroom.addStudent(student2);
        Collections.sort(classroom.getStudents());
        logger.log(Level.INFO, classroom.getStudents().toString());

    }

    @Test
    public void checkGradeBook(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 65.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom();
        classroom.addStudent(s1);
        classroom.addStudent(s2);

        classroom.checkIfStudentIsA();
        classroom.checkIfStudentIsB();
        classroom.checkIfStudentIsC();
        classroom.checkIfStudentIsD();
        classroom.checkIfStudentIsF();
        classroom.getGradeBook();

        Integer expectedAStudents = 1;
        Integer actual = classroom.getLetterGradeA().size();
        Assert.assertEquals(expectedAStudents,actual);

    }

}
