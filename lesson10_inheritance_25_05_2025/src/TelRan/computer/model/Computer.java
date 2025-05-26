package TelRan.computer.model;

import java.util.Objects;

public class Computer {
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;


    public Computer() {};

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display(){
        System.out.println(" Brand" + brand + " CPU "+
                cpu + " RAM "+ ram + " SSD "+ ssd);
    }

    @Override
    public String toString() {
        return " Brand" + brand + " CPU "+
                cpu + " RAM "+ ram + " SSD "+ ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {// index для equals
        return Objects.hash(cpu, ram, ssd, brand);
    }
}
//default  - package
// public - everywhere
// private -
// protected == package default
//