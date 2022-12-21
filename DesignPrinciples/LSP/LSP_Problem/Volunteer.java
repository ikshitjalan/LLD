package DesignPrinciples.LSP.LSP_Problem;

// Volunteer class do not need to implement calculateSalary method thats why throws exception
public class Volunteer extends Employee {

  public Volunteer(int employeeID) {
    super(employeeID);
  }

  @Override
  public double calculateSalary() {
    throw new RuntimeException("Volunteer's dont draw salaries");
  }
}