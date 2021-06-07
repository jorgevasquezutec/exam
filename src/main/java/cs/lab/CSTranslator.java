package cs.lab;
import java.util.logging.Logger;
import java.util.*;  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class CSTranslator {

    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());    
    
    
    String translate(String text) {
      try{
        if(text.length() > 500) {
            throw new MaxLengthException("Character Length exceeded");
        }
  
        String urlStr = "https://script.google.com/macros/s/AKfycby7yA-le32mzRHoXZRyUInD_kNgXehqDTVW6OEtCBDbqI2cpA/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + "en" +
                "&source=" + "es";
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
      }catch(Exception e){
        return e.getMessage();
      }
  }


  public String reedAndTranlate(Scanner scan){
    String result = translate(scan.nextLine());
    scan.close();
    return result;
  }


  public void main (){
    logger.info("Ingrese texto a traducir:");
    Scanner sc = new Scanner(System.in);
    String result=reedAndTranlate(sc);
    logger.info(result);
  }
    
}