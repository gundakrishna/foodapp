package com.foodapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, Welcome to the Food App");
        System.out.println("Please Create a Password: ");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your Password is now: " + pass1);

        System.out.println("Please enter your Password to Login: ");
        String pass2 = scan.next();
        while(!pass1.equals(pass2)){
            System.out.println("Please enter a correct Password to Login: ");
            pass2 = scan.next();
        }
        System.out.println("Access Granted");
        System.out.println("Are You Hungry Yes or No: ");
        String ans1 = scan.next();

        if(ans1.equals("Yes")){
            System.out.println("Choose What You Want to Eat between Pizza, Burger, Biryani, Fish");
            String ans2 =  scan.next();

            while(!ans2.equals("Pizza")&&!ans2.equals("Burger")&&!ans2.equals("Biryani")&&!ans2.equals("Fish")){
                System.out.println("Sorry we do not have it what would you like between Pizza, Burger, Biryani, Fish");
                ans2 = scan.next();
            }

            if(ans2.equals("Pizza")||ans2.equals("Burger")||ans2.equals("Biryani")||ans2.equals("Fish")){
                System.out.println("Do you want any Soft Drink Yes or No: ");
                String ans3 = scan.next();
                while(!ans3.equals("Yes") && !ans3.equals("No")){
                    System.out.println("You entered the Wrong command please try again: ");
                    ans3 = scan.next();
                }
                if(ans3.equals("Yes")){
                    System.out.println("What would you like to Drink Coke or Juice: ");
                    String ans4 = scan.next();
                    while(!ans4.equals("Coke") && !ans4.equals("Juice")){
                        System.out.println("Sorry we don't have it what would you like between Coke and Juice: ");
                        ans4 = scan.next();
                    }
                    if(ans4.equals("Coke") || ans4.equals("Juice")){
                        System.out.println("Great you have ordered " + ans2 + " and " + ans4);
                    }
                    System.out.println("Please confirm your password");
                    pass2 = scan.next();
                    while(!pass1.equals(pass2)){
                        System.out.println("Please enter a correct Password to Login: ");
                        pass2 = scan.next();
                    }
                    System.out.println("Thank you! your order is on it's way");
                } else {
                    System.out.println("You have ordered " + ans2);
                }
                System.out.println("Please confirm your password");
                pass2 = scan.next();

                while (!pass2.equals(pass1)){
                    System.out.println("This is not the right password, please try again");
                    pass2 = scan.next();
                }
            }

        }else{
            System.out.println("Alright Have a Good Day");
        }
    }
}
