package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {super(Type.NORMAL,0,85);}

    @Override
    protected void applyOppEffects(Pokemon poke){
        Effect.confuse(poke);
        poke.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected String describe() {return "uses swagger";}
}
