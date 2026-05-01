class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;

        while(srow <= erow && scol<=ecol){
            //top
            for(int i=scol;i<=ecol;i++){
                list.add(matrix[srow][i]);
            }
            //right
            for(int j=srow+1; j<=erow;j++){
                list.add(matrix[j][ecol]);
            }
            //bottom
            for(int j=ecol-1; j>=scol;j--){
                if(srow == erow){
                    break;
                }
                list.add(matrix[erow][j]);
            }
            //left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol == ecol){
                    break;
                }
                list.add(matrix[i][scol]);
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return list;
    }
}