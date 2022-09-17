/*
 * class = Blue Print or Template or Skeleton
 * Class Name - Noun
 * Class Name - PascalCase
 * S O L I D Principle
 * S - SRP (Single Responsiblity Principle)
 */
// Encapsulation - Binding Data and Functions into a Single Unit , and this unit is called class.
// Fields  - Primary Fields and Secondary Fields
public class Employee{
    // Data Hiding
    // private scope is with in the class
    // Field
    private int id; // Scope , By Default scope default scope. 
    // default scope Access with in the package (folder)
    private String name;
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    private double salary; // Lazy Variable or Instance Variables - When u create object these variables comes in the Memory (Heap)
    /* BAD
    public Employee(int id, String name, double salary, String city, String email, String phone, double bonus,
            String manager, String branch, String pincode, String deptName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.bonus = bonus;
        this.manager = manager;
        this.branch = branch;
        this.pincode = pincode;
        this.deptName = deptName;
    }*/
    private String city;
    private String email;
    private String phone;
    private double bonus;
    private String manager;
    private String branch;
    private String pincode;
    private String deptName;
    // GETTER AND SETTER
    public void setSalary(double salary){
        this.salary = salary;
    }    
    public double getSalary(){
        return salary;
    }
    /*
     * Constructor - It is same like a function but with some few changes
     * Constructor name is same as class name
     * it is used to intialize the instance variables of a class
     * Constructor call when u create an object
     * Constructor call once in every object life cycle.
     * Every class has default constructor by default
     * default constructor is just an empty constructor it does nothing
     * constructor not return any thing
     * if u return something or put void in constructor it is become 
     * method.
     * u can create n number of constructor with different arguments 
     * and this thing is called constructor overloading.
     * Constructor can call another constructor by using a this keyword.
     * When constructor call another constructor it is called 
     * Constuctor chainning
     * Every class has default IMplicit constructor by default , but if u create any 
     * constructor (Param) then the given default Implicit constructor is killed
     * U need to create explicitly . i done in this example
     */
    /*
     * Function are used for logic writting 
     */
    // default 
    Employee(){
        id = 100;
        name = "";
        salary = 10.0;
        city = "Delhi";
    }
    // Param
    Employee(int id , String name, double salary){
        // this() constructor call is always on the first line
        //this(); // Constructor calling (Default Call)
        this(id, name); 
        // this.id = id;
        // this.name = name;
        this.salary = salary;
    }
    Employee(int id, String name){
        this(); 
        this.id = id;
        this.name = name;
    }
    // takeInput arguments (Scope is Local Scope (Stack))
    void takeInput(int id, String name, double salary){
        // ram is a current calling object
        // ram reference is treated by a special keyword called this
        // this is a keyword which has a current calling object reference
        //id = id; // Local Var = Local Var (Near Variable)
        this.id = id ; // Instance Var = Local Var (Shadow Problem)
        this.name = name;
        this.salary = salary;
        // id = 1001; // this.id = 1001;
        // name = "Ram"; // this.name = "Ram";
        // salary = 9999;
    }
    void print(){
        System.out.println(this.id);
        System.out.println(name); // this.name
        System.out.println(salary); // this.salary
        System.out.println(city);
    }
}