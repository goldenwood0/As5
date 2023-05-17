package As5;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Your number is " + find_Number(1,100));
    }
    public static int find_Number(int start, int end) {
        if(start == end) return start;
        Scanner scanner = new Scanner(System.in);
        int mid = (end+start)/2;
        System.out.println("Is your number greater than " + mid);
        switch(scanner.nextLine()) {
            case "yes":
                return find_Number(mid + 1, end);
            case "no":
                return find_Number(start, mid);
            default:
                System.out.println("You must enter only ''yes or 'no' answers!");
                return find_Number(start, end);
        }
    }
}
