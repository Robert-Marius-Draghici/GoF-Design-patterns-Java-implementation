package common;

public class Spell {

    private String spellName;

    public Spell() {
        spellName = "Default Spell";
    }

    @Override
    public String toString() {
        return "Spell{" +
                "spellName='" + spellName + '\'' +
                '}';
    }
}
