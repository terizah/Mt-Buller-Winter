import java.util.ArrayList;
import java.util.Scanner;

public class Accommodation {
  private int accommodationID;
  private String type;
  private double price;
  private boolean availability = true;
  static int nextID = 1;
  
 public Accommodation(String type, double price) {
  this.type = type;
  this.price = price;
  accommodationID = nnextID++;
 }

 public int getAccommodationID () {
  return AccommodationID;
 }
 
 public String getType () {
  return type;
 }

  public double getPrice () {
    return price;
 }
 
 public boolean getAvailability () {
  return availability;
}

public void setType (String type) {
  this.type = type;
 }
 
 public void setPrice (double price) {
  this.price = price;
 }
  
 public void setAvailability (boolean availability) {
  this.availability = availability;
 }
 
 public String toString () {
  return "Accommodation ID: " + accommodationID + ", type: + type + ", price: " + price + ", available? " + availability;
 }
}


  

