package org.example;

import org.example.model.Bed;
import org.example.model.Ceiling;
import org.example.model.Lamp;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
    Lamp lamp= new Lamp(LampType.NEON,true,100);
    lamp.turnOn();

        Ceiling ceiling=new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Bed bed =new Bed("double",2,2,2,2);

    }


}