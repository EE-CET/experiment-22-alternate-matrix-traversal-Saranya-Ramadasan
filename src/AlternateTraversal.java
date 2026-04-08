

import java.util.Scanner;
public class AlternateTraversal {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    result.append(matrix[i][j]).append(" ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    result.append(matrix[i][j]).append(" ");
                }
            }
        }
        
        System.out.println(result.toString().trim());
        sc.close();
    }
    
}
