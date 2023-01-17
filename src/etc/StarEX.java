package etc;

import java.util.Scanner;

public class StarEX {
    public static void main(String[] args) {
        // 1) 간단한 2차원 배열 별찍기
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        // 2) 삼각형 모양 별찍기 - 1
        for(int i=1; i <5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 3) 삼각형 모양 별찍기 - 2
        for(int i = 1; i < 5; i++) {
            for(int j = 4; j > 0; j--) {
                if(i<j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        // 4) 피라미드 모양 별찍기
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j<3-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 5) 마름모 찍기
        System.out.println("홀수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num ; i++) {
            for(int j = 0; j < num ; j++) {
                if(i <= num/2) {                    // 위 영역
                    if(i+j <= num/2-1) {            // 왼쪽 위 공백
                        System.out.print(" ");
                    } else if(j-i >= num/2+1) {     // 오른쪽 위 공백
                        System.out.print(" ");
                    } else {
                        System.out.print("*");      // * 찍기
                    }
                } else if(i > num/2) {              // 아래 영역
                    if(i-j>=num/2+1) {              // 왼쪽 아래 공백
                        System.out.print(" ");
                    } else if(i+j>=num/2*3+1) {     // 오른쪽 아래 공백
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
