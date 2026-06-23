class PalindromeChecker {
    String text;

    boolean check() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equals(rev);
    }

    void display() {
        System.out.println(check());
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";
        p.display();
    }
}