public class superr {
    public static void main(String[] args) {
         // super = Refers to the parent class (subclass <- Superclass)
        //          Used in constructors and method overriding
        //          Calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Garry");
        Students students = new Students("Harry", "Potter", 3.25);
        Employee employee = new Employee("Thomas", "Rick", 10000);


        System.out.println(students.gpa);
        students.showGPA();
        employee.showSalary();

    }
}
