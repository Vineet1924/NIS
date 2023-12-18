import java.util.*;
// classroom code : achyzgn
public class Shift
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pText;
        StringBuilder cText = new StringBuilder();
        int key;

        System.out.print("Enter plain text : ");
        pText = sc.nextLine();
        System.out.print("Enter key : ");
        key = sc.nextInt();

        for(int i = 0; i < pText.length(); i++) {
            int ascii = ((pText.charAt(i) - 'a') + key) % 26;

            cText.append((char)(ascii + 'a'));
        }

        System.out.println("Encrypted : " + cText.toString());
        for(int k = 1; k <= 25; k++) {
            StringBuilder dText = new StringBuilder();

            for(int i = 0; i < pText.length(); i++) {
                int ascii = ((cText.charAt(i) - 'a') - k) % 26;

                while(ascii < 0) {
                    ascii += 26;
                }

                dText.append((char)(ascii + 'a'));
            }

            if(dText.toString().equals(pText)) {
                System.out.println("K is " + k);
            } else {
                System.out.println(k + " is not Key");
            }

        }
    }
}