package moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100); // 1:Type 2:strength 3:accuracy
    }
    @Override
    protected void applyOppEffects(Pokemon poke){
        Effect ef = new Effect().condition(Status.FREEZE).chance(0.1);
        poke.addEffect(ef);
    }

    @Override
    protected String describe(){
        return "uses ice beam";
    }
}