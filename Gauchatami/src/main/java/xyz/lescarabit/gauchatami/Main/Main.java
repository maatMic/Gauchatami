/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.Main;

import xyz.lescarabit.gauchatami.entities.AlimentList;
import xyz.lescarabit.gauchatami.entities.Gauchatami;

/**
 *
 * @author matformation
 */
public class Main {
    public static void main(String[] args) {
        Gauchatami.gauchatami.setName("bob");
        Gauchatami carl = new Gauchatami(1);
        carl.getTastes().put("salty", 35);
        System.out.println(Gauchatami.gauchatami.toString());
        System.out.println(AlimentList.alimentsList.get(0));
        System.out.println(Gauchatami.gauchatami.getTastes().get("salty"));
        System.out.println(carl.getTastes().get("salty"));
    }
}
