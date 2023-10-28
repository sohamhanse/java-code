package strings;
public class compresion {
    public static void compress_string(String str) {
        StringBuilder br = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            br.append(str.charAt(i));
            if (count > 1) {
                br.append(count);
            }

        }
        System.out.println(br);
    }

    public static void main(String arg[]) {
        String str = "aaaaabbbddssddj";
        compress_string(str);
    }
}
