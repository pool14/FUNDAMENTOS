import java.util.Scanner;
public class Reto_3 {
     public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

     String [][] numero = new String [6][21];

     
     
     numero [0][0] = "ESC";
     numero [0][1] = "F1";
     numero [0][2] = "F2";
     numero [0][3] = "F3";
     numero [0][4] = "F4";
     numero [0][5] = "F5";
     numero [0][6] = "F6";
     numero [0][7] = "F7";
     numero [0][8] = "F8";
     numero [0][9] = "F9";
     numero [0][10] = "F10";
     numero [0][11] = "F11";
     numero [0][12] = "F12";
     numero [0][13] = "ImpPnt";
     numero [0][14] = "Bloq";
     numero [0][15] = "Pausa";
     numero [0][16] = " ";
     numero [0][17] = " ";
     numero [0][18] = " ";
     numero [0][19] = " ";
     numero [0][20] = " ";

     

     numero [1][0] = "º";
     numero [1][1] = "1";
     numero [1][2] = "2";
     numero [1][3] = "3";
     numero [1][4] = "4";
     numero [1][5] = "5";
     numero [1][6] = "6";
     numero [1][7] = "7";
     numero [1][8] = "8";
     numero [1][9] = "9";
     numero [1][10] = "0";
     numero [1][11] = "?";
     numero [1][12] = "¿";
     numero [1][13] = "<--";
     numero [1][14] = "Ins";
     numero [1][15] = "Inicio";
     numero [1][16] = "RePag";
     numero [1][17] = "BloqNum";
     numero [1][18] = "/";
     numero [1][19] = "*";
     numero [1][20] = "-";

     numero [2][0] = "<-->";
     numero [2][1] = "Q";
     numero [2][2] = "W";
     numero [2][3] = "E";
     numero [2][4] = "R";
     numero [2][5] = "T";
     numero [2][6] = "Y";
     numero [2][7] = "U";
     numero [2][8] = "I";
     numero [2][9] = "O";
     numero [2][10] = "P";
     numero [2][11] = "`";
     numero [2][12] = "+";
     numero [2][13] = "Ç";
     numero [2][14] = "Supr";
     numero [2][15] = "Fin";
     numero [2][16] = "Avpag";
     numero [2][17] = "7";
     numero [2][18] = "8";
     numero [2][19] = "9";
     numero [2][20] = "+";

     numero [3][0] = "BloqMayus";
     numero [3][1] = "A";
     numero [3][2] = "S";
     numero [3][3] = "D";
     numero [3][4] = "F";
     numero [3][5] = "G";
     numero [3][6] = "H";
     numero [3][7] = "J";
     numero [3][8] = "K";
     numero [3][9] = "L";
     numero [3][10] = "Ñ";
     numero [3][11] = "´";
     numero [3][12] = "<-";
     numero [3][13] = "";
     numero [3][14] = "";
     numero [3][15] = "";
     numero [3][16] = "4";
     numero [3][17] = "5";
     numero [3][18] = "6";
     numero [3][19] = "";
     numero [3][20] = "";
     

     numero [4][0] = "^";
     numero [4][1] = "<>";
     numero [4][2] = "Z";
     numero [4][3] = "X";
     numero [4][4] = "C";
     numero [4][5] = "V";
     numero [4][6] = "B";
     numero [4][7] = "N";
     numero [4][8] = "M";
     numero [4][9] = ";";
     numero [4][10] = ":";
     numero [4][11] = "_";
     numero [4][12] = "^";
     numero [4][13] = "";
     numero [4][14] = "";
     numero [4][15] = "↑";
     numero [4][16] = "";
     numero [4][17] = "1";
     numero [4][18] = "2";
     numero [4][19] = "3";
     numero [4][20] = "iNTRO";

     

     numero [5][0] = "Ctrl";
     numero [5][1] = "Windows";
     numero [5][2] = "Alt";
     numero [5][3] = "";
     numero [5][4] = "";
     numero [5][5] = "";
     numero [5][6] = "";
     numero [5][7] = "";
     numero [5][8] = "";
     numero [5][9] = "";
     numero [5][10] = "AltGr";
     numero [5][11] = "Fn";
     numero [5][12] = "✉";
     numero [5][13] = "Ctrl";
     numero [5][14] = "←";
     numero [5][15] = "↓";
     numero [5][16] = "→";
     numero [5][17] = "0"; 
     numero [5][18] = "";
     numero [5][19] = ".";
     numero [5][20] = "";
     
    
     

     

    for (int i = 0; i <6; i ++){
        for (int u = 0; u <21; u ++){


            System.out.print(numero[i][u]+ "\t" ); 
           

        }
        System.out.println("");
        System.out.println();
    }
    
    lectura.close();
}
}