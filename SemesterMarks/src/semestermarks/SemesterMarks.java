
package semestermarks;


import java .util.Scanner;
public class SemesterMarks {

    
    public static void main(String[] args) {
        Scanner maths = new Scanner(System.in);
        
        System.out.println("Enter T1 marks: ");
        int T1Marks = maths.nextInt();
        
        System.out.println("Enter T2 marks: ");
        int T2Marks = maths.nextInt();
        
        System.out.println("Enter A1 Marks: ");
        int A1Marks = maths.nextInt();
        
        System.out.println("Enter A2 Marks: ");
        int A2Marks = maths.nextInt();
        
        int semesterMarks = 40;
        
        if ( semesterMarks <40 ){
            System.out.println("GO HOME YOU DON'T QUALIFY!");
            
        }
        else { 
            
            System.out.println("DOWNLOAD THE EXAM SLIP!😍 ");
        
    }
    
}
}