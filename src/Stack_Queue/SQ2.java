package Stack_Queue;

import java.util.*;

public class SQ2 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++){
            // queue에 진도가 100이 되는 최소일수를 저장
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        List<Integer> answer = new ArrayList<>();

        // queue가 비어 있지 않을 때 까지 반복
        while (!queue.isEmpty()){
            // 맨 앞에 있는 최소일수를 day에 저장후 queue에서 제거
            int day = queue.poll();
            // 하루에 배포 기능의 수
            int cnt = 1;

            // queue가 비어있지 않고 day와 맨 앞에 있는 일 수가 크거나 같을 때 까지 반복
            while(!queue.isEmpty() && day >= queue.peek()){
                // 배포할 기능의 수를 1씩 증가
                cnt++;
                // 맨 앞에 있는 최소일수를 제거
                queue.poll();
            }
            // 하루에 배포될 기능의 수를 저장
            list.add(cnt);
        }

        return list;
    }
}
