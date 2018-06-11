import org.apache.commons.lang3.StringUtils;

public class Questao8 {


    public Integer retornaValor(int A, int B){

        int[]arrayA = Integer.toString(A).chars().map(c -> c-'0').toArray();
        int[]arrayB = Integer.toString(B).chars().map(c -> c-'0').toArray();

        Integer result[] = new Integer[arrayA.length+arrayB.length];
        for (int i = 0, j = 0; j < result.length; ++i) {
            if (i < arrayA.length) {
                result[j++] = arrayA[i];
            }
            if (i < arrayB.length) {
                result[j++] = arrayB[i];
            }
        }

        int resp = Integer.valueOf(StringUtils.join(result));
        if(resp > 1000000)
            return - 1;

        return resp;
    }

}
