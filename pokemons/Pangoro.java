package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public final class Pangoro extends Pancham{
    public Pangoro(String name, int level){
        super(name, level);
        super.setStats(95,124,78,69,71,58);
        super.setType(Type.DARK);
        this.addMove(new XScissor());
    }
}
