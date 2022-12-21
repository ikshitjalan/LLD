package DesignPrinciples.OCP.OCP_Solution;

public class IronMan implements SuperHero {

  @Override
  public void attach() {
    System.out.print("Attach by IronMan");
  }
}