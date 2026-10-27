public class Countzeroone {
    static int[]getzeroonecount(int arr[]){
        int zerocount =0;
        int onecount =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zerocount++;

            }
            else{
                //arr[i] =1
                onecount++;
            }
        }
int ans[] ={zerocount, onecount};
        return ans;
    }
    static void main(String[] args) {
        int arr[]={1,0,0,0,1,1,1,1,};
        int ans[]=getzeroonecount(arr);
        System.out.println("zerocount  =" + ans[0]);
        System.out.println(" onecount  =" + ans[1]);
    }

    }

