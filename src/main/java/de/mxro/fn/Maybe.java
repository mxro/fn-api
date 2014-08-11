package de.mxro.fn;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>An abstract implementation for a construct which might be of a certain value or not.
 * <p>The static methods of this class provide the concrete implementations. Such as in:
 * <pre><code>{@code
 *    Maybe<Integer> maybe = Maybe.is(new Integer(23));
 *  }</code></pre>
 * 
 * @author Max
 *
 * @param <V>
 */
public abstract class Maybe<V> {

	public abstract boolean is();

	public abstract V value();

	public static <V> List<V> allValues(final List<Maybe<V>> list) {
		final List<V> val = new ArrayList<V>(list.size());

		for (final Maybe<V> m : list) {
			if (m.is()) {
				val.add(m.value());
			}
		}

		return val;
	}

	public static <V> Maybe<V> is(final V value) {
		return new Maybe<V>() {

			@Override
			public boolean is() {
				return true;
			}

			@Override
			public V value() {
				return value;
			}
		};
	}

	public static <V> Maybe<V> isNot(final Class<V> clazz) {
		return new Maybe<V>() {

			@Override
			public boolean is() {
				return false;
			}

			@Override
			public V value() {
				throw new IllegalStateException(
						"Cannot access value of Maybe if it is not.");
			}
		};
	}

	public static <V> Maybe<V> isNot() {
		return new Maybe<V>() {

			@Override
			public boolean is() {
				return false;
			}

			@Override
			public V value() {
				throw new IllegalStateException(
						"Cannot access value of Maybe if it is not.");
			}
		};
	}

}
