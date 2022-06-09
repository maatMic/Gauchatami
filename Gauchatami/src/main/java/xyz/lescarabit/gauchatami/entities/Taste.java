/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.entities;

import java.util.HashMap;

/**
 *
 * @author matformation
 */
public class Taste {
    
    
    HashMap<String, Integer> tasteList = new HashMap<String, Integer>(){{
        put("sweet", 0);
        put("salty", 0);
        put("acid", 0);
        put("bitter", 0);
        put("umami", 0);
    }};

    public Taste() {
    }
    //////////////////////////////////////////////////
    
    //////////////////////////////////////////////////
    public int getSweet() {
        return tasteList.get("sweet");
    }

    public void setSweet(int sweet) {
        tasteList.put("sweet", sweet);
    }
    
    public int getSalty() {
        return tasteList.get("salty");
    }

    public void setSalty(int salty) {
        tasteList.put("salty", salty);
    }
    
    public int getAcid() {
        return tasteList.get("acid");
    }

    public void setAcid(int acid) {
        tasteList.put("acid", acid);
    }
    
    public int getBitter() {
        return tasteList.get("bitter");
    }

    public void setBitter(int bitter) {
        tasteList.put("bitter", bitter);
    }

    public int getUmami() {
        return tasteList.get("umami");
    }

    public void setUmami(int umami) {
        tasteList.put("umami", umami);
    }    

    public HashMap<String, Integer> getTasteList() {
        return tasteList;
    }

    public void setTasteList(HashMap<String, Integer> tasteList) {
        this.tasteList = tasteList;
    }
    
    ///////////////////////////////////////////////////////////////////
    
    
}
