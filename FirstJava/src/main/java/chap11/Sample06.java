package chap11;

import java.util.Stack;

public class Sample06 {

    public static void main(String[] args) {
        var stack = new Stack<String>();
        
        // 1. dog, cat, lion 순으로 push
        stack.push("dog");
        stack.push("cat");
        stack.push("lion");
        System.out.printf("총 %d의 자료가 있습니다.%n%n", stack.size());
        
        // 2. pop
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.printf("총 %d의 자료가 있습니다.%n%n", stack.size());
    }
}