package devsearch.common.utils;

import static devsearch.common.utils.Constants.ALPHABET;
import static devsearch.common.utils.Constants.DEFAULT_DATE_FORMATTER;
import static devsearch.common.utils.Constants.DEFAULT_ID_LENGTH;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

import devsearch.common.utils.mapper.Mapper;
import devsearch.common.utils.mapper.StrictMapperImpl;

public class Utils {
    private static final Random RANDOM = new SecureRandom();
    private Mapper strictModelMapper = new StrictMapperImpl();

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
	return getDateString(date, DEFAULT_DATE_FORMATTER);
    }

    public String getDateString(Date date, DateFormat dateFormat) {
	return dateFormat.format(date);
    }

    public Mapper getStrictModelMapper() {
	return this.strictModelMapper;
    }

    public <D> D map(Object source, Class<D> destinationType) {
	return this.strictModelMapper.map(source, destinationType);
    }

    private String generateRandomString(int length) {
	StringBuilder returnValue = new StringBuilder();

	for (int i = 0; i < length; i++) {
	    returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
	}

	return returnValue.toString();
    }
}
