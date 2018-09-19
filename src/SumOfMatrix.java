import java.util.Scanner;

public class SumOfMatrix {
    static int rowDim;
    static int columnDim;
    int[] elements; //static is used to initialize all the object's instance variable to same so if one of the object changes its value, it will chnage to that
    public void inputMatrixElements(int dimM,int dimN){
        rowDim=dimM;
        columnDim=dimN;
        System.out.println("Enter "+(dimM*dimN)+" elements for Matrix");
        elements=new int[dimM*dimN];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<(dimM*dimN);i++){
            elements[i]=scan.nextInt();
        }
    }
    public void sumOfMatrices(SumOfMatrix a, SumOfMatrix b) {
        SumOfMatrix c = new SumOfMatrix();
        c.elements=new int[rowDim*columnDim];
        for (int i = 0; i < (rowDim * columnDim); i++) {
            c.elements[i] = a.elements[i] + b.elements[i];
        }
        System.out.print("Sum of the matrices");
        for (int i = 0; i < (rowDim * columnDim); i++) {
            if(i%columnDim==0){
                System.out.println("\n");
                System.out.print("\t"+c.elements[i]);
            }
            else
                System.out.print("\t"+c.elements[i]);

        }
    }

    public static void main(String[] args) {
        SumOfMatrix matrix1=new SumOfMatrix();
        SumOfMatrix matrix2=new SumOfMatrix();
        SumOfMatrix matrixSum=new SumOfMatrix();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the row dimension:");
        int dimM=scan.nextInt();
        System.out.println("Enter the column dimension:");
        int dimN=scan.nextInt();
        matrix1.inputMatrixElements(dimM,dimN);
        matrix2.inputMatrixElements(dimM,dimN);
        matrixSum.sumOfMatrices(matrix1,matrix2);

    }
}