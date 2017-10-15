/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author FIni
 */
public class Student extends Person {
    int matriculationNumber;
    String seminarGroup;
    
    public Student()    {
        System.out.println("You are using the default constructor.");
    }
    
    public Student(String sur, String fore, String date, int matric, String seminar)    {
        super(sur, fore, date);
        int matriculationNumber = matric;
        String seminarGroup = seminar;
    }
    
    
}
