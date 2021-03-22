/**
 * This is the InvalidWingspanException. This exception is thrown when values not between 5.0 and 11.0 are entered.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 *
 */
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException 
{
	InvalidWingspanException(String message)
	{
		super(message);
	}
}
