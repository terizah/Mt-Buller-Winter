public class Customer {
  private int custId
  private String name;
  private int age;
  private String skiingLevel; 
  static int nextID = 100;
  
public customer(String name, int age, String skiingLevel) {
  this.name = name;
  this.age = age;
  this.skiingLevel = skiingLevel;
  custId = nnextID++;
 }
 
public int getCustId () {
  return custId;
}

public String getName () {
  return name;
}

public int getAge () {
  return age;
}

public String getSkiingLevel () {
  return skiingLevel;
}

public void setName (String name) {
  this.name = name;
}

public void addCustomer (String name, int age, String skiingLevel) {
  
  Customer newCustomer = new Customer(name, age, skiingLevel);
  customerList.add(newCustomer);


 
  
 
 
