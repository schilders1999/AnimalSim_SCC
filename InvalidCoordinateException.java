/**
 * This is the InvalidCoordinateException. This exception is thrown when negative coordinate values are entered 
 * into the location.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 *
 */
@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException 
{
	InvalidCoordinateException(String message){
		super(message);
	}
}
