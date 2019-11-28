package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/11/28.
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 *
 * @author Jeff_xu
 */
public class HasPath {

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        char[][] newMatrix = new char[rows][cols];
        int index1 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[i][j] = matrix[index1];
                index1++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (newMatrix[i][j] == str[0]) {
                    boolean[][] flag = new boolean[rows][cols];
                    boolean access = access(flag, 0, i, j, rows, cols, newMatrix, str);
                    if (access) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean access(boolean[][] flag, int index, int i, int j, int rows, int cols, char[][] matrix, char[] str) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || flag[i][j] || matrix[i][j] != str[index]) {
            return false;
        }
        flag[i][j] = true;
        if (index == (str.length - 1) && str[index] == matrix[i][j]) {
            return true;
        }
        int currentIndex = ++index;
        return access(flag, currentIndex, i - 1, j, rows, cols, matrix, str) ||
            access(flag, currentIndex, i + 1, j, rows, cols, matrix, str) ||
            access(flag, currentIndex, i, j - 1, rows, cols, matrix, str) ||
            access(flag, currentIndex, i, j + 1, rows, cols, matrix, str);
    }

    public static void main(String[] args) {
        char[] matrix = new char[] {'A','B','C','E','H','J','I','G','S','F','C','S','L','O','P','Q','A','D','E','E','M','N','O','E','A','D','I','D','E','J','F','M','V','C','E','I','F','G','G','S'};
        char[] str = new char[] {'S','G','G','F','I','E','C','V','A','A','S','A','B','C','E','H','J','I','G','Q','E','M'};
        System.out.println(hasPath(matrix, 5, 8, str));
    }
}
