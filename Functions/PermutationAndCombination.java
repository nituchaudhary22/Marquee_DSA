package Functions;

import java.util.Scanner;

public class PermutationAndCombination {
        public static int Fact(int n){
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return (int)fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r=sc.nextInt();
        int fact_n =Fact(n);
        int fact_r =Fact(r);
        int fact_n_r = Fact(n-r);
        int nCr=fact_n/(fact_n_r*fact_r);
        int nPr=fact_n/fact_n_r;
        System.out.println(nCr);
        System.out.println(nPr);
    }
        }
    


