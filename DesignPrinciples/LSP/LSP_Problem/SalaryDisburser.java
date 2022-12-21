package DesignPrinciples.LSP.LSP_Problem;

import java.util.*;

// Had to handle exception for Volunteer employee type thats why this is not the right way to inherite violating LSP.
public class SalaryDisburser {

  public void disburseSalaries(List<Employee> employees) {
    for (int i = 0; i < employees.size(); i++) {
      Employee employee = employees.get(i);
      if (employee instanceof Volunteer) {
        continue;
      }
      employee.calculateSalary();
    }
  }

}