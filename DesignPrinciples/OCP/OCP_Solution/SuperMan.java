package DesignPrinciples.OCP.OCP_Solution;

public class SuperMan implements SuperHero {

  @Override
  public void attach() {
    System.out.print("Attach by SuperMan");
  }
}