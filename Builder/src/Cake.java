public class Cake {
    // required parameters
    private String flavor;
    private int layers;

    // optional parameters
    private boolean hasFrosting;
    private boolean hasSprinkles;

    private Cake(CakeBuilder builder) {
        this.flavor = builder.flavor;
        this.layers = builder.layers;
        this.hasFrosting = builder.hasFrosting;
        this.hasSprinkles = builder.hasSprinkles;
    }

    // Getters
    public String getFlavor() {
        return flavor;
    }

    public int getLayers() {
        return layers;
    }

    public boolean hasFrosting() {
        return hasFrosting;
    }

    public boolean hasSprinkles() {
        return hasSprinkles;
    }

    // Builder Class
    public static class CakeBuilder {
        // required parameters
        private String flavor;
        private int layers;

        // optional parameters
        private boolean hasFrosting;
        private boolean hasSprinkles;

        public CakeBuilder(String flavor, int layers) {
            this.flavor = flavor;
            this.layers = layers;
        }

        public CakeBuilder setFrosting(boolean hasFrosting) {
            this.hasFrosting = hasFrosting;
            return this;
        }

        public CakeBuilder setSprinkles(boolean hasSprinkles) {
            this.hasSprinkles = hasSprinkles;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }
}