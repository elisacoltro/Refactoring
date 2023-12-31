class Cake {
    private final double sugar;
    private final double butter;
    private final int eggs;
    private final int vanilla;
    private final double flour;
    private final double bakingpowder;
    private final double milk;
    private final int cherry;

    public static class Builder {
        private double sugar;
        private double butter;
        private int eggs;
        private int vanilla;
        private double flour;
        private double bakingpowder;
        private double milk;
        private int cherry;

        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double cup) {
            this.butter = cup;
            return this;
        }

        public Builder eggs(int number) {
            this.eggs = number;
            return this;
        }

        public Builder vanilla(int spoon) {
            this.vanilla = spoon;
            return this;
        }

        public Builder flour(double cup) {
            this.flour = cup;
            return this;
        }

        public Builder bakingpowder(double spoon) {
            this.bakingpowder = spoon;
            return this;
        }

        public Builder milk(double cup) {
            this.milk = cup;
            return this;
        }

        public Builder cherry(int number) {
            this.cherry = number;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanilla = builder.vanilla;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter= " + butter + ", eggs= " + eggs + ", vanilla= " + vanilla
                + ", flour= " + flour + ", bakingpowder= " + bakingpowder + ", milk= " + milk + ", cherry= " + cherry
                + '}';
    }

}