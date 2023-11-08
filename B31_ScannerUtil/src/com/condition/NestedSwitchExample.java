package com.condition;

import java.util.Scanner;

//Java Program to demonstrate the use of Java Nested Switch  
public class NestedSwitchExample {    
  public static void main(String args[])  
    {  
    //C - CSE, E - ECE, M - Mechanical  
	  boolean flag = true;
	  while(flag) {
	  Scanner sc  = new Scanner(System.in);
	  System.out.println("Enter The Branch: ");
	  char branch = sc.next().charAt(0);
	  
	  System.out.println("Enter The Collage Year: ");
	  int collegeYear = sc.nextInt();
	  
      //char branch = 'C';                 
      //int collegeYear = 4;  
      switch( collegeYear )  
      {  
          case 1:  
              System.out.println("English, Maths, Science");  
              break;  
          case 2:  
              switch( branch )   
              {  
                  case 'C':  
                      System.out.println("Operating System, Java, Data Structure");  
                      break;  
                  case 'E':  
                      System.out.println("Micro processors, Logic switching theory");  
                      break;  
                  case 'M':  
                      System.out.println("Drawing, Manufacturing Machines");  
                      break;  
              }  
              break;  
          case 3:  
              switch( branch )   
              {  
                  case 'C':  
                      System.out.println("Computer Organization, MultiMedia");  
                      break;  
                  case 'E':  
                      System.out.println("Fundamentals of Logic Design, Microelectronics");  
                      break;  
                  case 'M':  
                      System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                      break;  
              }  
              break;  
          case 4:  
              switch( branch )   
              {  
                  case 'C':  
                      System.out.println("Data Communication and Networks, MultiMedia");  
                      break;  
                  case 'E':  
                      System.out.println("Embedded System, Image Processing");  
                      break;  
                  case 'M':  
                      System.out.println("Production Technology, Thermal Engineering");  
                      break;  
              }  
              break;  
             
          case 0:  flag = false;
              System.out.println("EXIT THE APPLICATION...");  
              break; 
              
      }
      System.out.println();
	  }
  }  
}  