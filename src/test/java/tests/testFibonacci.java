package tests;

import org.junit.Assert;
import org.junit.Test;

public class testFibonacci {

    public String fib(String nInformado) {
        int n1 = 0, n2 = 1;
        boolean isNumero = true;

        try {
            Double num = Double.parseDouble(nInformado);
        } catch (NumberFormatException e) {
            isNumero = false;
        }
        if(isNumero){
            int valor = Integer.parseInt(nInformado);
            if (valor  < 0)
                return "Erro: n deve ser maior do que 0";

            for (int qtd = valor +1; qtd > 0; qtd--) {

                if (n1 > valor){
                    return Integer.toString(n1);
                }

                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        else
            return "Erro: Entre com um número inteiro positivo.";

        return Integer.toString(n1);
    }

    @Test
    public void testeOK(){
        Assert.assertEquals("8",fib("6"));
        Assert.assertEquals("Erro: n deve ser maior do que 0",fib("-2"));
        Assert.assertEquals("Erro: Entre com um número inteiro positivo.",fib("a"));
    }

}
