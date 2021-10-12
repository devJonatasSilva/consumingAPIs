/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viaCep;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;



/**
 *
 * @author jony_
 */
public class ServicoDeCep {
    
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;
    
    public static Endereco buscarEnderecoPelo(String cep) throws Exception{
        String urlParaChamada = webService + cep + "/json";
        
        try{
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            if(conexao.getResponseCode() != codigoSucesso){
                throw new RuntimeException("HTTP erro code: "+ conexao.getResponseCode());
            }
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);
            
            Gson gson = new Gson();
            Endereco endereco = new gson.fromJson(jsonEmString, Endereco.class);
            
            return endereco;
        }
        catch(Exception e){
            throw new Exception("ERRO: "+ e);
        }
    }
}
