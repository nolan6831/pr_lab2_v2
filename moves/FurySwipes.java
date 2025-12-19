package moves;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {super(Type.NORMAL,18,80,0,3);}

    @Override
    protected String describe() {return "uses fury swipes";}
}
