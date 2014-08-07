package de.mxro.fn;

public class Value<T> {

	private final T value;
	
	public T get() {
		return value;
	}

	public Value(T value) {
		super();
		this.value = value;
	}
	
	
	
}
