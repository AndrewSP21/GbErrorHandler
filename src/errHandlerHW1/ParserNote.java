package errHandlerHW1;

import java.util.regex.Pattern;

public class ParserNote {
    public static Note parsing(String[] arr, Note entry) throws emptyLineException {
        String patternBD = "\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d";
        String patternPhone = "^[0-9]+";
        String patternName = "^[А-Яа-я]+";
        int count = 0;
        if (arr.length < 6) {
            throw new emptyLineException("Введено меньше данных чем нужно!");
        } else if (arr.length > 6) {
            throw new emptyLineException("Введено больше данных чем нужно!");
        }
        for (String s : arr) {
            if (s.equals("f") | s.equals("m")) {
                entry.setGender(s);
                continue;
            }
            if (Pattern.matches(patternBD, s)) {
                entry.setBirthdate(s);
                continue;
            }
            if (Pattern.matches(patternPhone, s)) {
                entry.setPhone(s);
                continue;
            }
            if (Pattern.matches(patternName, s)) {
                count++;
                switch (count) {
                    case (1) -> entry.setSurname(s);
                    case (2) -> entry.setName(s);
                    case (3) -> entry.setPatronymic(s);
                }
            }
        }
        return entry;
    }
}
