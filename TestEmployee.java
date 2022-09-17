// DRY - Don't Repeat YourSelf
public class TestEmployee {
    // main - to run and test the code
    public static void main(String[] args) {
        Employee ram;
        // ram is a reference variable 
        // Employee is a Type/class
        // () - Calling of Something
        // Function() - calling Function
        // Class() - calling constructor
        //ram = new Employee();
        ram = new Employee(1001, "Ram", 99099);
        ram.print();
        ram.setSalary(ram.getSalary() + 1000);
        // System.out.println(ram.id); // 88.id
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        //ram.takeInput(1001, "Ram", 9999); // takeInput is call by ram 
        // 88.takeInput();
         //ram.id = 1001;
        // ram.name = "Ram Kumar";
        // ram.salary = 9999;
        //ram.print();
        Employee shyam = new Employee(1002, "Shyam",22333);
       // shyam.takeInput(1002, "Shyam", 5555);
        shyam.print();
        // System.out.println(ram.id); // 88.id
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        // new Employee() Object Create 
        // When Object is created then memory is allocated.
        // memory allocation is done using a new keyword.
    }
}
