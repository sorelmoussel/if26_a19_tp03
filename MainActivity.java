package fr.utt.if26.if26_a19_tp03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    /**
     *
     * C'est un test pour la JavaDoc .....
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx = (TextView) findViewById (R.id.textview);
        tx.setText("Message modifié dans le code Java");

        String message = "Bonjour IF26";
        tx.setText(message);

        message = this.getResources().getString(R.string.message);
        tx.setText(message);


        Button bt = (Button) findViewById(R.id.myButton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            } });




    }
}
