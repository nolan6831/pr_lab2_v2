package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Pancham extends Pokemon {
    public Pancham(String name, int level) {
        super(name, level);
        super.setStats(67,82,62,46,48,43);
        super.setType(Type.FIGHTING);
        this.addMove(new StoneEdge());
        this.addMove(new Swagger());
        this.addMove(new LowSweep());

    }
}
