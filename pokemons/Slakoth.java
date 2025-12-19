package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level) {
        super(name, level);
        super.setStats(60,60,60,35,35,30);
        super.setType(Type.NORMAL);
        this.addMove(new BulkUp());
        this.addMove(new RockSlide());
    }
}
