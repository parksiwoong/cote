package StackQueue;

import java.util.Scanner;
import java.util.Stack;

/** 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 "YES" , 올바르지 않으면 "NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()())))은 올바른 괄호가 아니다.
 *
 * @입력설명: 철 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * @출력설명: 첫 번째 줄에 YES, NO 를 출력한다.
 * @입력예제: (()(()))(()
 * @출렬예제: NO
 * */
public class 올바른괄호 {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else {
                //여는괄호에만 스텍에 넣고 그외엔 스텍안이 비어있냐는걸 묻는것
                if(stack.isEmpty()) return "NO";
                stack.pop(); //제일 상단(마지막)에 있는거 꺼내는거
            }
        }
        //스텍에 뭔가 남아있으면
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        올바른괄호 T = new 올바른괄호();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
