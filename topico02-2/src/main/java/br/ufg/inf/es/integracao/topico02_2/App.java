package br.ufg.inf.es.integracao.topico02_2;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Classe que faz uma requisição para a API do github
 * Essa API retorna um JSON com vários valores
 * O programa então pega um desses valores, a url de uma imagem,
 * e a salva localmente no disco.
 * @author caua539
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	URL url = new URL("https://api.github.com/users/kyriosdata");
    	HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    	
    	try {
    		BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
    		String inputLine = in.readLine();
    		saveImage(jsonConverter(inputLine), "image.jpg");

    	} finally {
    	  urlConnection.disconnect();
    	}
    		
    }
    
    /**
     * Cria um hash map de uma string json usando a biblioteca GSON
     * @param input: string no formato JSON
     * @return url da imagem contida nos dados do JSON de entrada
     */
    public static String jsonConverter (String input) {
    	Gson gson = new Gson();
		Type type = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> myMap = gson.fromJson(input, type);
		
		return myMap.get("avatar_url");
    }
    
    /**
     * Recebe a URL de uma imagem e o arquivo de destino.
     * Lê a imagem contida na URL e grava em partes no arquivo de destino
     * @param imageUrl: url da imagem retirada do JSON 
     * @param destinationFile: arquivo destino para a imagem no disco
     * @throws IOException
     */
    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
    	
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}
}
