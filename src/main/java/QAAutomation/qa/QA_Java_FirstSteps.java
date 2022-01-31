package QAAutomation.qa;

import java.util.Scanner;

public class QA_Java_FirstSteps {

    public static void main(String[] args) {
        System.out.println("Please enter your username");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();

        System.out.println("Your username is: " + userName);

        System.out.println("Please enter your favourite hobby");

        String userHobby = scanner.next();

        System.out.println("Your favourite hobby is: " + userHobby);


    }
}
