package characterrace;

public class GnomeRock extends Gnome {

    public GnomeRock(){
        super();

        subRaceName = "Rock Gnome";
        abilityScores[CON] += 1;

        traits.add(artificersLore);
        traits.add(tinker);
    }
}
