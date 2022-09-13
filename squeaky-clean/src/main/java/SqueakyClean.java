class SqueakyClean {
    static String clean(String identifier) {
        identifier = removeWhiteSpace(identifier);
        identifier = removeControlChars(identifier);
        //identifier = convertKebabToCamelCase(identifier);
        identifier = removeNumbers(identifier);
        //identifier = removeNonLetters(identifier);
        return identifier;
    }

    static String removeWhiteSpace(String identifier){
        return identifier.replace(" ", "_");
    }

    static String removeControlChars(String identifier){
        return identifier.replaceAll("\\p{Cntrl}", "CTRL");
    }

    static String convertKebabToCamelCase(String identifier){
        

        return identifier;
    }

    static String removeNumbers(String identifier) {
        return identifier.replaceAll("[0-9]", "");
    }

    static String removeNonLetters(String identifier){
        return identifier.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args){
        // String identifier = "my   Id my\0Idà-ḃça1😀2😀3😀bMyΟβιεγτFinder";
        String identifier = "9 -abcĐ\uD83D\uDE00ω\0";
        System.out.println(clean(identifier));
    }
}
