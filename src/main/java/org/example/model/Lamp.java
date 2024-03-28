package org.example.model;
import org.example.model.enums.LampType;


public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;


    public  Lamp(LampType style, boolean battery, int globalRating){
        this.battery=battery;
        this.style=style;
        this.globRating=globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
