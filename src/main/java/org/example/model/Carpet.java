package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private PaintColor color;
    private int width,height;


    public Carpet(PaintColor color, int width,int height){
        this.height=height;
        this.color=color;
        this.width=width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public PaintColor getColor(){
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }


}
