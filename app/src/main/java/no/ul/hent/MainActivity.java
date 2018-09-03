package no.ul.hent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView data;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        data = (TextView) findViewById(R.id.outputTextID);


        hentNett hentObj = new hentNett();

        hentObj.execute();


        //output.setText("heisann");


        //String string = hentObj.hentData();
        //output.setText(string);






        
    }




}
