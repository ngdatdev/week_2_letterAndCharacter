/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_view;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Library {

    private final Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.println(msg + ": ");
        return sc.nextLine();
    }

}
