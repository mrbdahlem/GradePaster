package gradepaster;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bdahl
 */
public class Section {
    private final String name;
    private final List<Student> students;
    
    public Section(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public boolean equals(String name) {
        
        return (this.name.equals(name));
        
    }
    
    @Override
    public String toString() {
        return name;
    }
}
