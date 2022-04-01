package chapterTwo;

public class TicTac {

        public static void main(String[] args) {
            String[][] Tic_Tac = new String[3][3];
            Tic_Tac[0][0] = "X" ;
            Tic_Tac[0][1] ="O";
            Tic_Tac[0][2]= " ";
            Tic_Tac[1][0] = "X";
            Tic_Tac[1][1] = "X";
            Tic_Tac[1][2] = "X";
            Tic_Tac[2][0] = "O";
            Tic_Tac[2][1] = "X";
            Tic_Tac[2][2] = "O";

            System.out.println(Tic_Tac[0][0] +" "+ Tic_Tac[0][1] +" " + Tic_Tac[0][2]);
            System.out.println(Tic_Tac[1][0] + " "+ Tic_Tac[1][1] +" " + Tic_Tac[1][2] );
            System.out.println(Tic_Tac[2][0] + " " + Tic_Tac[2][1] +" " + Tic_Tac[2][2] );



        }
    }


