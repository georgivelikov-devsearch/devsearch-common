package devsearch.common.exception;

public class DevsearchApiException extends Exception {

    private static final long serialVersionUID = -8315220442495773340L;

    private String sourceExceptionMessage;
    private String exceptionCode;

    public DevsearchApiException(String message) {
	super(message);
    }

    public DevsearchApiException(String message, String sourceExceptionMessage) {
	this(message);
	this.sourceExceptionMessage = sourceExceptionMessage;
    }

    public DevsearchApiException(String message, String sourceExceptionMessage, String exceptionCode) {
	this(message);
	this.exceptionCode = exceptionCode;
	this.sourceExceptionMessage = sourceExceptionMessage;
    }

    public String getSourceExceptionMessage() {
	return sourceExceptionMessage;
    }

    public void setSourceExceptionMessage(String sourceExceptionMessage) {
	this.sourceExceptionMessage = sourceExceptionMessage;
    }

    public String getExceptionCode() {
	return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
	this.exceptionCode = exceptionCode;
    }
}
