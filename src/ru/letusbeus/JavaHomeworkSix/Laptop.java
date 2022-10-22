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

    String[] manufacturers = {"ASUS", "Lenovo", "HP", "Apple", "Acer", "Samsung", "Dell"};
    String[] laptopTypes = {"Gaming", "Business", "Office", "Ultrabook", "Allround"};
    Integer[] displaySizes = {12, 13, 14, 15, 17, 19};
    String[] operatingSystems = {"Windows", "Linux", "MacOS", "Chrome", "DOS"};
    Integer[] RAMCapacity = {4, 8, 12, 16, 24, 32};
    String[] graphicsControllers = {"Intel", "AMD", "NVIDIA", "IBM", "GIGABYTE", "MSI"};
    Integer[] hddCapacity = {64, 128, 256, 512, 1024, 2048};

    public Laptop() {
        Random rand = new Random();
        this.manufacturer = manufacturers[rand.nextInt(manufacturers.length)];
        this.laptopType = laptopTypes[rand.nextInt(laptopTypes.length)];
        this.displaySize = displaySizes[rand.nextInt(displaySizes.length)];
        this.operatingSystem = operatingSystems[rand.nextInt(operatingSystems.length)];
        this.RAM = RAMCapacity[rand.nextInt(RAMCapacity.length)];
        this.graphicsController = graphicsControllers[rand.nextInt(graphicsControllers.length)];
        this.hdd = hddCapacity[rand.nextInt(hddCapacity.length)];
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
