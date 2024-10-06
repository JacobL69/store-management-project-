public class Fruit extends Produce {
    
private String type; 
private double weight; 

public Fruit() {
super(); 
this.type = "no type found";
this.weight = 0.0;
}

public Fruit(String produce, String expirationDate, String brand, double price, String type, double weight) {
super(produce, expirationDate, brand, price);
this.type = type;
this.weight = weight;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

public String toString() {
return super.toString() + 
", Type: " + type + 
", Weight: " + weight + "g";
}
}