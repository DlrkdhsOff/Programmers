//대소문자 바꿔서 출력하기

//문제 설명
//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
//
//제한사항
//1 ≤ str의 길이 ≤ 20
//str은 알파벳으로 이루어진 문자열입니다.
//입출력 예
//입력 #1
//
//aBcDeFg
//출력 #1
//
//AbCdEfG

package level0;

import java.util.Scanner;

public class Print_With_Case_Changed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] str = a.toCharArray();
        for(char ss : str){
            if (Character.isLowerCase(ss)) {
                ss = Character.toUpperCase(ss);
            }else{
                ss = Character.toLowerCase(ss);
            }
            System.out.print(ss);
        }
    }
}
