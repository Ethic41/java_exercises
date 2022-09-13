class ReverseString {

    String reverse(String inputString) {
        StringBuilder variable = new StringBuilder();
        variable.append(inputString);
        variable.reverse();

        return variable.toString();
    }  
}
