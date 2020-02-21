package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTest {
    Logger logger = Logger.getLogger(StudentTest.class.getName());
    @Test
    public void testGetFirstName() {
        // Given
        String expected = "Khalil";

        //when
        Student student = new Student(expected);

        //then
        String actual = student.getFirstName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLastName(){
        //Given
        String firstName = "Khalil";
        String lastName = "Crumpler";

        //when
        Student student = new Student(firstName, lastName);
        String expected = student.lastName;
        //then
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testNumberOfExamsTaken(){
        //Given
        Student student = new Student("Khalil", "Crumpler", new Double[] {100.0, 95.0, 96.0, 100.0});

        //When
        int expected = 4;
        int actual = student.getNumberOfExamsTaken();

        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetExamScores(){
        //Given
        Student student = new Student("Khalil", "Crumpler", new Double[] {100.0, 95.0, 96.0, 100.0});

        //when
        String output = student.getExamScores();

        //then

        logger.log(Level.INFO, output);

    }
    @Test
    public void testAddExamScore(){
        //Given
        Student student = new Student("Khalil", "Crumpler", new Double[] {100.0, 95.0, 96.0, 100.0});

        //when
        student.addExamScore(93.0);
        String output = student.getExamScores();
        //then
        logger.log(Level.INFO, output);

    }

    @Test
    public void testSetExamScore(){
        //Given
        Student student = new Student("Khalil", "Crumpler", new Double[] {125.0});

        //when
        student.examScores.remove(0);
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        //then
        logger.log(Level.INFO, output);
    }
    @Test
    public void testGetAverageExamScore(){
        //Given
        Student student = new Student("Khalil", "Crumpler", new Double[] {100.0, 95.0, 96.0, 100.0});

        //when
        Double average = student.getAverageExamScore();

        //then
        logger.log(Level.INFO, String.valueOf(average));
    }
    @Test
    public void testToString(){
        //given
        Student student = new Student("Khalil", "Crumpler", new Double[] {100.0, 95.0, 96.0, 100.0});

        //when
        String output = student.toString();

        //then
        logger.log(Level.INFO, output);;
    }


}