package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Alomomola extends Pokemon {
    public Alomomola(String name, int level) {
        super(name, level);
        super.setStats(165,75,80,40,45,65);
        super.setType(Type.WATER);
        this.addMove(new Scald());
        this.addMove(new IceBeam());
        this.addMove(new Blizzard());
        this.addMove(new HealPulse());
    }
}