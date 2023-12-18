import java.util.*;

class auto {
    public static String encrypt (String pText, int key) {
        StringBuilder encrypt = new StringBuilder();
        
        for(int i = 0; i < pText.length(); i++) {
            if(i == 0) {
                int ascii = ((pText.charAt(i) - 'a') + key) % 26;
                encrypt.append((char)(ascii + 'a'));
            } else {
                int ascii = ((pText.charAt(i) - 'a') + (pText.charAt(i - 1) - 'a')) % 26;
                encrypt.append((char)(ascii + 'a'));
            }
        }
        
        return encrypt.toString();
    }
    
    public static String decrypt (String encrypted, int key) {
        StringBuilder decrypt = new StringBuilder();
        int previous = 0;
        
        for(int i = 0; i < encrypted.length(); i++) {
            if(i == 0) {
                int ascii = ((encrypted.charAt(i) - 'a') - key) % 26;
                previous = ascii;
                decrypt.append((char)(ascii + 'a'));
            } else {
                int ascii = ((encrypted.charAt(i) - 'a') - previous) % 26;
                
                while(ascii < 0) {
                    ascii += 26;
                }
                
                previous = ascii;
                decrypt.append((char)(ascii + 'a'));
            }
        }
        
        return decrypt.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter plain text : ");
        String pText = sc.nextLine();
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        String encrypted = encrypt(pText, key);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Encryption : " + encrypted);
        System.out.println("Decryption : " + decrypted);
        
        sc.close();
    }
}