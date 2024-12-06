package BOJ;

import java.util.Scanner;

public class BOJ9012 {
    public static void main(String[] args){
        CharStack vpsStack = new CharStack(64);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();


        for(int i = 0 ; i < n ; i++){
            char[] pArr = scanner.nextLine().toCharArray();
            boolean isVPS = true;
            for(char p : pArr){
                if(p=='(')
                    vpsStack.push(p);
                else if(p==')'){
                    if(vpsStack.getTop()=='(')
                        vpsStack.pop();
                    else{
                        isVPS = false;
                        break;
                    }
                }
            }

            if(isVPS && !vpsStack.isEmpty()) isVPS  =false;

            if(isVPS == false){
                vpsStack.top = 0;
            }

            String result = isVPS ? "YES" : "NO";
            System.out.printf("%s\n", result);
        }
    }
}
class CharStack {
    private char stack[];
    int top;
    private int capacity;
    public CharStack(int capacity){
        stack = new char[capacity];
        this.capacity = capacity;
    }
    public boolean isEmpty(){
        return top==0;
    }

    public boolean isFull(){
        return top==capacity;
    }
    public boolean push(char par){
        if(isFull()) return false;
        stack[top++]=par;
        return true;
    }

    public char pop(){
        if(isEmpty()) return '0';
        return stack[--top];
    }

    public char getTop(){
        if(isEmpty()) return '0';
        return stack[top-1];
    }
}