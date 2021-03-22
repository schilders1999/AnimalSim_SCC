/**
 * This is the InvalidSimIDException. This exception is thrown when negative values are entered for the animal's ID.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 *
 */
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException
{
	InvalidSimIDException (String message)
	{
		super(message);
	}
}
