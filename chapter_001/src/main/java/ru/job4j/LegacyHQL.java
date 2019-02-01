package ru.job4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegacyHQL {
    private static final Pattern QUESTION_MARK = Pattern.compile("\\?");

    public String convert(String query) {
        int count = 0;
        StringBuffer sb = new StringBuffer();
        Matcher matcher = QUESTION_MARK.matcher(query);
        while (matcher.find()) {
            matcher.appendReplacement(sb, String.format("?%s", count++));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
