public class SoutHello{
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        String fName = "Hii";
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(fName+" ");
            }
            System.out.println();
        }
        
    }
}