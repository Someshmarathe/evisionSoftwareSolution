public class StringClassMethods {
    public static void main(String[] args){
        String str = new String("ABCD");
        
        System.out.println("Find Length :"+str.length());
        System.out.println("Find  char index :"+str.charAt(0));
        System.out.println("Find index char :"+str.indexOf('A'));
        System.out.println("Find lowercase :"+str.toLowerCase());
        System.out.println("check equals :"+str.equalsIgnoreCase("abcd"));
        System.out.println("check Contains or not :"+str.contains("AB"));
        System.out.println("check equals using compareTo :"+str.compareTo("ABCD"));
        System.out.println("Find substring : "+str.substring(1));
        System.out.println("Find substring : "+str.substring(1,2));
        System.out.println("replace  :"+str.replace("A" , "B"));
        
    }
}
