package DesignPrinciples.OCP.OCP_Solution;

import java.util.List;

public class Attacher{

  public void attachBySuperHeros(List<SuperHero> superHeros){
    for(int i=0;i<superHeros.size();i++){
      SuperHero superHero = superHeros.get(i);
      superHero.attach();
    }
  }
}