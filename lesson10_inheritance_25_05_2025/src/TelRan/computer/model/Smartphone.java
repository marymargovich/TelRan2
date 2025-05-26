package TelRan.computer.model;

public class Smartphone extends Laptop{
   private long imei;

    public Smartphone(String cpu,
                      int ram,
                      int ssd,
                      String brand,
                      double hours,
                      double weight,
                      long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" IMAI " + imei );
    }

    @Override
    public String toString() {
        return super.toString()+" IMAI " + imei;
    }
}
