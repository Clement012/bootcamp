package objects;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {

  private double inch;

  private double cpu;

  private double ram;

  private double risk;

  private Color color;

  public double getInch() {
    return this.inch;
  }

  public double getCPU() {
    return this.cpu;
  }

  public double getRam() {
    return this.ram;
  }

  public double getRisk() {
    return this.risk;
  }

  public Color getColor() {
    return this.color;
  }

  public MacbookAir(double inch, double cpu, double ram, double risk,
      Color color) {
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.risk = risk;
    this.color = color;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir ma = (MacbookAir) obj;
    // return this.inch == ma.getInch()
    // && this.cpu == ma.getCPU()
    // && this.ram == ma.getRam()
    // && this.risk == ma.getRisk()
    // && this.color == ma.getColor();
    return Objects.equals(this.inch, ma.getInch())
        && Objects.equals(this.cpu, ma.getCPU())
        && Objects.equals(this.ram, ma.getRam())
        && Objects.equals(this.risk, ma.getRisk())
        && Objects.equals(this.color, ma.getColor());
  }

  @Override
  public int hashCode() { // suppose same hashcode ma&&ma3
    return Objects.hash(this.inch, this.cpu, this.ram, this.risk, this.color);
  }

  public static void main(String[] args) {
    MacbookAir ma = new MacbookAir(5, 4, 5, 3, Color.SILVER);
    MacbookAir ma2 = new MacbookAir(ma.getInch(), ma.getCPU(), ma.getRam(),
        ma.getRisk(), ma.getColor());
    MacbookAir ma3 = new MacbookAir(5, 4, 5, 3, Color.SILVER);
    // MacbookAir ma3 = ma;
    System.out.println(ma == ma2); // false
    System.out.println(ma.equals(ma2)); // true
    System.out.println(ma.equals(ma3)); // true

    System.out.println(ma.hashCode()); // 925858445 Object.class hashcode()
    System.out.println(ma2.hashCode()); // 798154996
    System.out.println(ma3.hashCode()); // 681842940 //after override  -> hashcode become same

     // Sorting //rules&&條件
    int[] arr = new int[] {10, 5, 2, 4};
    Arrays.sort(arr); // merge sort, ascending sorting
    System.out.println(Arrays.toString(arr));

    MacbookAir[] arr2 = new MacbookAir[] {new MacbookAir(0, 0, 0, 0, null),
        new MacbookAir(0, 0, 0, 0, null)};

  }
}
