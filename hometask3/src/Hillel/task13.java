package Hillel;

public class task13 {
    public static void main(String[] args){
        System.out.println("task 13");
        // Вывести на экран шахматную доску 8х8 в виде 2 мерного массива
        // (W - белые клетки , B - черные клети)
        int[][] matrix = new int[8][8];
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                if((i + j) % 2 == 0)
                    System.out.print("BB ");
                else
                    System.out.print("WW ");
            }
            System.out.print("\n");
        }
    }
}
