package br.com.gbrsistemas.main.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

    private static ObjectMapper mapper = new ObjectMapper();

    public static String formatErro(String erro) {
        String retorno = erro;
        try {
            Error error = mapper.readValue(erro, Error.class);
            if(error != null && error.getMessage() != null) {
                retorno = error.getMessage();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
