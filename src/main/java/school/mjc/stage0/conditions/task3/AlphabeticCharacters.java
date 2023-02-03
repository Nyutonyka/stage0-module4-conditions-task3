package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String engAlphabet = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        String vowel = "aAeEiIoOuUyY";
        String c = String.valueOf(character);
        if (engAlphabet.contains(c)){
            if (vowel.contains(c)){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
