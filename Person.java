package task2;

/**
 *
 * @author FIni
 */
public class Person {
    String surname;
    String forename;
    String dateOfBirth;
    
    public Person() {
        
    }
    
    public Person(String sur, String fore, String date) {
        String surname = sur;
        String forename = fore;
        String dateOfBirth = date;
    }

    public String getSurname() {
        return surname;
    }

    public String getForename() {
        return forename;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person " + "surname: " + surname + ", forename: " + forename + ", date of birth: " + dateOfBirth;
    }
    
    
}
