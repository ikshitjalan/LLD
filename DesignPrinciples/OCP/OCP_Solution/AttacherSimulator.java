package DesignPrinciples.OCP.OCP_Solution;

import java.util.*;

public class AttacherSimulator {

  public static void main(String[] args) {
    Attacher attacher = new Attacher();
    List<SuperHero> superHeros = new ArrayList<>();
    superHeros.add(new BatMan());
    superHeros.add(new SuperMan());
    superHeros.add(new IronMan());

    attacher.attachBySuperHeros(superHeros);
  }
}