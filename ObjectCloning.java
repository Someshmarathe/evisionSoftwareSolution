public class ObjectCloning implements Cloneable
{
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public void Display(){
        System.out.println("I am Calling..");
    }
    public static void main(String[] args) {
        ObjectCloning obj = new ObjectCloning();
        try{
            ObjectCloning obj2 = (ObjectCloning) obj.clone();
            obj2.Display();
        }
        catch(Exception e){
           System.out.println("Exception Is Occure");
        }
         // in this case give error
        //obj2.Display();
    }
}
