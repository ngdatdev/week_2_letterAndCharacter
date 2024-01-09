/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_view;

import model.StringSplit;

/**
 *
 * @author admin
 */
public class CountControlelr extends Menu<String>{

    private StringSplit sp;

    public CountControlelr(String input) {
        super("Count string", new String[]{"Counting words", "Counting character", "Exit"});
        sp = new StringSplit(input);
    }
    
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println(sp.getWords());
                break;
            case 2: 
                System.out.println(sp.getCharacters());
                break;
            case 3:
                exitMenu();
        }
    }
    
}
