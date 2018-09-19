public class ChessBoard {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0 && i % 2 == 0)
                    chess[i][j] = "WW|";
                else if (i % 2 == 0 )
                    chess[i][j] = "BB|";
                else if(j%2==0)
                    chess[i][j] = "BB|";
                else
                    chess[i][j]="WW|";
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }
}

