

package no.ul.hent;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;



public class hentNett extends AsyncTask<Void, Void,Void> {
    String data = "";

    @Override
    protected Void doInBackground(Void... voids) {



        try {
            URL url = new URL("https://www.nlm.no/api/nlm/v1/list/67560/article/0/15/priority/1");


            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while (line != null){
                line = bufferedReader.readLine();
                data += line;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.data);




    }




    //public String hentData() {
    //    return ("flottings");

        //return(GET /content/objects/59/versions/2/relations&limit=5 HTTP/1.1)

    //}





}
