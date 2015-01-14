package de.mxro.fn;

public class Fn {

    /**
     * <p>
     * Creates an object with a unique identity. The object will only be equal
     * to itself.
     * 
     * @return An object with a unique identity.
     */
    public static final Object object() {
        return new Object() {

            @Override
            public boolean equals(final Object obj) {
                return obj == this;
            }

        };
    }

    public static Closure<Success> expectSuccess() {
        return new Closure<Success>() {

            @Override
            public void apply(final Success o) {
                assert o != null;
            }
        };
    }

    public static <R> Closure<R> emptyClosure() {
        return new Closure<R>() {

            @Override
            public void apply(final R o) {
                // do nothing
            }
        };
    }

}
