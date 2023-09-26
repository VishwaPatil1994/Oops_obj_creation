public class Employee {
  int id = 101;
  String name = "John";
  int salary = 1000;

  public static void main(String[] args) {
    System.out.println("Start");
    Employee emp = new Employee();
    System.out.println("Employee id is " + emp.id);
    System.out.println("Employee name is " + emp.name);
    System.out.println("Employee salary is " + emp.salary);
    System.out.println("-----------------");
    System.out.println("Employee name is " + emp.name + " and his id number is " + emp.id
        + " and he is getting salary " + emp.salary);

  }

}
