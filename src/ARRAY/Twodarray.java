package ARRAY;

public class Twodarray {
    static void main(String[] args) {
//        int[][] arr;
//        //alloccation
//        arr=new int[3][4];
//        //int
//        int[][] brr ={
//                {1,2},
//                {2,3},
//                {3,4},
//                {4,5}
//                    };
//       // System.out.println(brr[0][1]);
//        int rowlength=brr.length;
//        int collength=brr[0].length;
//        for(int rowindex=0; rowindex<=rowlength-1; rowindex++){
//            for(int colindex=0; colindex<=collength-1; colindex++){
//                System.out.print(brr[rowindex][colindex]+ " ");
//            }
//            System.out.println();
//        }
        int[][] arr;
        //alloccation
        arr=new int[3][4];
        //int
        int[][] brr ={
                {1,2},
                {2,3},
                {3,4,4,5,6,7,},
                {4,5}
        };
        // System.out.println(brr[0][1]);
        int rowlength=brr.length;
       // int collength=brr[0].length;
        for(int rowindex=0; rowindex<=rowlength-1; rowindex++){
           int colLength=brr[rowindex].length;
            for(int colindex=0; colindex<=colLength-1; colindex++){
                System.out.print(brr[rowindex][colindex]+ " ");
            }
            System.out.println();
        }
        }
    }

