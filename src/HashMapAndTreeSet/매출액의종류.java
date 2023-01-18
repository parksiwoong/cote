package HashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** 매출액의 종류 (Hash, sliding window)
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * 20 12 20 10 23 17 10
 * 각 연속 4일간의 구간의 매출종류는
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종류를 출력하는 프로그램을 작성하세요.
 *
 * @입력설명: 첫 줄에 N(5<=N<=100,000)과 K(2<=k<=N)가 주어집니다.
 *          두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * @입력예제: 7 4
 *          20 12 20 10 23 17 10
 * @출력예제: 3 4 4 3
 * */
public class 매출액의종류 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            //arr의 키번호를 가져오고 getOrDefault 로 arr[i]번째에 없으면 0을 가져와라
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        //rt=k-1 k매출액전 까지 넣어줌
        for(int rt=k-1; rt<n; rt++){
            //하나 증가해야함 카운팅 하는거니깐
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            //키의 종류와 같기때문에
            answer.add(HM.size());
            //rt가 쫒아가야하니
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
    매출액의종류 T = new 매출액의종류();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //총 일수 (7일)
        int k = kb.nextInt();  //k일 동안 (4일)
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,k,arr)) System.out.println(x+ " ");
    }
}
