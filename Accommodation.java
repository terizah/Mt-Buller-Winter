import java.util.ArrayList;
import java.util.Scanner;

public class Accommodation {
  private int accommodationID;
  private String type;
  private double pricePerNight;
  private boolean availability = true;
  static int nextID = 1;
  
 public Accommodation(String type, double pricePerNight) {
  this.type = type;
  this.pricePerNight = pricePerNight;
  accommodationID = nnextID++;
 }

 public int getAccommodationID () {
  return AccommodationID;
 }
 
 public String getType () {
  return type;
 }

  public double getPricePerNgith () {
    return pricePerNight;
 }
 
 public boolean getAvailability () {
  return availability;
}

public void setType (String type) {
  this.type = type;
 }
 
 public void setPricePerNight (double pricePerNight) {
  this.pricePerNight = pricePerNight;
 }
  
 public void setAvailability (boolean availability) {
  this.availability = availability;
 }
 
 public String toString () {
  return "Accommodation ID: " + accommodationID + ", type: + type + ", pricePerNight: " + pricePerNight + ", available? " + availability;
 }
}

public class Main {
  public static void main(String[] args) {
Arraylist<Accommodation> accommodations = new ArrayList<Accommodation> ();
  accommodations.add(new Accommodation("001", "Hotel", 150, true));
  accommodations.add(new Accommodation("002", "Inn", 100, true));
  accommodations.add(new Accommodation("003", "Apartment", 200, true));
  accommodations.add(new Accommodation("004", "Cabin", 150, true));
  accommodations.add(new Accommodation("005", "Lodge", 250, true));
  accommodations.add(new Accommodation("006", "Campgroud", 100, true));
  accommodations.add(new Accommodation("007", "Motel", 110, true));
  accommodations.add(new Accommodation("008", "Cottage", 150, true));
  accommodations.add(new Accommodation("009", "Resort", 300, true));
  accommodations.add(new Accommodation("001", "Suite", 400, true));

System.out.println(accommodations);
 }
}




  

