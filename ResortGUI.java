import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ResortGUI extends JFframe implemetns ActionListener {
    private ArraryList<Accommodation> accommodations;
    private ArraryList<Customer> customers;
    private ArraryList<TravelPackage> travelPackages;
    
     public ResortGUI() {
        accommodations = new ArrayList<>();
        customers = new ArrayList<>();
        travelPackages = new ArrayList<>();
        
        createInitialAccommodations();
        createInitialCustomers();
        
    private JTabbedPane tabbedPane;
    private JPanel accommodationsTab;
    private JPanel customersTab;
    private JPanel travelPackagesTab;
    
    private DefaultListModel<String> customersListModel;
    private JList<String> customersList;
    private JButton addCustomerButton;
    private JButton listCustomersButton;
    
    private DefaultListModel<String> packagesListModel;
    private JList<String> packagesList;
    private JButton createPackageButton;
    private JButton addLiftPassButton;
    private JButton addLessonFeesButton;
    private JButton listPackagesButton;
    private JButton savePackagesButton;
    private JButton readPackagesButton;
    
    public ResortGUI() {
        accommodations = new ArrayList<>();
        customers = new ArrayList<>();
        travelPackages = new ArrayList<>();

        setTitle("Resort GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        accommodationsTab = new JPanel();
        customersTab = new JPanel();
        travelPackagesTab = new JPanel()
        
        accommodationsListModel = new DefaultListModel<>();
        accommodationsList = new JList<>(accommodationsListModel);
        displayAllAccommodationsButton = new JButton("Display All Accommodations");
        displayAvailableAccommodationsButton = new JButton("Display Available Accommodations");

        customersListModel = new DefaultListModel<>();
        customersList = new JList<>(customersListModel);
        addCustomerButton = new JButton("Add Customer");
        listCustomersButton = new JButton("List Customers");

        packagesListModel = new DefaultListModel<>();
        packagesList = new JList<>(packagesListModel);
        createPackageButton = new JButton("Create Package");
        addLiftPassButton = new JButton("Add Lift Pass to Package");
        addLessonFeesButton = new JButton("Add Lesson Fees to Package");
        listPackagesButton = new JButton("List Packages");
        savePackagesButton = new JButton("Save Packages to File");
        readPackagesButton = new JButton("Read Packages from File");
        
        accommodationsTab.setLayout(new BorderLayout());
        accommodationsTab.add(new JScrollPane(accommodationsList), BorderLayout.CENTER);
        accommodationsTab.add(displayAllAccommodationsButton, BorderLayout.NORTH);
        accommodationsTab.add(displayAvailableAccommodationsButton, BorderLayout.SOUTH);

        customersTab.setLayout(new BorderLayout());
        customersTab.add(new JScrollPane(customersList), BorderLayout.CENTER);
        customersTab.add(addCustomerButton, BorderLayout.NORTH);
        customersTab.add(listCustomersButton, BorderLayout.SOUTH);

        travelPackagesTab.setLayout(new BorderLayout());
        travelPackagesTab.add(new JScrollPane(packagesList), BorderLayout.CENTER);

        JPanel packageButtonsPanel = new JPanel();   
        
    private void displayAllAccommodations() {
        StringBuilder accommodationInfo = new StringBuilder();
        for (Accommodation accommodation : accommodations) {
        accommodationInfo.append(accommodation.toString()).append("\n");
    }
        if (accommodationInfo.length() > 0) {
            JOptionPane.showMessageDialog(this, accommodationInfo.toString(), "All Accommodations", JOptionPane.INFORMATION_MESSAGE);
    }   else {
            JOptionPane.showMessageDialog(this, "No accommodations available.", "All Accommodations", JOptionPane.INFORMATION_MESSAGE);
    }
}   
    private void displayAllCustomers() {
        StringBuilder customerInfo = new StringBuilder();
        for (Customer customer : customers) {
        customerInfo.append(customer.toString()).append("\n");
    }
        if (customerInfo.length() > 0) {
            JOptionPane.showMessageDialog(this, customerInfo.toString(), "All Customers", JOptionPane.INFORMATION_MESSAGE);
    }   else {
            JOptionPane.showMessageDialog(this, "No customers available.", "All Customers", JOptionPane.INFORMATION_MESSAGE);
    }
}
        
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == displayAllAccommodationsButton) {
            displayAllAccommodations();
    }   else if (e.getSource() == displayAvailableAccommodationsButton) {
      
    }   else if (e.getSource() == addCustomerButton) {
       
    }   else if (e.getSource() == listCustomersButton) {
          displayAllCustomers();
    }   else if (e.getSource() == createPackageButton) {
       
    }   else if (e.getSource() == addLiftPassButton) {
     
    }   else if (e.getSource() == addLessonFeesButton) {
      
    }
}
        
        
    private void createInitialAccommodations() {  
        accommodations.add(new Accommodation("001", "Hotel", 150, true));
        accommodations.add(new Accommodation("002", "Inn", 100, true));
        accommodations.add(new Accommodation("003", "Apartment", 200, true));
        accommodations.add(new Accommodation("004", "Cabin", 150, true));
        accommodations.add(new Accommodation("005", "Lodge", 250, true));
        accommodations.add(new Accommodation("006", "Campgroud", 100, true));
        accommodations.add(new Accommodation("007", "Motel", 110, true));
        accommodations.add(new Accommodation("008", "Cottage", 150, true));
        accommodations.add(new Accommodation("009", "Resort", 300, true));
        accommodations.add(new Accommodation("010", "Suite", 400, true));
        
    private void createInitialCustomers() {
        customers.add(new Customer("001", "Teresa", "Beginner"));
        customers.add(new Customer("002", "Randy", "Intermediate"));
        customers.add(new Customer("003", "Michelle", "Expert"));
            
    
        
        
        
