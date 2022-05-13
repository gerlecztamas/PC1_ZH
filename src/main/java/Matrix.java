
import java.util.ArrayList;

public class Matrix {
    public static int countNumbersDivisibleBySeven(int[][] matrix){
        int hetes = 0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%7==0){
                    hetes++;
                }
            }
        }
        return hetes;
    }
    public static ArrayList<Integer> columnsWithMax(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();

        int maximum=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]>maximum){
                    maximum=matrix[i][j];
                }
            }
        }
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == maximum && result.contains(i) == false) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}

