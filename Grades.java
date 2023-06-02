//05-24-23 Project#2 // William Alguera
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
    //variables
        int grade;
        Scanner kb = new Scanner(System.in);
    //output & logic

        System.out.print("Hello, Please input student's grade >> ");
        grade = kb.nextInt();

        if(grade >= 90){
            System.out.println("The grade is an A");
        }
        else if((grade >= 80) && (grade <= 89)){  
            System.out.println("The grade is a B");
        }
        else if(grade >= 70 && grade <= 79){ 
            System.out.println("The grade is a C");
        }
        else if(grade >= 65 && grade <= 69){  
            System.out.println("The grade is a D");
        }
        else if(grade< 65){  
            System.out.println("The grade is an F");
        }
        else{             
            System.out.println("Please enter a valid numerical grade");
        }
    
    
    }//end - main

}
