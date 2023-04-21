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

2.
ArrayList<Customer> customers = new ArrayList<Customer>();
customers.add(new Customer("001", "John", "Beginner"));
customers.add(new Customer("002", "Mary", "Intermediate"));
customers.add(new Customer("003", "Tom", "Expert"));

3.
public static void main(String[] args) {
    ArrayList<Accommodation> accommodations = new ArrayList<Accommodation>();
    accommodations.add(new Accommodation("001", "Hotel", 200, true));
    accommodations.add(new Accommodation("002", "Apartment", 150, true));
    accommodations.add(new Accommodation("003", "Chalet", 300, true));
    // add more accommodations here
    
    ArrayList<Customer> customers = new ArrayList<Customer>();
    customers.add(new Customer("001", "John", "Beginner"));
    customers.add(new Customer("002", "Mary", "Intermediate"));
    customers.add(new Customer("003", "Tom", "Expert"));
    
    MtBullerResort resort = new MtBullerResort(accommodations, customers);
    // start your application here
}

4.
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the customer ID: ");
String customerId = scanner.nextLine();

System.out.println("Enter the start date (in yyyy-MM-dd format): ");
String startDateStr = scanner.nextLine();
try {
    LocalDate startDate = LocalDate.parse(startDateStr);
} catch (DateTimeParseException e) {
    System.out.println("Invalid date format. Please enter a date in yyyy-MM-dd format.");
    // handle the exception here
}

System.out.println("Enter the duration (in days): ");
int duration = scanner.nextInt();

5.
try {
    // some code that may throw an exception
} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
    // handle the exception here
}

