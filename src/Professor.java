import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Professor {
    private String  name ;

    Professor(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
class Department{
    private String name;
    private List<Professor>professors;

    Department(String name,List<Professor>professors){
        this.name=name;
        this.professors = professors;
    }
    public void printprofessors(){
        System.out.println("professors Name"+name);

        for (Professor professor:professors){
            System.out.println(professor.getName());
        }

    }
}
class Method{
    public static void main(String[] args) {
        Professor professor1 = new Professor("david");
        Professor professor2 = new Professor("vid");
        List<Professor>pfs =List.of(professor1,professor2);
        Department csdpt = new Department("cc ",pfs);
        csdpt.printprofessors();

    }
}
