import java.util.Scanner;
public class Demo
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int x=sc.nextInt();
        
        if(x<0){
            System.out.println("The given num is -ve");
        }
        else if(x>0){
        System.out.println("The given num is +ve");
        }
        else
        System.out.println("The given num is 0");
        }
        
    }
