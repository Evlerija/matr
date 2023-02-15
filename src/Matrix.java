public class Matrix {
    public float[][] matrix;
    public float[][] matrix2;
    public float line;
    public float line2;
    public float stolb;
    public float stolb2;


    public Matrix(float[][] matrix, float stolb, float line) {
        this.matrix = matrix;
        this.stolb = stolb;
        this.line = line;

    }
    public float[][] summat(float[][] M, float stolb, float line){
        float[][] result = new float[(int) stolb][(int)line];
        for(int i = 0; i < this.matrix.length ; i++){
            for(int j = 0; j < this.matrix[0].length ; j++){
                //result[i][j] = this.matrix[i][j] + M[i][j];
                float numMatrix1 = M[i][j];
                float numMatrix2 = M[i][j];
                float sum = numMatrix1 + numMatrix2;
                result[i][j] = sum;
            }
        }
        return result;
    }
    public void print(float[][] summat) {
        for (float[] line : this.matrix) {
            for (float element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public float[][] umnmat(float[][] M,float stolb, float line) {
        int line1 = this.matrix.length;
        double stolb1 = this.matrix[0].length;
        double line2 = this.matrix.length;
        int stolb2 = this.matrix[0].length;
        float[][] result = new float[line1][stolb2];
        return result;
    }
}
