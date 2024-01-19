package common;

public class Wall extends MapSite {
    public Wall() {
    }

    @Override
    public void enter() {
        System.out.println("Cannot move further because of wall.");
    }

    @Override
    public String toString() {
        return "Wall{}";
    }
}
