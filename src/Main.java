
public class Main {
    public static void main(String[] args) {

       /* for(int i=0; i<1000000; i++){
            boolean t = true;
            for(int n = 6; n<i; n++){
                if(n % i == 0){
                    t = false;
                    break;
                }
            }
            if(t){
               System.out.println(i);
            }*/
            for(int j=0; j<1000000; j++){
                boolean t= true;
                for(int m=28; m<j; m++){
                    if(m%j==0){
                        t = false;
                        break;
                    }
                }
                if(t){
                    System.out.println(j);
                }
            }
        }

    }

