package Array;

import java.util.Scanner;

/** 5*5 격자판에 아래와 같은 숫자가 적혀 있습니다.
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 힘을 출력합니다.
 *
 *
 * @입력설명: 철 줄에 자연수 N이 주어진다. (2 <=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지않는다.
 *
 * @입력예제:
 *   5
 *   10 13 10 12 15
 *   12 39 30 23 11
 *   11 25 50 53 15
 *   19 27 29 37 27
 *   19 13 30 13 19
 * @출력예제: 155
 * */
public class 격자판최대합_9 {
    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1 ,sum2;
        for(int i =0; i<n; i++){
            sum1 = sum2 =0;
            for(int j=0; j<n; j++){
                //sum1은 0행에 값 다할거고 sum2는 0열의 합을 다 할것
                sum1+=arr[i][j];
                //앞에 행이 움직이고 i가 열번호를 고정
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        //대각선 구하기 예)
        for(int i=0; i<n; i++){
            //0행0열 ,1행1열 ..
            sum1+=arr[i][i];
            //끝에 대각선 [0] [5-0-1] 1행5열, [1][5-1-1] 2행4열 ..
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }
    public static void main(String[] args) {
        격자판최대합_9 T = new 격자판최대합_9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}
