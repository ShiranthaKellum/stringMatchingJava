import java.util.Scanner;

public class stringMatching { 
    
    static int findString (String f_text, String f_keyWord) {
        int count = 0, i, j;
        for (i = 0; i < f_text.length() - f_keyWord.length() + 1; i++) {
            if (f_text.charAt(i)== f_keyWord.charAt(0)) {                       // .charAt () is used to access characters of a string
                for (j = 1; j < f_keyWord.length(); j++) {
                    if (f_text.charAt(i+j) == f_keyWord.charAt(j)) {
                        if (j == f_keyWord.length()-1) {
                            count +=1;

                        }
                    }else {
                        break;

                    }
                    
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        String  keyWord = scanner.nextLine();
        scanner.close();

        int count = findString (text, keyWord);

        System.out.print(count);

    }
}
