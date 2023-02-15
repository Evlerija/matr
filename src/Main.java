public class Main {
    public static void main(String[] args) {
        float[][] M = {{1,2},{3,4},{5,6}};
        float[][] N = {{7,6},{8,4},{2,3}};
        float[][] O = {{8,4},{5,9}};
        Matrix A = new Matrix(M,3,2);
        Matrix B = new Matrix(N,3,2);
        A.print(B.summat(M, 3,2));
        A.print(B.umnmat(M,3,2 ));

    }
}