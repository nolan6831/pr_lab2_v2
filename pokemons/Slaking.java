package pokemons;

import moves.*;

public class Slaking extends Vigoroth{
    public Slaking(String name, int level){
        super(name, level);
        super.setStats(150,160,100,95,65,100);
        this.addMove(new Rest());
    }
}
