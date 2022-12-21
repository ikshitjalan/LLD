package DesignPrinciples.LSP.LSP_Problem;

public class Contractual extends Employee {

  public Contractual(int employeeID) {
    super(employeeID);
  }

  @Override
  public double calculateSalary() {
    System.out.println("Contractual Salary");
    return 0;
  }
}