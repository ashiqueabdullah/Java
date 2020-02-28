/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

import java.util.Scanner;

/**
 *
 * @author a_ash
 */
public class Mid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aa[] = new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<aa.length; i++){
            aa[i]=sc.nextInt();
            System.out.println(aa[i]);
        }
    }
    
}
