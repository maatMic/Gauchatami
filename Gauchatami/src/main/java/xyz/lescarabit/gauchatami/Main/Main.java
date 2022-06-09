/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.Main;

import xyz.lescarabit.gauchatami.entities.Taste;

/**
 *
 * @author matformation
 */
public class Main {
    public static void main(String[] args) {
        Taste test = new Taste();
        System.out.println(test.getSweet());
        System.out.println(test.getTasteList().get("sweet"));
        test.setSweet(15);
        System.out.println(test.getSweet());
        System.out.println(test.getTasteList().get("sweet"));
    }
}
