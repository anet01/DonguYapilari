
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
       /* System.out.print("Tekrar Sayısını Giriniz: ");
        int tekrar=scanner.nextInt();
        
        
        
        for (int i = 0; i < tekrar; i++) {
            
            System.out.println((i+1)+".Tekrar");
            
        
        }*/
        
        //VEYA bie döngü içerisine iki koşul yazabilriz
      /*  int i = 0; 
        int j = 10;
        
        for (; i < 10 && j>0; i++, j--) { // şeklinde tanımlanır
            
            System.out.println("j= "+j+" i= "+i);
            
        }*/
        int sonuc=1;
        System.out.println("Faktöriyelini istediğiniz sayıyı giriniz: ");
        int sayi=scanner.nextInt();
       
        for (int i=1; i <= sayi; i++){
 
            //sonuc=sonuc*i;
            sonuc*=i;
        }
        System.out.println(sonuc);
            
        }
        
    }
    

