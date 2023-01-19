package CoffeMachine;

public enum CoffeeStrength {
    MILD(0.5), NORMAL (0.75), STRONG(1.0);
    private double strength;

    CoffeeStrength(double strength) {
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }
}

