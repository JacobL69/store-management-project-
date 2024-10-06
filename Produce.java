public class Produce {

    public String produce;
    public String expirationDate;
    public String brand;
    public double price;

   
    public Produce() {
    this.produce = "no produce found";
    this.expirationDate = "no expiration found";
    this.brand = "no brand found";
    this.price = 0.0;
    }

 
    public Produce(String produce, String expirationDate, String brand, double price) {
    this.produce = produce;
    this.expirationDate = expirationDate;
    this.brand = brand;
    this.price = price;
    }

    public String getProduce() {
    return produce;
    }

    public void setProduce (String produce) {
    this.produce = produce;
    }


    public String getExpirationDate() {
    return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    }

    public String getBrand() {
    return brand;
    }
   
    public void setBrand(String brand) {
    this.brand = brand;
    }

    public double getPrice() {
    return price;
    }

    public void setPrice(double price) {
    this.price = price;
    }
    public String toString() {
    return "Produce: " + produce +
    ", ExpirationDate: " + expirationDate +
    ", Brand: " + brand +
    ", Price: $" + price;
    }
}

