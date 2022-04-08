package devsearch.common.utils;

import static devsearch.common.utils.Constants.ALPHABET;
import static devsearch.common.utils.Constants.DEFAULT_DATE_FORMATTER;
import static devsearch.common.utils.Constants.DEFAULT_ID_LENGTH;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class Utils {
    private static final Random RANDOM = new SecureRandom();

    public String generatePublicId() {
	return generatePublicId(DEFAULT_ID_LENGTH);
    }

    public String generatePublicId(int length) {
	return generateRandomString(length);
    }

    // Returns true if value is null, empty string (length == 0) or only white space
    // spaces
    public boolean isNullOrBlank(String value) {
	return value == null || value.isBlank();
    }

    // Returns true if value is null or empty string (length == 0)
    public boolean isNullOrEmpty(String value) {
	return value == null || value.isEmpty();
    }

    public String getDateString(Date date) {
	return DEFAULT_DATE_FORMATTER.format(date);
    }

    private String generateRandomString(int length) {
	StringBuilder returnValue = new StringBuilder();

	for (int i = 0; i < length; i++) {
	    returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
	}

	return returnValue.toString();
    }
}
