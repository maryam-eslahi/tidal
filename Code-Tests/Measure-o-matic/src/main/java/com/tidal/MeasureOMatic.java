package com.tidal;
import java.util.*;

public class MeasureOMatic {


        public static void main(String[] args) {
            System.out.println("Please Enter a line, Enter EOF to end");
            Scanner sc=new Scanner(System.in);
            int maxlenght=0;
            String s=sc.nextLine();
            String maxString=s;
            while(!s.toUpperCase().equals("EOF")){
                if(s.trim().length()>maxlenght)
                {
                    maxString=s;
                    maxlenght=s.trim().length();
                }
                System.out.println("Please Enter the next line, Enter EOF to end");
                s=sc.nextLine();
            }
            System.out.println("max lenght:"+maxlenght+"\nthe string is:" +maxString);
        }



}
