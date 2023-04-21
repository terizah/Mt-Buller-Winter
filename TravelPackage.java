import java.uyil.ArrayList;
import java.util.List;

public class Package {
  private Accommodation accommodation;
  private Customer customer;
  private Lessons lessons;
  private boolean hasLiftPass;
  
  public Package(Accommodation accommodation) {
    this.accommodation = accommodation; 
    this.lesson = new ArrayList<Lesson>();
}

public Accommodation getAccommodation() {
  return accommodation;
}

public Customer getCustomer() {
  return customer;
}

public Lessons getlessons() {
  lessons.add(lesson);
}

public boolean has LiftPass() {
  return hasLiftPass;
}

public void setAccommodation(Accommodation accommodation) {
  this.accommodation;
}

public void setCustomer (Customer customer) {
  this.customer = customer;
}

public void addLesson(Lesson lesson) {
  lesson.add(Lesson);
}

public void setHasLiftPass(boolean hasliftPass) {
  this.has LiftPass = hasLiftPass;
}

public double getTotalCost() {
  double cost = accommodation.getPricePerNight() * customer.getNumNights();
  
  if (hasLiftPass) { 
    cost += customer.getNumDays() * 26.0;
  }
  
  for (Lesson lesson : lessons) {
    cost += lesson.getFee(); 
    }
    
    return cost;
    }
  }
  
