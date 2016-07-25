/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.products.util;

import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Products {
    Scanner input;
    String[] products;
    double[] price;
    boolean[] status;
    int[] quantity;
    int pc=0;
    int c=0;
    int j;
    String sproduct="";
    boolean found=false;
    
    public Products(Scanner input,String[] products,double[] price,boolean[] status,int[] quantity){
        this.input=input;
        this.products=products;
        this.price=price;
        this.status=status;
        this.quantity=quantity;
    }
    
     public void productentry(){
        
        if(pc<10){
        System.out.print("Enter new product's name: ");
        products[pc]=input.next();
        c=pc;
       pc++;
        }else
            System.out.println("You have exceeded the limit.");
        
            
    }
     
     public void priceentry(){
        System.out.print("Enter price for "+products[c]+":");
        price[c]=input.nextDouble();
       
    }
     
   
    
    public void quantityentry()
    {
        System.out.print("Enter quantity for "+products[c]+": ");
        quantity[c]=input.nextInt();
    }
    
    public void search()
    {
        System.out.println("Enter product's name: ");
        sproduct=input.next();
        for(int i=0;i<pc;i++)
        {
        if(products[i].equalsIgnoreCase(sproduct))
        {
            found=true;
             j=i;
           
        }
        }
        if(found==true)
        {
             System.out.println("Product details:");
            System.out.println("Product's name: "+products[j]);
            System.out.println("Product's price: "+price[j]);
            System.out.println("Product's status: "+found);
            System.out.println("Product's quantity: "+quantity[j]);
        }else
            System.out.println("Product could not be found!");
        
    }

   
}
