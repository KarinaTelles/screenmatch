package test.sequences;

import java.io.IOException;

class Result {

    /*
     * Complete the 'getSequenceSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static long getSequenceSum(int i, int j, int k) {
        int recorderOfVari;
        int accumulatorOfVari = 0;
        recorderOfVari = i;
        int interatorOfVari;
        //5+6=11;11+7=18;18+8=26;26+9=35;
        for(interatorOfVari = 0; i<=j; interatorOfVari++){
            recorderOfVari = i++;
            accumulatorOfVari= accumulatorOfVari+recorderOfVari;
//            System.out.println(recorderOfVari);
//            System.out.println(accumulatorOfVari);
        }
        int recorderOfVarj;
        int accumulatorOfVarj = 0;
        recorderOfVarj = j;
        int interatorOfVarj;
        //9-8=1;1-7=-6;-6-7=-13;-13-6=-19
        for(interatorOfVarj=0;j>=k;interatorOfVarj++){
            recorderOfVarj = j--;
            accumulatorOfVarj = accumulatorOfVarj-recorderOfVarj;
//            System.out.println(recorderOfVarj);
            System.out.println(accumulatorOfVarj);
        }
        long test = 0;
        test = accumulatorOfVari;
        return test;
    }
    public static void main(String[] args) throws IOException {
        Result result = new Result();
        long resultado;
        resultado = result.getSequenceSum(5,9,6);
        System.out.println(resultado);
    }
}