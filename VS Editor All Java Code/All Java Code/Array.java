import java.util.*;
public class Array{
    public void arr(){
    int twoD[][] = new int[4][5];
    int i, j, k=0;
        for(i=0; i<4; i++)
        for(j=0; j<5; j++) {
        twoD[i][j] = k;
        k++;
        }
        for(i=0; i<4; i++) {
        for(j=0; j<5; j++)
        System.out.print(twoD[i][j] + " ");
        System.out.println();
        }
    }
    public void newArray(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int x = sc.nextInt();
    System.out.println("Enter the number of columns:");
    int y = sc.nextInt();
    System.out.println("Enter the number sub columns:");
    int z = sc.nextInt();
        int threeDArry[][][] = new int [x][y][z];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<x; i++){
            for(int j=0; j<y;j++){
                for(int k=0; k<z; k++){

                    threeDArry[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements of the array are:");
        for(int i=0; i<x; i++){
            for(int j=0; j<y;j++){
                for(int k=0; k<z; k++){

                    System.out.print(threeDArry[i][j][k]+" ");
                }
                    
            }
            System.out.println();
    }

    }
    public static void main(String args[]){
    
        System.out.println("Code With Bhaskar");
        System.out.println("Hello Bhaskar");
        Array newArr = new Array();
        newArr.newArray();
        System.out.println();
        Array twoDArray = new Array();
        twoDArray.arr();
        

    }
}