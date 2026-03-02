/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap
 * inner static class to encapsulate character-to-pattern mappings.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its ASCII pattern
     */
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character Character to be mapped
         * @param pattern 7-line ASCII pattern
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return mapped character
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates CharacterPatternMap array for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        String[] space = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        charMaps[3] = new CharacterPatternMap(' ', space);

        return charMaps;
    }

    /**
     * Returns ASCII pattern for given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // if not found return space
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints message as ASCII Banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}