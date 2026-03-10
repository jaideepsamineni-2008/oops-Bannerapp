public class oopsBannerUC7 {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;


        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String getPatternLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC7\n");

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap[] patterns = {O, O, P, S};

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < patterns.length; j++) {
                line.append(patterns[j].getPatternLine(i));

                if (j < patterns.length - 1) {
                    line.append("   ");
                }
            }

            banner[i] = line.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}