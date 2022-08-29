package houses;

public class House {
    private Resident[] residents = null;
    private Foundation foundation = null;

    public House() {
    }

    public House(Resident[] residents, Foundation foundation) {
        this.residents = residents;
        this.foundation = foundation;
    }

    public House(Foundation foundation) {
        this.foundation = foundation;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public Resident[] getResidents() {
        return residents;
    }

    public void setResidents(Resident[] residents) {
        this.residents = residents;
    }
}