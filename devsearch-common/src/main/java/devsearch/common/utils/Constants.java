package devsearch.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Constants {
    public static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm z";
    public static final DateFormat DEFAULT_DATE_FORMATTER = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    public static final int DEFAULT_ID_LENGTH = 30;
    public static final String DEFAULT_ENCODING = "UTF-8";
}
