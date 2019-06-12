package homework12d;

import java.util.Scanner;

public class Homework12d {
    
   void output(int num)
        {
         
             String star = ("*");
             int i;
             for (i=1;i<=num;++i){
               
                for(int x=0;x<i;++x)
                {
             System.out.print(star);  
                }
            
            System.out.print("\n");
            }
      
        }
    public static void main(String[] args) {
        Homework12d main = new Homework12d(); 
        
        while(true){   
        System.out.println("type in a number to print stars");
        Scanner SC = new Scanner(System.in);
        int num;
        try {
        num = SC.nextInt();
                main.output(num);
                break;
        }
        catch (Exception e){
             System.out.println("not a number or positive number");       
            
        }
        }
      

        }
         
} 