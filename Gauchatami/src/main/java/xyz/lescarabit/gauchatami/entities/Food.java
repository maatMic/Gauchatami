/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.entities;

/**
 *
 * @author matformation
 */
public class Food {
    String name;
    String taste;
    int nutritional_value;
    int stock;

    public Food(String name, String taste, int nutritional_value, int stock) {
        this.name = name;
        this.taste = taste;
        this.nutritional_value = nutritional_value;
        this.stock = stock;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getNutritional_value() {
        return nutritional_value;
    }

    public void setNutritional_value(int nutritional_value) {
        this.nutritional_value = nutritional_value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", taste=" + taste + ", nutritional_value=" + nutritional_value + ", stock=" + stock + '}';
    }
    
    
}
