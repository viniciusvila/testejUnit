package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class testTriangulo {


    public String testTriangulo(int a,int b, int c, String saidaEsperada){

        String tipo = "ESCALENO";

        if (a <= 0 || b <= 0 || c <= 0)
            tipo = "INEXISTENTE";
        else if (!((a + b > c) && (a + b > c) && (b + c > a)))
            tipo = "INEXISTENTE";
        else if (a == b) {
            tipo = "ISOSCELES";

            if (b == c)
                tipo = "EQUILATERO";

        } else if (b == c || a == c)
            tipo = "ISOSCELES";

        System.out.println("Saída esperada : " + saidaEsperada + "\n" + "Tipo Triângulo : " + tipo);
        return tipo;
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("Teste 1");
    }

    @Test
    public void teste1(){
        Assert.assertEquals("INEXISTENTE",testTriangulo(0,0,0,"INEXISTENTE"));
    }

    @Test
    public void teste2(){
        Assert.assertEquals("INEXISTENTE",testTriangulo(1,2,3,"INEXISTENTE"));
    }

    @Test
    public void testeEQUILATERO(){
        Assert.assertEquals("EQUILATERO",testTriangulo(1,1,1,"EQUILATERO"));
    }

    @Test
    public void testeISOSCELES(){
        Assert.assertEquals("ISOSCELES",testTriangulo(1,2,2,"ISOSCELES"));
    }

    @Test
    public void testeISOSCELES2(){
        Assert.assertEquals("ISOSCELES",testTriangulo(2,2,1,"ISOSCELES"));
    }

    @Test
    public void testeESCALENO(){
        Assert.assertEquals("ESCALENO",testTriangulo(2,3,4,"ESCALENO"));
    }


}
