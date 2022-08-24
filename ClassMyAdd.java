
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_79
 */
public class ClassMyAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassMyAdd cm = new ClassMyAdd();
        System.out.println("Please insert number : ");
        int x = sc.nextInt();
        int num = cm.AddTwo(x);
        System.out.println("The result#1 is " +num);
        num = cm.AddTwo(x+5);
        System.out.println("The result#2 is " +num);
        num = cm.AddTwo(x*3+2);
        System.out.println("The result#3 is " +num);
    }

    public int AddTwo(int a) {
        int result = a+2;
        return result;
    }
}
