package org.example.model;

public class Bed {
    private String style;
    private int pillows,height,sheets,quilt;

    public Bed(String style,int pillows,int height,int sheets,int quilt){
        this.height=height;
        this.pillows=pillows;
        this.style=style;
        this.quilt=quilt;
        this.sheets=sheets;

    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows(){
        return pillows;
    }

    public int getHeight() {
        return height;
    }
    public int getSheets(){
        return sheets;
    }
    public int getQuilts(){
        return quilt;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}
