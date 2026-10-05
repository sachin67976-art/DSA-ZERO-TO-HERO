package ARRAY;

public class Solidpattern {
  public static void main(String[] args) {
//int r=3;
//int c=5;
//      for(int i=1; i<=r; i++){
//
//          for(int k=1; k<=c; k++){
//
//              System.out.print(" * ");
//
//          }
//          System.out.println();

//      }

//int n=5;
//for(int rows=1; rows<=n; rows++){
//    for(int col=1; col<=rows; col++){
//
//        System.out.print(" * ");
//    }
//    System.out.println();
//}
//      int n=5;
//      for(int row=1; row<=n; row++){
//          for(int col=1; col<=n-row; col++){
//              System.out.print(" ");
//
//              }
//          for(int col=1; col<=n; col++){
//              System.out.print("*");
//
//          }
//          System.out.println();
////      }
//      int n=5;
//      for(int row=1; row<=n; row++){
//          for(int col=1; col<=n-row+1; col++){
//              System.out.print(" * ");
//          }
//          System.out.println();
//      }
//    int n=5;
//for(int row=1; row<=n; row++){
//for(int col=1; col<=n-row; col++){
//    System.out.print(" ");
//}
//for(int col=1; col<=2*row-1; col++){System.out.print("*");
//}
//    System.out.println();
//
//  }
//      int n=5;
//for( int row=1; row<=n; row++){
//    for(int col=1; col<=n-row; col++){
//        System.out.println(" ");
///   }
//    for(int col=1; col<=2*row-1; col++){
//        System.out.print("*");
//    }
//    System.out.println();
//}
//      int n=4;
//      for(int row=1; row<=n; row++){
//          for(int col=1; col<=row-1; col++){
//              System.out.print(" ");
//          }
//          for(int col=1; col<=2*n-2*row+1; col++){
//          System.out.print("*");
//          }
//          System.out.println();
//
//      }
     int n =4;
for(int row=1; row<=n; row++){
    for(int col=1; col<=6; col++){
    if(row==1 || row==n){
        System.out.print("* ");

    }
    else{
        if(col==1 || col==6){
            System.out.print("* ");

        }
        else{
            System.out.print("  ");
        }
    }
}
    System.out.println();



}


  }

}
