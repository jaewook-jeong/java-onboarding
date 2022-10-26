package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // 시작면과 마지막면일 경우 에러처리
        // 각 자리 수를 더하는 메서드
        // 각 자리 수를 곱하는 메서드
        // 가장 큰 값을 리턴
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    private static boolean validate(List<Integer> pages) {
        if (pages.size() != 2) {
            return false;
        }
        if (pages.get(0) % 2 == 0) {
            return false;
        }
        if (pages.get(1) % 2 == 1) {
            return false;
        }
        if (1 != Math.abs(pages.get(0) - pages.get(1))) {
            return false;
        }
        return true;
    }
}