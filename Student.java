package task2;

/**
 *
 * @author FIni
 */
public class Student extends Person {
    int matriculationNumber;
    String seminarGroup;
    
    public Student()    {
        
    }
    
    public Student(String sur, String fore, String date, int matric, String seminar)    {
        super(sur, fore, date);
        int matriculationNumber = matric;
        String seminarGroup = seminar;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String getSeminarGroup() {
        return seminarGroup;
    }

    public void setSeminarGroup(String seminarGroup) {
        this.seminarGroup = seminarGroup;
    }

    @Override
    public String toString() {
        return "Nachname: " + surname + ", Vorname: " + forename + ", Geburtstag: " + dateOfBirth + "Matrikelnummer: " + matriculationNumber + ", Seminargruppe: " + seminarGroup;
    }

}
