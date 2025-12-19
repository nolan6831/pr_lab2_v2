package moves;

import ru.ifmo.se.pokemon.*;


public class Scald extends SpecialMove {
    public Scald() {super(Type.WATER, 80,100);}

    @Override
    protected void applyOppEffects(Pokemon poka){
        if (Math.random() < 0.3) {
            Effect.burn(poka);
        }
    }

    @Override
    protected String describe() {return "using scald";}
}

