package CoffeMachine;

public enum CoffeeType {
    GROUND("молотый"), BEANS ("в зернах");
    private String description;


    CoffeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;

    }
}
