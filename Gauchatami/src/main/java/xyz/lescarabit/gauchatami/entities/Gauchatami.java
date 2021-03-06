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
public class Gauchatami {
    
    //for development purpose
    public static Gauchatami gauchatami = new Gauchatami(5);
    ///////////////////////////////////////////////////////
    String name;
    int id;
//    int id_proprietaire; à implémenter lors du basculement en mode multi

    enum State {
        egg, larva, atami, dead
    };
    int hunger;
    int tiredness;
    int boredom;
    int dirt;
    int health;
    boolean cryes;
    State currentState;
    HashMap<String, Integer> tastes;
    

    public Gauchatami(int id) {
        this.id = id;
        this.hunger = 0;
        this.tiredness = 0;
        this.boredom = 0;
        this.dirt = 0;
        this.health = 100;
        this.cryes = false;
        this.tastes = new HashMap<>();
        tastes.put("sweet", 0);
        tastes.put("salty", 0);
        tastes.put("acid", 0);
        tastes.put("bitter", 0);
        tastes.put("umami", 0);
        
        this.currentState = State.egg;
    }

    public Gauchatami() {
    }

    //////////////
    public String eat(Food food){
        if (currentState.equals("atami") && tastes.get(food.name) < 33) {
            food.stock --;
            return name + " déteste cet aliment, et refuse de le manger. Quel gaspillage!";
        }
        
        else if (hunger - food.nutritional_value < 0){
           food.stock --;
           puke();
        }
        food.stock --;
        hunger -= food.nutritional_value;
        tastes.put(food.name, tastes.get(food.name) + 1);
        return name + " se régale, et vous regarde avec des yeux pleins d'amour";
    }
    
    public String puke(){
        hunger += 30;
        tiredness += 15;
        dirt += 20;
        return "A trop se gaver, " + name + " s'est rendu malade, et a rendu le contenu de son estomac à vos pieds.";
    }
    
    public void play(int duration){
        boredom -= duration * 10;
        tiredness += duration * 5;
        if (boredom < 0){
            boredom = 0;
        }
        System.out.println("Jouer avec " + name + " l'a vraiment détendu. Toute cette activité semble l'avoir fatigué");
    }
    
    public void wash(){
        dirt -= getDirt();
        System.out.println( name + "a été lavé sa saleté est de : " + dirt);
        
    }
    
    public void cry(){
        cryes = true;
        System.out.println( name + "pleure");
    }
    
    public void die(){
        currentState = State.dead;
        System.out.println(name + " a passé l'arme à gauche");
    }
    
    public void evolve(){
        switch (currentState) {
            case egg -> {
                currentState= State.larva;
                System.out.println("Félicitations! Votre oeuf a éclos!");
            }
            case larva -> {
                currentState= State.atami;
                System.out.println("Félicitations! " +name+ " a grandi et atteint l'âge adulte.");
            }
        }
        
    }
    
    public void giveName(String name){
        this.name = name;
        System.out.println(name + " vous ragarde de ses grands yeux ronds ahuris.");
    }
    //////////////
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getDirt() {
        return dirt;
    }

    public void setDirt(int dirt) {
        this.dirt = dirt;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isCryes() {
        return cryes;
    }

    public void setCryes(boolean cryes) {
        this.cryes = cryes;
    }

    public HashMap getTastes() {
        return tastes;
    }

    public void setTastes(HashMap tastes) {
        this.tastes = tastes;
    }

    /////////////////////////////////////////
    @Override
    public String toString() {
        return "Gauchatami{" + "name=" + name + ", id=" + id + ", hunger=" + hunger + ", tiredness=" + tiredness + ", boredom=" + boredom + ", dirt=" + dirt + ", health=" + health + ", cryes=" + cryes + ", tastes=" + tastes + '}';
    }

}
