package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
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
        int actual = getNumberOfExamsTaken

    }



}