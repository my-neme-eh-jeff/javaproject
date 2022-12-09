package javapracs;

import java.util.*;

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        while (ch != 'q') {

            System.out.println("Enter the operation you want to perform\n");
            System.out.println("1.Add at a specific position\n2.Delete an item\n3.Display list");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    a.add(index, value);

                    break;
                }
                case 2: {
                    break;
                }
                case 3:{
                    System.out.println(a);
                }
            }
            Vector <String> abc = new Vector<String>();
            abc.add("");
            System.out.println("Enter q to exit");
            ch = sc.next().charAt(0);
        }
    }
}
