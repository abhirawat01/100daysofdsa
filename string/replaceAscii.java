package string;

public class replaceAscii {

    public static void main(String[] args) {

        String str = "cDevHr";
        System.out.println(replaceString(str));
    }

    public static String replaceString(String str) {

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            if (i % 2 == 0) {
                
                ch = (char)(ch + 1);
                sb.setCharAt(i, ch);
            } else {
                ch = (char)(ch - 1);
                sb.setCharAt(i, ch);
            }
        }

        String str1 = sb.toString();
        return str1;
    }
}

// Input --> cDevHr
// Output --> dCfuIq
