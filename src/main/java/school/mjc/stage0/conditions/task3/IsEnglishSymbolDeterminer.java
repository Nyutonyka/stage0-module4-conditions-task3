package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String str = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        String s = String.valueOf(symbol);
        if (str.contains(s)) {
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
