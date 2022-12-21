package DesignPrinciples.OCP;

public enum SuperHero {
  IRON_MAN,
  BAT_MAN,
  SUPER_MAN;

  public void attachIronMan() {
    System.out.print("Iron Man is attaching ...");
  }

  public void attachBatMan() {
    System.out.print("Bat Man is attaching ...");
  }

  public void attachSuperMan() {
    System.out.print("Super Man is attaching ...");
  }

}