
class MicroBlog {
    public String truncate(String input) {
        int[] codepoints = input.codePoints().toArray();
        int count = (int) input.codePoints().count();
        return count > 5 ? new String(codepoints, 0, 5) : new String(codepoints, 0, count);
    }

    public static void main(String[] args){
        MicroBlog blogTruncator = new MicroBlog();
        System.out.println(blogTruncator.truncate("Hi"));
    }
}
