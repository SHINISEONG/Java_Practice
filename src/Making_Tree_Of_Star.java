import java.util.Scanner;

public class Making_Tree_Of_Star {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("k입력해\n> ");
        int k=0, twoSquareK = 1, totalLine = 3, invisibleTriangle = 0;

        while(true)
        {
            k = scanner.nextInt();
            if (k>=0 && k <= 10){
                break;
            }
            System.out.print("0과 10사이로 입력해\n> ");
        }
        scanner.close();

        for (int i = 0; i < k; i++){
            twoSquareK *= 2;
        }

        char[] line = new char[3*twoSquareK*2];
        totalLine *= twoSquareK;
        invisibleTriangle = totalLine-1;
        System.out.println(totalLine);
        for (int i = 0; i < totalLine; i++){

            for (int j = 0; j < totalLine-i; j++){
                System.out.print(" ");
            }
            switch ((i+1)%3) {
                case 1:
                    System.out.print("*");
                    break;
                case 2:
                    System.out.print("* *");
                    break;
                case 0:
                    System.out.print("*****");
                    break;
            }

            if (k>0 && i>(totalLine/2)-1) {

                for (int j = 1; j <= invisibleTriangle; j++) {
                    System.out.print(" ");
                }
                invisibleTriangle -= 2;


                switch ((i + 1) % 3) {
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("* *");
                        break;
                    case 0:
                        System.out.print("*****");
                        break;
                }
            }
            System.out.print("\n");
            }



        }
    }


