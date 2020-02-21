package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassroomTest {
    Logger logger = Logger.getLogger(ClassroomTest.class.getName());
    @Test
    public void testGetAverageExamScore(){
        //given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        //when
        double output = classroom.getAverageExamScore();

        //then
        logger.log(Level.INFO, String.valueOf(output));
    }

    @Test
    public void testAddStudent(){
        //Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0 };
        Student student = new Student("Khalil", "Crumpler", examScores);
        String str = "";
        //when
        classroom.addStudent(student);

        //then

    }
}
