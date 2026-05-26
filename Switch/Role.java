package Switch;

import java.util.Scanner;

public class Role {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String role=sc.next();
        switch(role){
            case "Admin":
                System.out.println("Admin access");
                break;
            case "Student":
                System.out.println("Student access");
                break;
            case "Teachers":
                System.out.println("Teachers access");
                break;
            case "Guest":
                System.out.println("Guest access");
                break;
        }
    }
}
        

    

