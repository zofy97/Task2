package task2;

/**
 *
 * @author FIni
 */
public class Subject {
    int semester;
    String className;
    String courseOfStudies;
    
    public Subject()    {
        System.out.println("You are using the default constructor.");
    }
    
    public Subject(int semester, String className, String courseOfStudies)  {
        this.semester = semester;
        this.className = className;
        this.courseOfStudies = courseOfStudies;
    }

    public int getSemester() {
        return semester;
    }

    public String getClassName() {
        return className;
    }

    public String getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setCourseOfStudies(String courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }

    @Override
    public String toString() {
        return "Subject " + "semester: " + semester + ", class name: " + className + ", course of studies: " + courseOfStudies;
    }
    
    
}
