package dec21;

public class pattern10 {
    public static void main(String[] args) {
        int size = 5;
        int[][] spiralMatrix = new int[size][size];
        int mincol =0,minrow=0;
        int maxcol = size-1,maxrow=size-1;
        int val =1 ;
        while(val<=size*size){
            for(int i = mincol;i<=maxcol;i++){
                spiralMatrix[minrow][i]=val;
                val++;
            }
            for(int i=minrow+1;i<=maxrow;i++){
                spiralMatrix[i][maxcol] = val;
                val++;
            }
            for(int i = maxcol-1;i>=mincol;i--){
                spiralMatrix[maxrow][i] = val;
                val++;
            }
            for(int i = maxrow-1;i>=minrow+1;i--){
                spiralMatrix[i][mincol] = val;
                val++;
            }
            mincol++;
            minrow++;
            maxrow--;
            maxcol--;
        }
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
