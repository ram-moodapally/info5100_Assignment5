/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author ramcharan
 */
public class Dishes {
    private String name;
    private Double price;
    private String description;
    private int dishEnergy;

    public int getDishEnergy() {
        return dishEnergy;
    }
    

    public Dishes(String name,String description,Double price,int energy) {
        this.name=name;
        this.price=price;
        this.description=description;
        this.dishEnergy = energy;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return name;
    }
}
