/**
 * This is the InvalidSubspeciesException. This exception is thrown when Strings not matching "Alaskan", "Asiatic",
 * "European", "Grizzly", "Kodiak", or "Siberian" are as the brownbears subspecies.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 *
 */
@SuppressWarnings("serial")
public class InvalidSubspeciesException extends RuntimeException
{
	InvalidSubspeciesException (String message)
	{
		super(message);
	}
}
