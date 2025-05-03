package books.EffectiveJava.cap02_Creating_And_DestroyingObjects;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // default

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override public Calzone build() {
            return new Calzone(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
