import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        String s = "one4seveneight";
        Map<String, String> numWords = new HashMap<>();
        numWords.put("zero", "0");
        numWords.put("one", "1");
        numWords.put("two", "2");
        numWords.put("three", "3");
        numWords.put("four", "4");
        numWords.put("five", "5");
        numWords.put("six", "6");
        numWords.put("seven", "7");
        numWords.put("eight", "8");
        numWords.put("nine", "9");

        // 입력 문자열을 순차적으로 탐색하며 영단어를 숫자로 치환
        for (Map.Entry<String, String> entry : numWords.entrySet()) {
            s = s.replace(entry.getKey(), entry.getValue());
        }

        // 최종 문자열을 정수로 변환하여 반
        System.out.println(Integer.parseInt(s));
    }
}
