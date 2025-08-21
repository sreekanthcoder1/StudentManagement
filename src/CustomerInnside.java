public class CustomerInnside {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.addStudent(new Student(1,"kasa","A"));
        sms.addStudent(new Student(2,"Bob","B"));
        sms.addStudent(new Student(3,"thirdOne","C"));
        sms.addStudent(new Student(4,"fourthOne","D"));


        System.out.println("Print the values:");
        sms.viewStudent();

        sms.updateStudent(2,"Robert","D");
        System.out.println("After Updating Student :");

        sms.viewStudent();

        System.out.println("Searching Elements:");
        Student found = sms.SerachNyName("ram");
        System.out.println(found != null ?found :"StudentNotFound");


        sms.deleteStudent(1);
        System.out.println("After Deleting Student");
        sms.viewStudent();
    }
}
