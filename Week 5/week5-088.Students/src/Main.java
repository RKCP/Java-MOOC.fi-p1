
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        
        while (true) {
            System.out.print("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            Student newStudent = new Student(studentName, studentNumber);
            list.add(newStudent);
        }
        
        System.out.println("");
        
        for (Student student: list) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        while (true) {
            System.out.print("Give search term: ");
            String searchTerm = reader.nextLine();
            
            System.out.println("Result: ");
            for (Student studentToSearch: list) {
                if (studentToSearch.getName().contains(searchTerm)) {
                    System.out.println(studentToSearch);
                }else if (searchTerm.isEmpty()) {
                    break;
                }
                
            }break;
            
        }
        
        
        
    }
}
