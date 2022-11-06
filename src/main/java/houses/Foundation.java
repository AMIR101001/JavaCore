package houses;

public class Foundation {
    private int foundationArea = 0;
    private String typeFoundation = " ";

    public Foundation() {
    }

    public Foundation(int foundationArea, String typeFoundation) {
        this.foundationArea = foundationArea;
        this.typeFoundation = typeFoundation;
    }

    public int getFoundationArea() {
        return foundationArea;
    }

    public String getTypeFoundation() {
        return typeFoundation;
    }
}
