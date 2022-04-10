package devsearch.common.utils;

import static devsearch.common.utils.Constants.ALPHABET;
import static devsearch.common.utils.Constants.DEFAULT_DATE_FORMATTER;
import static devsearch.common.utils.Constants.DEFAULT_ID_LENGTH;
import static devsearch.common.utils.Constants.DEFAULT_PUBLIC_KEY_LENGTH;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {
    private static final Random RANDOM = new SecureRandom();

    public static String generateId() {
	return generateId(DEFAULT_ID_LENGTH);
    }

    public static String generateId(int length) {
	return generateRandomString(length);
    }

    public static String generatePublicKey() {
	return generatePublicKey(DEFAULT_PUBLIC_KEY_LENGTH);
    }

    public static String generatePublicKey(int length) {
	return generateRandomString(length);
    }

    // Returns true if value is null, empty string (length == 0) or only white space
    // spaces
    public static boolean isNullOrBlank(String value) {
	return value == null || value.isBlank();
    }

    // Returns true if value is null or empty string (length == 0)
    public static boolean isNullOrEmpty(String value) {
	return value == null || value.isEmpty();
    }

    public static String getDateString(Date date) {
	return getDateString(date, DEFAULT_DATE_FORMATTER);
    }

    public static String getDateString(Date date, DateFormat dateFormat) {
	return dateFormat.format(date);
    }

    private static String generateRandomString(int length) {
	StringBuilder returnValue = new StringBuilder();

	for (int i = 0; i < length; i++) {
	    returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
	}

	return returnValue.toString();
    }
}
