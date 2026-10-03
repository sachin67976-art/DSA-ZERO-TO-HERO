public class Maxvalueof2darray {
    static void main(String[] args) {
      int arr[][] ={{1,2,3},{21,20,19}};
      int maxvalue=arr[0][0];

      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr.length; j++){
              if(arr[i][j]> maxvalue){
                  maxvalue=arr[i][j];
              }
          }
      }
        System.out.println(maxvalue);
    }
}
