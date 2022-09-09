package com.String;

public class CountOfFirstChar {
    public static void main(String[]args){
    String a="ailesaa";
    char word=a.charAt(0);
    int count =1;

    for(int i=1; i<a.length();i++){
        if(word==a.charAt(i)){
            count++;

        }

    }
        System.out.print(word +" "+count);
}
}