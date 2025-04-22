public class reverseWordInString {
    public static void main(String[] args){
        String str = "i am fine";
        String[] word = str.split("\\s");
        String reverseString = "";
        for(String w : word){
           StringBuilder sb = new StringBuilder(w);
           sb.reverse();
           reverseString +=sb.toString()+" ";
        }
        System.out.println(reverseString);

    }
}
