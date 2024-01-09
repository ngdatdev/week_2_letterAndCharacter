/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_view;

/**
 *
 * @author admin
 */
public class AppRun {
    public static void main(String[] args) {
        Library l = new Library();
        String input = l.getString("Enter string");
        new CountControlelr(input).run();
    }
}
