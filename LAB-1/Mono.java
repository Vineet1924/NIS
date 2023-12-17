import java.util.*;

public class Mono {
    public static void main (String[] args) {
        ArrayList<Character> visited = new ArrayList<>();
        HashMap<Character, Character> mapping = new HashMap<>();
        HashMap<Character, Character> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String pText = sc.nextLine();

        for(int i = 0; i < pText.length(); i++) {
            if(!visited.contains(pText.charAt(i))) {
                visited.add(pText.charAt(i));
            }
        }

        for(int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            if(!visited.contains(c)) {
                visited.add(c);
            }
        }

        for(int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            mapping.put(c, visited.get(i));
            map.put(visited.get(i), c);
        }

        System.out.println(mapping);
        System.out.println(map);

        StringBuilder encrypted = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();

        for(int i = 0; i < pText.length(); i++) {
            char ch = mapping.get(pText.charAt(i));
            encrypted.append(ch);
        }

        System.out.println("Encrypted : " + encrypted);

        for(int i = 0; i < pText.length(); i++) {
            char ch = map.get(encrypted.charAt(i));
            decrypted.append(ch);
        }

        System.out.println("Decrypted : " + decrypted);
    }
}