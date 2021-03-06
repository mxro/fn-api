package de.mxro.fn;

/**
 * <p>A function with a generic input and output.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 * @param <Input> The input type for this function.
 * @param <Output> The output type for this function.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Function_%28mathematics%29">Function (Wikipedia)</a>
 */
public interface Function<Input, Output> {

	/**
	 * This method applies the function to a specified input and calculates the output.
	 * 
	 * @param input The input for the function.
	 * @return The output of the function.
	 */
	public Output apply(Input input);

}
