import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, Character> encryptKey = new HashMap<>();
        int alphaIndex = 0;
        String encrypt = "";
        for(int i = 0; i < message.length(); i++){
            if (!encryptKey.containsKey(message.charAt(i))){
                encryptKey.put(message.charAt(i), alphabet[alphaIndex]);
                alphaIndex++;
            }
            encrypt += encryptKey.get(message.charAt(i));

        }
        return encrypt;

    }
}

