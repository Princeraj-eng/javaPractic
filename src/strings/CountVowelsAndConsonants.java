package strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {


        String s = "sjisipooesdoosowwpd  mUYFFKTEDSA-98.,@&q^&q*q@*";
        char [] ch = s.replaceAll("[^a-zA-Z]", "").trim().toLowerCase().toCharArray();
        int v = 0;
        int con = 0;
        for (char c : ch){
            if (c == 'a' || c == 'e' || c ==  'i' || c == 'o' || c == 'u'){
                v++;
            }else {
                con ++;
            }
        }
        System.out.println("Length = "+ch.length + " "+"Vowel = "+v+" "+"Consonants = "+con);
    }

}
