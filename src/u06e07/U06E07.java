 
package u06e07;

import java.util.Scanner;

public class U06E07 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int i, t, m;
        boolean flag=false;
        System.out.print("Ingrese el largo del array: ");
        t=entrada.nextInt();
        int[] a = new int[t];
        System.out.print("Ingrese el multiplo del array: ");
        m=entrada.nextInt();
        for(i=0; i<a.length; i++){
            a[i]=(m*i);
            System.out.println(m+"*"+i+"="+a[i]);
        
        }
    }
}