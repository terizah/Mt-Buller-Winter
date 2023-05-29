





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
        
        
        
