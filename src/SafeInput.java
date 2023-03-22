import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString (Scanner pipe , String prompt) {
        System.out.println(prompt);
        String input = pipe.nextLine();
        while(input.length() == 0) {
            System.out.println("Cannot be empty");
            System.out.println(prompt);
            input = pipe.nextLine();
        }
        return input;
    }

    public static int getInt(Scanner pipe , String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(pipe.nextLine());  // using  integer.parseInt to fix newline issue. No need to hasNext in this approach
        return input;
    }

    public static double getDouble(Scanner pipe , String prompt) {
        System.out.println(prompt);
        double input = Double.parseDouble(pipe.nextLine());  // using  Double.parseDouble to fix newline issue. No need to hasNext in this approach
        return input;
    }

    public static int getRangeInt(Scanner pipe , String prompt , int low , int high) {
        System.out.println(prompt + " between "+low+" and "+high);
        int input = Integer.parseInt(pipe.nextLine());  // using  integer.parseInt to fix newline issue. No need to hasNext in this approach
        while(input<low || input >high) {
            System.out.println("Please enter between the range");
            System.out.println(prompt + " between "+low+" and "+high);
            input = Integer.parseInt(pipe.nextLine());
        }

        return input;
    }

    public static double getRangeDouble(Scanner pipe , String prompt , double low , double high) {
        System.out.println(prompt + " between "+low+" and "+high);
        double input = Double.parseDouble(pipe.nextLine());  // using  Double.parseDouble to fix newline issue. No need to hasNext in this approach
        while(input<low || input >high) {
            System.out.println("Please enter between the range");
            System.out.println(prompt + " between "+low+" and "+high);
            input = Double.parseDouble(pipe.nextLine());
        }
        return input;
    }

    public static boolean getYNConfirm(Scanner pipe , String prompt) {
        System.out.println(prompt);
        String input = pipe.nextLine();
        while(!input.equalsIgnoreCase("n") && !input.equalsIgnoreCase("y") ) {
            System.out.println("Please enter either n N or y Y");
            System.out.println(prompt);
            input = pipe.nextLine();
        }
        if(input.equalsIgnoreCase("n")) {
            return false;
        }else {
            return true;
        }
    }



}