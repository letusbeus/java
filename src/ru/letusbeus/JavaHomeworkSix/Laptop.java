package ru.letusbeus.JavaHomeworkSix;

import java.util.Random;

public class Laptop {
    private final String manufacturer;
    private final String laptopType;
    private final int displaySize;
    private final String operatingSystem;
    private final int RAM;
    private final String graphicsController;
    private final int hdd;

    public Laptop() {
        Random rand = new Random();
        this.manufacturer = Params.manufacturers[rand.nextInt(Params.manufacturers.length)];
        this.laptopType = Params.laptopTypes[rand.nextInt(Params.laptopTypes.length)];
        this.displaySize = Params.displaySizes[rand.nextInt(Params.displaySizes.length)];
        this.operatingSystem = Params.operatingSystems[rand.nextInt(Params.operatingSystems.length)];
        this.RAM = Params.RAMCapacity[rand.nextInt(Params.RAMCapacity.length)];
        this.graphicsController = Params.graphicsControllers[rand.nextInt(Params.graphicsControllers.length)];
        this.hdd = Params.hddCapacity[rand.nextInt(Params.hddCapacity.length)];
    }

    @Override
    public String toString() {
        return "Notebook: " + manufacturer +
                ", type: " + laptopType +
                ", display size: " + displaySize + " inches" +
                ", OS: " + operatingSystem +
                ", RAM: " + RAM + " GB" +
                ", graphics: " + graphicsController +
                ", HDD: " + hdd + " GB";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public String getDisplaySize() {
        return String.valueOf(displaySize);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getRAM() {
        return String.valueOf(RAM);
    }

    public String getGraphicsController() {
        return graphicsController;
    }

    public String getHdd() {
        return String.valueOf(hdd);
    }
}
