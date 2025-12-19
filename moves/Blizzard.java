package moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {super(Type.ICE, 110,70);}

    @Override
    protected void applyOppEffects(Pokemon poka){
        Effect ef = new Effect().condition(Status.FREEZE).chance(0.1);
        poka.addEffect(ef);
    }

    @Override
    protected String describe() {return "uses blizzard";}
}
