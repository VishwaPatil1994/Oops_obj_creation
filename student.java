/*Accessing Non-static variable inside same class */
class student {

  int age = 20;
  String name = "Dinga";

  public static void main(String[] args) {
    System.out.println("--------------------------------");
    student s = new student();
    System.out.println("Age: " + s.age);
    System.out.println("Name: " + s.name);
    System.out.println("--------------------------------------------------------");
    System.out.println(s.name + " is " + s.age + " years old");

  }
}