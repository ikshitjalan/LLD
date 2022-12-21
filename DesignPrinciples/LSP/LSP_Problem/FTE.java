package DesignPrinciples.LSP.LSP_Problem;

public class FTE extends Employee {

  public FTE(int employeeID) {
    super(employeeID);
  }

  @Override
  public double calculateSalary() {
    System.out.println("FTE Salary");
    return 0;
  }
}