/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_79
 */
public class Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }


public String name;
public double mScore;
public double fScore;

public void showGrade(){
    double score = (mScore * 0.4) + (fScore * 0.4) + 20;
    System.out.println("Your grade : "+ score);
}
}


