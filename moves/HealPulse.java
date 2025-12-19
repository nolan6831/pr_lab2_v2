package moves;

import ru.ifmo.se.pokemon.*;

public class HealPulse extends StatusMove {
    public HealPulse() {super(Type.PSYCHIC,0,100);}

    @Override
    protected void applySelfEffects(Pokemon poke){
        double heal = poke.getStat(Stat.HP) / 2;
    }

    @Override
    protected String describe() {return "uses heal pulse";}
}
