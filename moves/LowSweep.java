package moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {super(Type.FIGHTING, 65, 100);}

    @Override
    protected void applyOppEffects(Pokemon poke){
        poke.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {return "uses low sweep";}


}
