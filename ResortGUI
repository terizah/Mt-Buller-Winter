





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

        // Create main frame
        setTitle("Resort GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        tabbedPane = new JTabbedPane();

        // Create tab panels
        accommodationsTab = new JPanel();
        customersTab = new JPanel();
        travelPackagesTab = new JPanel()
        
          // Initialize AccommodationsTab components
        accommodationsListModel = new DefaultListModel<>();
        accommodationsList = new JList<>(accommodationsListModel);
        displayAllAccommodationsButton = new JButton("Display All Accommodations");
        displayAvailableAccommodationsButton = new JButton("Display Available Accommodations");

        // Initialize CustomersTab components
        customersListModel = new DefaultListModel<>();
        customersList = new JList<>(customersListModel);
        addCustomerButton = new JButton("Add Customer");
        listCustomersButton = new JButton("List Customers");

        // Initialize TravelPackagesTab components
        packagesListModel = new DefaultListModel<>();
        packagesList = new JList<>(packagesListModel);
        createPackageButton = new JButton("Create Package");
        addLiftPassButton = new JButton("Add Lift Pass to Package");
        addLessonFeesButton = new JButton("Add Lesson Fees to Package");
        listPackagesButton = new JButton("List Packages");
        savePackagesButton = new JButton("Save Packages to File");
        readPackagesButton = new JButton("Read Packages from File");
        
         // Add components to AccommodationsTab
        accommodationsTab.setLayout(new BorderLayout());
        accommodationsTab.add(new JScrollPane(accommodationsList), BorderLayout.CENTER);
        accommodationsTab.add(displayAllAccommodationsButton, BorderLayout.NORTH);
        accommodationsTab.add(displayAvailableAccommodationsButton, BorderLayout.SOUTH);

        // Add components to CustomersTab
        customersTab.setLayout(new BorderLayout());
        customersTab.add(new JScrollPane(customersList), BorderLayout.CENTER);
        customersTab.add(addCustomerButton, BorderLayout.NORTH);
        customersTab.add(listCustomersButton, BorderLayout.SOUTH);

        // Add components to TravelPackagesTab
        travelPackagesTab.setLayout(new BorderLayout());
        travelPackagesTab.add(new JScrollPane(packagesList), BorderLayout.CENTER);

        JPanel packageButtonsPanel = new JPanel();      
        
        
