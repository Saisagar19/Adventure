package userDefinedExc;

public class MyException extends Exception {

	public String getMessage(String msg)
	{
		return msg;
	}

	@Override
	public String toString() {
		return "MyException occured";
	}

}
