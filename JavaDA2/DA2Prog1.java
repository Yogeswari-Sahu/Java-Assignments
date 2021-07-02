package JavaDA2;

import java.util.Scanner;

interface Sorting{
    public int[] sort(int[] array,int n);
}
interface Insert{
    public int[] insert(int[] array);
}
interface SortedArray extends Sorting,Insert {
    public void result(int[] array,int n);
 }

public class DA2Prog1 {
    public static void main(String[] args){
    	System.out.println("Yogeswari Sahu 18BCE0928 25-03-2021");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter size of array:");
        int n = sc.nextInt();
        int[] array = new int[n+1];  
        for(int i=0; i<n; i++)  
            {  
            array[i]=sc.nextInt();  
            } 
        SortedArray s = new SortedArray(){

            public int[] sort(int[] array,int n){
                 
                int temp = 0; 
                for(int i=0; i < n; i++){  
                    for(int j=1; j < (n-i); j++){  
                         if(array[j-1] > array[j]){  
                        
                                temp = array[j-1];  
                                array[j-1] = array[j];  
                                array[j] = temp;  
                        }       
                    }  
                }
                return array;
            }
            public int[] insert(int[] array){
                System.out.print("\nInsert a new value: ");
                int newnumber = sc.nextInt();
                int len = array.length; 
                array[len-1]=newnumber;
                return array;
            }
            public void result(int[] array,int n){  
                for(int i=0; i<n; i++)  
                    {  
                        System.out.print(array[i]+ "  ");
                    } 
            }
        };
        s.sort(array,n);
        System.out.println("This is Your Current Array:");
        s.result(array,n);
        s.insert(array);
        s.sort(array,n+1);
        System.out.println("This is Your New Array:");
        s.result(array,n+1);
    }
   }

