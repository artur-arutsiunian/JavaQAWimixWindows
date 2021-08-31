package stream;

public class Staff {
    private String name;
    private int experience;
    private Positions positions;

    public Staff(String name, int experience, Positions positions) {
        this.name = name;
        this.experience = experience;
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "staff{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", position=" + positions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions positions) {
        this.positions = positions;
    }
}
