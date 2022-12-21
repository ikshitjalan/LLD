package DesignPrinciples.OCP.OCP_Problem;

import java.util.List;

// Problem: We are unable to extend to new features without modifying existing modules.
//          This class violates OCP as it should be open for extension but closed for        
//          modification

// Dependent upon SuperHero class
// Changes in SuperHero class leads to changes in Attacher class otherwise the code might break.
public class Attacher {
  // attachs according to the type of super hero.
  public void attachWithSuperHeros(List<SuperHero> superHeros) {
    for (int i = 0; i < superHeros.size(); i++) {
      // We dont know what super hero it is thats why used switch case.
      SuperHero superhero = superHeros.get(i);

      switch (superhero) {
        case IRON_MAN:
          superhero.attachIronMan();
          break;
        case BAT_MAN:
          superhero.attachBatMan();
          break;
        case SUPER_MAN:
          superhero.attachSuperMan();
          break;
      }

    }
  }
}