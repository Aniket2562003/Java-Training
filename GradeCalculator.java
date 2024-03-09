import java.util.Scanner;
public class GradeCalculator{
    public static void main(String args[]){
        float sum=0;
        char a;
    
        Scanner sc= new Scanner(System.in);
      do{
        System.out.println("Welcome to Grade Caculator");
      System.out.println("Enter total number of Subjects");
      
      int totalSubjects=sc.nextInt();

      for(int i=1;i<=totalSubjects;i++){
        System.out.printf("Enter Score in Subject %d out of 100: ",i);
        float score=sc.nextInt();
        sum=sum+score;
      }
    //   System.out.println(sum);
      float averagescore=sum/totalSubjects;
      System.out.println(averagescore);
     
    if(averagescore<33.0){
        System.out.println("Fail");
    }
    else{
        System.out.println("Pass");
    }

    System.out.println("Would you like to calculate your grade again? Type y for yes and n for no");
     a = sc.next().charAt(0);
     sum=0;
    
      }while(a=='y');

      sc.close();
    }
}