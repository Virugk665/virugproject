package chapterTwo;

public class Tic_Tac1 {
    public static void main(String[] args) {


        char[][] Tic_Tac1 = {{'X', 'O',}, {'X', 'X', 'X'}, {'O', 'X', 'O'}};
        for (int i = 0; i < Tic_Tac1.length; i++) {
            for (int j = 0; j < Tic_Tac1[i].length; j++) {
                System.out.print(Tic_Tac1[0][0] + " "+ Tic_Tac1[0][1]+ " " + Tic_Tac1[1][0]);

            }
        }

    }
}
