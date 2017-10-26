/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author FIni
 */
public class StudentMain {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        
        Student[] student = new Student[3];
        
        int count = 0;
        
        while (student.length == 3) {
            System.out.println("1) Neuen Studenten eingeben");
            System.out.println("2) Studenten ausgeben");
            
            int auswahl = scan.nextInt();
            scan.nextLine();
            
            if (auswahl == 1)   {
                
                Student s = new Student();
                System.out.println("Geben Sie die Daten des Buches ein: ");
                
                System.out.println("Nachname:");
                String sur = scan.nextLine();
                s.setSurname(sur);
                
                System.out.println("Vorname:");
                String fore = scan.nextLine();
                s.setForename(fore);
                
                System.out.println("Geburtstdatum:");
                String date = scan.nextLine();
                s.setDateOfBirth(date);
                
                System.out.println("Matrikelnummer:");
                int ma = scan.nextInt();
                s.setMatriculationNumber(ma);
                scan.nextLine();
                
                System.out.println("Seminargruppe:");
                String sem = scan.nextLine();
                s.setSeminarGroup(sem);
                
                student[count] = s;
                count++;
                
            } else if(auswahl == 2) {
                for (int i = 0; i < student.length; i++)    {
                    if(student[i] != null)  {
                        System.out.println(student[i]);
                    } else  {
                        System.out.println(" --- ");
                    }
                }
            }
         
        }
    }
}
