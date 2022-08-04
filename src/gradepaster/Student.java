package gradepaster;

/**
 *
 * @author bdahl
 */
public class Student {
    private final String name;
    private final String[] grades;
    
    public Student(String name, String[] grades) {
        this.name = name;
        this.grades = grades;
    }
    
    public String getGrade(int num) {
        return grades[num];
    }
    
    @Override
    public String toString() {
        return name;
    }
            
}
