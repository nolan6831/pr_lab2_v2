package moves;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp() {super(Type.FIGHTING,0,100);}

    @Override
    protected void applySelfEffects(Pokemon poke) {
        poke.setMod(Stat.ATTACK, 1);
        poke.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {return "uses bulk up";}
}
