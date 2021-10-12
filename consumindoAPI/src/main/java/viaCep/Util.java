
package viaCep;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author jony_
 */
public class Util {
    
    public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException{
        String resposta, jsonEmString = "";
        while((resposta = bufferedReader.readLine()) != null){
            jsonEmString += resposta;
        }
        
        return jsonEmString;
    }    
}
