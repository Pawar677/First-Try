import java.util.Scanner;
public class LeapYear
   {
       public static void main (String [] args)
          {
             Scanner in = new Scanner (System.in);
             System.out.print("Enter a Year :");
             int num = in.nextInt();
                 if(num % 400==0)
                      {
                         System.out.println("Enterd Year is a Leap Year !");
                      }                      
                               else if(num % 100==0)
                                      {
                                            System.out.println("Enterd Year is not a Leap Year !");
                                       }
                                            else if(num % 4==0)
                                              {
                                                   System.out.println("Enterd Year is a Leap Year");
                                               }
                        
                     else
                         {
                           System.out.println("Enterd Year is not a Leap Year"); 
                         }                  
          }
     }