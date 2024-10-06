public class Milk extends Produce {

private double volume; 
private String fatContent; 

public Milk() {
super(); 
this.volume = 0.0;
this.fatContent = "no fat content found";
}

public Milk(String produce, String expirationDate, String brand, double price, double volume, String fatContent) {
super(produce, expirationDate, brand, price);
this.volume = volume;
this.fatContent = fatContent;
}

public double getVolume() {
return volume;
}

public void setVolume(double volume) {
this.volume = volume;
}

public String getFatContent() {
return fatContent;
}

public void setFatContent(String fatContent) {
this.fatContent = fatContent;
}

public String toString() {
return super.toString() + ", Volume: " + volume + "L" + ", Fat Content: " + fatContent;
    }
}