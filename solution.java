public class solution {
  public static void main(String[] args) {
    employeee employee1 = new employeee(100, "Dinga", 6000.0);
    employeee employee2 = new employeee(101, "Dingi", 5000.0);
    employeee employee3 = new employeee(102, "Tinga", 8000.0);
    // re-initialize
    employee1.id = 200;
    employee1.name = "Sntosh";
    employee1.salary = 20000.0;

    employee2.id = 201;
    employee2.name = "Hanumesh";
    employee2.salary = 15000.0;

    employee3.id = 203;
    employee3.name = "Vishwanath";
    employee3.salary = 10000.0;

    System.out.println("employee1 ID: " + employee1.id + " Name: " + employee1.name + " salary: " + employee1.salary);
    System.out.println("employee1 ID: " + employee2.id + " Name: " + employee2.name + " salary: " + employee2.salary);
    System.out.println("employee1 ID: " + employee3.id + " Name: " + employee3.name + " salary: " + employee3.salary);

  }
}
