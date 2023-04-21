import java.util.ArrayList;
import java.util.Scanner;


public class MtBullerResort {
 
 public static finial double Beginner_Lesson_Fee = 25.0;
 public static finial double Intermediate_Lesson_Fee = 20.0;
 public static final double Expert_Lesson_Fee = 15.0;
 
 public static final double Full_Day_Lift_Pass_Price = 26.0;
 public static final double Lift_Pass_5_Days_Disocunt = 0.1;
 public static final double Lift_Pass_Season_Price = 200.0;
 
 public static final String Customers_File_Name = "customer.txt";
 public static final Packages_Flies_Name = 'packages.txt";
 
 
puble static Arraylist<Accommodation> accommodations = new ArrayList<Accommodation> ();
public static Scanner scanner = ner Scanner(System.in);
public static void main(String[] args {

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

pubic static ArrayList<Customer> customers = new ArrayList<Customer>();
public static Scanner scanner = ner Scanner(System.in);
public static void main(String[] args {

customers.add(new Customer("001", "Teresa", "Beginner"));
customers.add(new Customer("002", "Randy", "Intermediate"));
customers.add(new Customer("003", "Michelle", "Expert"));
loadCustomerFromFile();
loadPackagesFromFile();

 int choice;
 do {
  displayMenu();
  System.outprint("Enter you choice: ");
  choice = scanner.nextInt();
  scanner.nextLine();
  switch (choice) :
    case 1:
      displayAccommodations();
      break;
     case 2: 
      displayAvailableAccommdations();
      break;
     case 3:
      addCustomer()
      break;
     case 4;
      listCustomers();
      breal;
     case 5;
      creatPackage();
      break;
     case 6;
      addLiftPassToPackage();
      break;
     case 7;
      addLessonFeesToPackage();
      break;
     case 8;
      listPackages();
      break;
     case 9;
      savePackagestoFile();
      break;
      case 10;
        loadPackagesFromFile();
        break;
        case 11;
        exit();
    
   




