public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("ABEF");
        System.out.println("Get Class Of Object : " +sb.getClass());
        System.out.println("Get Initial StringBuilderCapacity :"+sb.capacity());
        sb.append(" "+"Good afternoo");
        StringBuilder newsb = new StringBuilder(sb.substring(0 , 3));
        System.out.println(sb);
        System.out.println(newsb.insert(2, "CD"));
        System.out.println(newsb.reverse());
    }
}
