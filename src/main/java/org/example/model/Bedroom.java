package org.example.model;

public class Bedroom extends Room{

    private String name;

    private Bed bed;

    private Wardrobe wardrobe;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3,
                   Wall wall4, Carpet carpet, Lamp lamp,
                   Ceiling ceiling, String name,
                   Bed bed, Wardrobe wardrobe) {
        super(wall1, wall2, wall3, wall4, carpet, lamp, ceiling);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void createBedroom(){
        bed.make();
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                '}';
    }
}
