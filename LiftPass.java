public class LiftPass {
  private int passId;
  private String type;
  private double pricePerDay;
  
public LiftPass(int passId, Stirng type, double pricePerDay) {
  this.passId = passId;
  this.type = type;
  this.pricePerDay = pricePerDay;
}

public int getPassId () {
  return passId;
}

public String getType () {
  return type;
}
  
public double getPricePerDay () {
  return pricePerDay;
}
  
public void setPassId (int passID) {
  this.passId = passId;
}
  
public void setType (String type) {
  this.type = type;
}
  
public void setPricePerDay (double pricePerDay) {
  this.pricePerDay = pricePerDay;
}
  
public double calcuateDiscountedPrice (int numOfDays) {
  double totalPrice = numOfDays * pricePerDay;
  if (numOfDays >= 5) {
    totalPrice *= 0.9;
  } else if (numOfDays == 1) {
      totalPrice = pricePerDay;
  } else {
      totalPrice *= numOfDays;
  }
    if (totalPrice > 200) {
        totalPrice = 200; 
  }
      return totalPrice;
}
  
public String toString() {
  return "Pass Id: " + passId + ", type: + type + ", pricePerDay: " + pricePerDay + 
}
  
