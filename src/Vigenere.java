class Vigenere {
    static String Cifra(String message,String key){
        int[] v=new int[key.length()];
        for(int i=0;i<key.length();i++){
            if((int)key.charAt(i)>=65&&(int)key.charAt(i)<=90){
                v[i]=(int)((key.charAt(i) - 65));
            }
            else if((int)key.charAt(i)>=97&&(int)key.charAt(i)<=122){
                v[i]=(int)((key.charAt(i) - 97));
            }else {
                v[i] = (int) (key.charAt(i) % 26);
            }
        }
        StringBuilder result = new StringBuilder();
        char ch;
        int actualKey;
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            actualKey = v[i%v.length];
            if((ch + actualKey) > 126){
                result.append((char)((ch + actualKey) - 95));
            }else{
                result.append((char)(ch + actualKey));
            }
        }
        return result.toString();
    }

    static String Decifra(String message,String key){
        int[] v=new int[key.length()];
        for(int i=0;i<key.length();i++){
            if((int)key.charAt(i)>=65&&(int)key.charAt(i)<=90){
                v[i]=(int)((key.charAt(i) - 65));
            }
            else if((int)key.charAt(i)>=97&&(int)key.charAt(i)<=122){
                v[i]=(int)((key.charAt(i) - 97));
            }else {
                v[i] = (int) (key.charAt(i) % 26);
            }
        }
        StringBuilder result = new StringBuilder();
        char ch;
        int actualKey;
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            actualKey = v[i%v.length];
            if((ch - actualKey) < 32){
                result.append((char)((ch - actualKey) + 95));
            }else{
                result.append((char)(ch - actualKey));
            }
        }
        return result.toString();
    }
}
