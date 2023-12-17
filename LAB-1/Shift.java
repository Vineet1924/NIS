import java.util.*;
// classroom code : achyzgn
public class Shift
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pText;
        int key;

        System.out.print("Enter plain text : ");
        pText = sc.nextLine();

        for(int k = 1; k <= 25; k++) {
            StringBuilder cText = new StringBuilder();
            StringBuilder dText = new StringBuilder();

            System.out.println("key = " + k);

            for(int i = 0; i < pText.length(); i++) {
                int ascii = ((pText.charAt(i) - 'a') + k) % 26;

                cText.append((char)(ascii + 'a'));
            }

            System.out.println("Encrypted : " + cText);

            for(int i = 0; i < pText.length(); i++) {
                int ascii = ((cText.charAt(i) - 'a') - k) % 26;

                while(ascii < 0) {
                    ascii += 26;
                }

                dText.append((char)(ascii + 'a'));
            }

            System.out.println("Decrypted : " + dText);
        }
    }
}