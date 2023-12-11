/*Angel Ramirez-Rivera ITDEV 110 Monday
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ramirez_tipperapp.ramirez_tipperapp;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 * 
 * @author angelramirez-rivera
 */
public class TipperApp { 

    public TipperApp(){
        introduction();
        directions();
        displayRecipt();
    }
    public static void introduction(){
        System.out.println("In this application you will learn how to calculate percentage and and basic math function in java");
    }
    public static void directions(){
        System.out.println("Calculate a 15% tip for the total");
    }
    public static void userInput(){
    }
    public static void tipCalc(){
        
        System.out.println();
        }
    public  void displayRecipt(){        
        System.out.print(java.time.LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))+"\t"); 
        System.out.println(java.time.LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))); 
        System.out.println("Yoyo Pizza");
        Scanner TipperApp = new Scanner(System.in);
        double fnum,snum, answer;
        System.out.print("Enter Total amount charged ");
        fnum = TipperApp.nextDouble();
        double total = fnum;
        double tip = total* .15;
        System.out.println("15% Tip = " + tip);
        System.out.print("Enter Tip amount ");
        snum = TipperApp.nextDouble();
        answer = fnum +snum;
        System.out.println("Your total today is "+answer +" Thank you for Eating With US!"); 

//        double per= 0.0;
//        per = total+tip;

    }
}
