package io.zipcoder;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console(){
        scanner = new Scanner(System.in);
    }

    public Integer returnInteger(String output){
        System.out.println(output);
        return scanner.nextInt();
    }

    public String returnString(String output){
        System.out.println(output);
        return scanner.nextLine();
    }
}
