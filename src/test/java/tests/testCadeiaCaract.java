package tests;

import org.junit.Assert;
import org.junit.Test;

public class testCadeiaCaract {

    public String testCadeia (String cadeia, String caracter) {
        String resultado ;
        resultado = "INICIO";

        if (cadeia.length() < 1 || cadeia.length() > 20)
            resultado = "Erro: cadeia inválida";
        else if (caracter.length() < 1)
            resultado = "Erro: nenhum caractere  informado.";
        else if (caracter.length() > 1)
            resultado = "Erro: mais de um caractere  informado.";
        else if (cadeia.indexOf(caracter) < 0)
            resultado = "O caractere não pertence a  cadeia informada";
        else if (cadeia.indexOf(caracter) >= 0)
            resultado = Integer.toString(cadeia.indexOf(caracter)+1);

        return resultado;
    }

    @Test
    public void enviaTesteOK(){Assert.assertEquals("2",testCadeia("abc","b"));    }

    @Test
    public void enviaTesteNaoAcha(){Assert.assertEquals("O caractere não pertence a  cadeia informada",testCadeia("abc","d"));    }

    @Test
    public void enviaTesteCadeiaInvalida(){Assert.assertEquals("Erro: cadeia inválida",testCadeia("ABCDEFGHIJKLMNOPQRSTUVWXYZ","d"));    }

    @Test
    public void enviaTesteMaisCaracter(){Assert.assertEquals("Erro: mais de um caractere  informado.",testCadeia("abc","das"));    }

    @Test
    public void enviaTesteSemCaracter(){Assert.assertEquals("Erro: nenhum caractere  informado.",testCadeia("abc",""));    }
}
