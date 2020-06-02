public class Month {
    private String name;
    private Season season;

    public Month(String name, Season seson) {
        this.name = name;
        this.season = seson;
    }

    public String getName() {
        return name;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return name + " jest miesiącem pory roku: " + season.getTranslation();
    }
}
