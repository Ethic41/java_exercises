class SqueakyClean {
    
    static String clean(String identifier) {
        identifier = removeWhiteSpace(identifier);
        identifier = removeControlChars(identifier);
        identifier = removeNumbers(identifier);
        identifier = convertKebabToCamelCase(identifier);
        identifier = removeDash(identifier);
        identifier = removeLowerGreek(identifier);
        identifier = removeEmoji(identifier);
        return identifier;
    }


    static String removeWhiteSpace(String identifier){
        return identifier.replace(" ", "_");
    }


    static String removeControlChars(String identifier){
        return identifier.replaceAll("\\p{Cntrl}", "CTRL");
    }


    static String removeNumbers(String identifier) {
        return identifier.replaceAll("[0-9]", "");
    }


    static String convertKebabToCamelCase(String identifier){
        int startIndex = 0;
        while (true) {
            int indexOfTarget = identifier.indexOf("-", startIndex);
            if (indexOfTarget == -1){
                break;
            }
            identifier = identifier.substring(0, indexOfTarget+1) + identifier.substring(indexOfTarget + 1, indexOfTarget + 2).toUpperCase() + identifier.substring(indexOfTarget + 2);
            startIndex = indexOfTarget + 1;
        }
        return identifier;
    }
    

    static String removeDash(String identifier){
        return identifier.replaceAll("-", "");
    }

    
    static String removeLowerGreek(String identifier){
        return identifier.replaceAll("[α-ω]", "");
    }


    static String removeEmoji(String identifier){
        return identifier.replaceAll("[\uD83C-\uDBFF\uDC00-\uDFFF]", "");

    }
}
