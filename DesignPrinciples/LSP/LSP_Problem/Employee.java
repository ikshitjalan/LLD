package DesignPrinciples.LSP.LSP_Problem;

//Abstract class to implement the calculateSalary according to different types of employees
public abstract class Employee {

  public final int employeeID;

  public Employee(final int employeeID) {
    this.employeeID = employeeID;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public abstract double calculateSalary();
}