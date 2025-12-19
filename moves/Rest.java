package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {super(Type.PSYCHIC,0,100);}

    @Override
    protected void applySelfEffects(Pokemon poke){
        int healing = (int)(poke.getStat(Stat.HP) - poke.getHP());
        poke.setMod(Stat.HP, -healing);

        Effect ef = new Effect().condition(Status.SLEEP).turns(2);
        poke.addEffect(ef);
    }
    @Override
    protected String describe() {return "uses rest";}
}
