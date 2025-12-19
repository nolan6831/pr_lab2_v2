package pokemons;

import moves.*;

public class Vigoroth extends Slakoth{
    public Vigoroth(String name, int level){
        super(name, level);
        super.setStats(80,80,80,55,55,90);
        this.addMove(new FurySwipes());
    }
}
