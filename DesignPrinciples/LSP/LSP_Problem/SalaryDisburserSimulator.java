package DesignPrinciples.LSP.LSP_Problem;

import java.util.*;

public class SalaryDisburserSimulator {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Intern(1));
    employees.add(new FTE(2));
    employees.add(new Contractual(3));
    employees.add(new Volunteer(4));

    SalaryDisburser salaryDisburser = new SalaryDisburser();
    salaryDisburser.disburseSalaries(employees);
  }
}