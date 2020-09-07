package purejavacomm;

public class PureJavaIllegalStateException extends IllegalStateException {

	private static final long serialVersionUID = -7871402991596066039L;

	public PureJavaIllegalStateException(String message) {
		super(message);
	}

	public PureJavaIllegalStateException(Exception e) {
		super(e);
	}
}
