import java.util.Scanner;
import java.util.Stack;

class Service {
    static Scanner scanner = new Scanner(System.in);
    static Stack<Character> stack = new Stack<>();
    static boolean found;
    static int count;

    static void search(Character character1, Character character2) {
        int firstChar = stack.lastIndexOf(character2);
        int secondChar = stack.indexOf(character1);
        count += (secondChar - firstChar - 1);
        stack.remove(character1);
        stack.remove(character2);
        found = true;
    }

    static String patternValidate(String pattern) throws Exception {
        for (char ch : pattern.toCharArray())
            if (ch != 'R' && ch != 'L' && ch != 'U' && ch != 'D')
                throw new Exception("Invalid Pattern");
        return pattern;
    }
}