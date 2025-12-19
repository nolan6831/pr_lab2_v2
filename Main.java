import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();

        Alomomola poke1 = new Alomomola("Tinky Winky", 50);
        Pancham poke2 = new Pancham("Dipsy", 50);
        Pangoro poke3 = new Pangoro("Laa-Laa", 50);
        Slakoth poke4 = new Slakoth("Po", 50);
        Vigoroth poke5 = new Vigoroth("Bernd das Brot", 50);
        Slaking poke6 = new Slaking("Mr. Blobby", 50);

        battle.addAlly(poke1);
        battle.addAlly(poke2);
        battle.addAlly(poke3);

        battle.addFoe(poke4);
        battle.addFoe(poke5);
        battle.addFoe(poke6);

        battle.go();
    }
}