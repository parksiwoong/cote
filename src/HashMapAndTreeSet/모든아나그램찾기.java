package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩, 윈도우)
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분 문자열의 개수를 구하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이여야 합니다.
 *
 * @입력설명: 첫줄에 첫 번째 S문자열이 입력되고, 두번째줄에 T문자열이 입력됩니다.
 *          S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 * @출력설명: S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *          부가설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 * @입력예제: bacaAacba
 *          abc
 * @출력예제: 3
 * */
public class 모든아나그램찾기 {
    public int solution(String a, String b){
        int answer=0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        return answer;
    }
    public static void main(String[] args) {
    모든아나그램찾기 T = new 모든아나그램찾기();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a,b));
    }
}
