/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.lescarabit.gauchatami.entities;

/**
 *
 * @author matformation
 */
public class Gauchatami {

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
    Taste tastes;
    

    public Gauchatami(String name, int id, Taste tastes) {
        this.name = name;
        this.id = id;
        this.hunger = 0;
        this.tiredness = 0;
        this.boredom = 0;
        this.dirt = 0;
        this.health = 100;
        this.cryes = false;
        this.tastes = tastes;
        this.currentState = State.egg;
    }

    public Gauchatami() {
    }

    //////////////
    public String eat(Food food){
        if (currentState.equals("atami") && tastes.getTasteList().get(food.name) < 33) {
            food.stock --;
            return name + " déteste cet aliment, et refuse de le manger. Quel gaspillage!";
        }
        
        else if (hunger - food.nutritional_value < 0){
           food.stock --;
           puke();
        }
        food.stock --;
        hunger -= food.nutritional_value;
        tastes.tasteList.put(food.name, tastes.getTasteList().get(food.name) + 1);
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

    public Taste getTastes() {
        return tastes;
    }

    public void setTastes(Taste tastes) {
        this.tastes = tastes;
    }

    /////////////////////////////////////////
    @Override
    public String toString() {
        return "Gauchatami{" + "name=" + name + ", id=" + id + ", hunger=" + hunger + ", tiredness=" + tiredness + ", boredom=" + boredom + ", dirt=" + dirt + ", health=" + health + ", cryes=" + cryes + ", tastes=" + tastes + '}';
    }

}
