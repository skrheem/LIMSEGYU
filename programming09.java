package chap05;

public class programming09 {
    public static void main(String[] args) {
        char[][] array = createMine(5, 10, 0.3);
        printMine(array);
        Object[][] mineMapArray = checkMine(array);
        printMineMap(mineMapArray);
    }

    public static char[][] createMine(int m, int n, double percent) {
        // 사용자로부터 가로 열의 개수(m), 세로 열의 개수(n)
        // 지뢰가 매설될 확률(percent)를 인수로 전달 받는다.

        // 사용자로부터 전달 받은 가로 열, 세로 열에 맞는 크기의 배열을 생성
        char[][] array = new char[m][n];

        for (int i = 0; i < m; i++) {
            // 이 반복문은 배열의 가로 열을 순회하는 반복문이며
            for (int j = 0; j < n; j++) {
                // 이 반복문은 배열의 세로 열을 순회하는 반복문이다.

                // random() 함수로 0 ~ 1 사이의 double 형의 값을 랜덤하게 생성하여
                double randomPercent = Math.random();

                if (randomPercent <= percent)
                    // 사용자로부터 전달받은 확률과 같거나 낮은 값이 생성 된다면
                    // 현재 위치한 인덱스에 지뢰를 매설한다.
                    array[i][j] = '*';
                else
                    // 더 높은 값이 생성 된다면
                    // 현재 위치한 인덱스에 지뢰를 매설하지 않는다.
                    array[i][j] = '-';
            }
        }
        return array;
    }
    public static Object[][] checkMine(char[][] array) {
        // ex) char[5][10] array
        int rows = array.length; // rows = 5
        int cols = array[0].length; // cols = 10
        Object[][] mineMapArray = new Object[rows][cols];

        // 현재 순회중인 인덱스 주위에 지뢰가 있는지 검사 하려면
        // ↖ ↑ ↗ ← → ↙ ↓ ↘ 총 8방향의 인덱스를 검사해야 한다.
        // ↖ 방향은 array[i-1][j-1]
        // ↑ 방향은 array[i][j-1]
        // ↗ 방향은 array[i+1][j-1]
        // ← 방향은 array[i-1][j]
        // → 방향은 array[i+1][j]
        // ↙ 방향은 array[i-1][j+1]
        // ↓ 방향은 array[i][j+1]
        // ↘ 방향은 array[i+1][j+1]
        for (int i = 0; i < rows; i++) {
            // 이 반복문은 지뢰가 있는 array[5][10]의 가로 열을 순회하며
            // i = 0
            for (int j = 0; j < cols; j++) {
                // 이 반복문은 array[5][10]의 세로 열을 순회한다.
                // i = 0, j = 0
                int mineCount = 0;
                if (array[i][j] == '-') {
                    for (int x = -1; x <= 1; x++) {
                        // 이 반복문은 -1, 0, 1 총 3번 반복하여
                        // array[5][10]의 가로 열에 -1, 0, +1을 더하여
                        // ← : array[i-1][j]
                        // → : array[i+1][j] 방향을 검사할 수 있도록 하며
                        // i = 0, j = 0, x = -1
                        for (int y = -1; y <= 1; y++) {
                            // 이 반복문은 x의 값에 따라
                            // array[5][10]의 세로 열에 -1, 0, +1을 더하여
                            // ↖ : array[i-1][j-1]
                            // ↑ : array[i][j-1]
                            // ↗ : array[i+1][j-1]
                            // ↙ : array[i-1][j+1]
                            // ↓ : array[i][j+1]
                            // ↘ : array[i+1][j+1] 방향을 검사할 수 있도록 한다.
                            // i = 0, j = 0, x = -1, y = -1
                            int newX = i + x; // newX = -1
                            int newY = j + y; // newY = -1
                            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                                // false && true && false && true => false
                                // newX >= 0
                                // -1 >= 0 : false
                                // newX < rows
                                // -1 < 5 : true
                                // newY >= 0
                                // -1 >= 0 : false
                                // newY < cols
                                // -1 < 10 : true
                                // array[-1][-1]은 존재하지 않는 인덱스이므로 패스
                                // 이를 반복하여 array[0][0] ~ array[5][10]까지 체크하여 지뢰가 있는 인덱스를 센다.
                                if (array[newX][newY] == '*')
                                    // 지뢰 카운트 + 1
                                    mineCount++;
                            }
                        }
                    }
                    // array[0][0] 주위에 지뢰가 있다면 mineMapArray[0][0]에 지뢰의 개수를 저장한다.
                    mineMapArray[i][j] = mineCount;
                } else
                    mineMapArray[i][j] = array[i][j];
            }
        }
        return mineMapArray;
    }
    public static void printMine(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
    public static void printMineMap(Object[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
