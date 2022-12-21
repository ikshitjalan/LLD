package DesignPrinciples.LSP.LSP_Problem;

public class Intern extends Employee {

  public Intern(int employeeID) {
    super(employeeID);
  }

  @Override
  public double calculateSalary() {
    System.out.println("Intern Salary");
    return 0;
  }
}