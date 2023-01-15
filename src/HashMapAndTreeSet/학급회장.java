package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/** 1. 학급 회장(해쉬)
 *
 * @설명: 학급회장을 뽑는데 후보로 기호 A,B,C,D,E 후보가 등록을 했습니다.
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * 반드시 한 명의 학급회장이 선출 되도록 투표결과가 나왔다고 가정합시다.
 *
 * @입력: 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 * 두 번째 중에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 * @출력: 학급 회장으로 선택된 기호를 출력합니다.
 *
 * @예시입력:
 * 15
 * BACBACCACCBDEDE
 *
 * @예시출력: C*/
public class 학급회장 {
    public char solution(int n,String s){
        char answer=' ';
        //<키값의 데이터형, 벨루값의 데이터형>
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            //get은 x의 키에 value값을 가져옴
            //map.put(x, map.get(x)
            //x키를 가져오돼 x라는 키가 없다라면 0을 가져와라 무슨값이든 그 뒤엔 +1 을 하여 가져와라
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        /** 추가 설명 start */
        //containsKey는 true or false 를 리턴해줌
        System.out.println(map.containsKey('A'));
        //키의 갯수를 알려줌 (5개)
        System.out.println(map.size());
        System.out.println();
        /** 추가 설명 end */

        int max = Integer.MIN_VALUE;
        //존재하는 키들을 타색하기 위해
        for(char key : map.keySet()){
            System.out.println(key); // A B C D 등 키가 있는지 확인
            System.out.println(key+" "+map.get(key)); //키의 value값을 가져와라

            if(map.get(key) > max){
                max=map.get(key);
                answer=key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
    학급회장 T = new 학급회장();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n,str));
    }
}
