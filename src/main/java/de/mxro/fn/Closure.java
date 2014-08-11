package de.mxro.fn;

/**
 * <p>A simple closure which takes in one generic argument.
 * 
 * @author Max
 *
 * @param <P> The type of the argument for the closure.
 */
public interface Closure<P> {

	/**
	 * The method of this closure.
	 * 
	 * @param o The parameter for the closure.
	 */
	public void apply(P o);

}
