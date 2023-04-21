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
