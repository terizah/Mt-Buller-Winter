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

public void setCustID (int custId) {
  this.custId = custId;
}
  
public void setName (int name) {
  this.name = name;
}

public void setAge (int age) {
  this.age = age;
}

public void setSkiingLevel (String skiingLevel) {
  this.skiingLevel;
}

public String toString() {
  return "Customer ID: " + custId + ", name: + name + ", age: + age + ", skiingLevel : " + skiingLevel;
 }
}


