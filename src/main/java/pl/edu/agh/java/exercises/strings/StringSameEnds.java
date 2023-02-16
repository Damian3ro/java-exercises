package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without
 * overlapping. For example, sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku i na końcu, bez nachodzenia na siebie.
 * Przykłądowo, sameEnds("abXab") to "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
    public String sameEnds(String string) {
        //throw new UnsupportedOperationException();
        String substring = "";
        int j = string.length();

        for(int i=0; i <= j; i++) {
            if(string.substring(0,i).equals(string.substring(j))) {
                substring = string.substring(0,i);
            }
            j--;
        }

        return substring;
    }
}
