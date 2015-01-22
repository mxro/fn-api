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

    public static <I, O> Function<I, O> compose(final Function... functions) {
        return new Function<I, O>() {

            @Override
            public O apply(final I input) {
                Object res = input;
                for (final Function f : functions) {
                    res = f.apply(res);
                }

                return (O) res;
            }
        };
    }
}
