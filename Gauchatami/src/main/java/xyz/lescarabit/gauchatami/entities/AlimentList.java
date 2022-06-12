/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.entities;

import java.util.ArrayList;

/**
 *
 * @author matformation
 */
public class AlimentList {
    public static ArrayList<Food> alimentsList = new ArrayList<Food>(){{
        add(new Food("pomme", "sucré", 2, 50));
        add(new Food("langue de chat", "acide", 1, 200));
        add(new Food("pamplemousse", "amer", 3, 30));
    }};
    
}
