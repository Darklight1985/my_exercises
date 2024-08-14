package exercises.regex;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeRegNumber {

    RUSSIA("Российская Федерация", "||\\d{4}[АВЕКМНОР-УХавекмнор-ухABCEKMHOPTXabcekmhoptx]{2}\\d{2,3}" +
            "||[АВЕКМНОР-УХавекмнор-ухABCEKMHOPTXabcekmhoptx]\\d{3}[АВЕКМНОР-УХавекмнор-ухABCEKMHOPTXabcekmhoptx]{2}\\d{2,3}", "RU"),
    BELARUS("Республика Беларусь", "\\d{4}[АВЕКМНОР-УХавекмнор-ухABCEKMHIOPTXabcekmhioptx]{2}\\d" +
            "||[АВЕКМНОР-УХавекмнор-ухABCEKMHIOPTXabcekmhioptx]{2}\\d{5}" +
            "||[АВЕКМНОР-УХавекмнор-ухABCEKMHIOPTXabcekmhioptx]\\d{4}[АВЕКМНОР-УХавекмнор-ухABCEKMHIOPTXabcekmhioptx]\\d" ,
            "BY"),
    KYRGYZSTAN("Киргизия","\\d{5}[A-Za-z]{2,3}" +
            "||\\d{3,4}[A-Za-z]{4,5}", "KG"),
    KAZAKHSTAN("Казахстан", "\\d{3}[A-Za-z]{2,3}\\d{2}" +
            "||\\d{5}[A-Za-z]{2,3}", "KZ");

    private final String title;
    private final String regex;
    private final String index;
}