package tries;

public class longest_word_with_all_prefix {
    static class node {
        node childeren[] = new node[26]; // here we take 26 because we are inserting string
        boolean eow;

        node() {
            eow = false;
            for (int i = 0; i < childeren.length; i++) {
                childeren[i] = null;
            }
        }

    }

    public static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.childeren[index] == null) {
                curr.childeren[index] = new node();
            }
            curr = curr.childeren[index];
        }
        curr.eow = true;
    }

    static String longstring = "";

    public static void longest(node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < root.childeren.length; i++) {
            if (root.childeren[i] != null && root.childeren[i].eow) {
                temp.append((char) (i + 'a'));
                if (longstring.length() < temp.length()) {
                    longstring = temp.toString();
                }
                longest(root.childeren[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtracking step
            }
        }
    }

    public static void main(String arg[]) {
        String word[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        StringBuilder s = new StringBuilder("");
        longest(root , s);
        System.out.println(longstring);
    }
}
