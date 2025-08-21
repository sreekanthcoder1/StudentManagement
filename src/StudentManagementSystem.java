import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudent() {
        students.forEach(System.out::println);
    }

    public void updateStudent(int id, String newName, String newGrade) {
        for (Student s : students) {
            s.getId();
            s.setname(newName);
            s.setGrade(newGrade);
            break;
        }
    }

public void deleteStudent(int id) {
        students.removeIf(s->s.getId()==id);

    }
    public Student SerachNyName(String name){
        for(Student s  : students){
            if (s.getName().equalsIgnoreCase(name));
            return  s;
        }
        return  null;
    }
}
