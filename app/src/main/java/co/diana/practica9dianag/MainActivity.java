package co.diana.practica9dianag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMenu;
    private ImageView imageViewJugo;
    private ImageView imageViewPerro;
    private ImageView imageViewBonYurt;
    private ImageView imageViewSandwich;
    private Button buttonAgregarJugo;
    private Button buttonAgregarBon;
    private Button buttonAgregarPerro;
    private Button buttonAgregarSand;
    private UDPConnection udpConnection;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMenu = findViewById(R.id.textViewMenu);
        imageViewJugo = findViewById(R.id.imageViewJugo);
        imageViewPerro = findViewById(R.id.imageViewPerro);
        imageViewBonYurt = findViewById(R.id. imageViewBonYurt);
        imageViewSandwich = findViewById(R.id.imageViewSandwich);
        buttonAgregarJugo = findViewById(R.id.buttonAgregarJugo);
        buttonAgregarBon = findViewById(R.id.buttonAgregarBon);
        buttonAgregarPerro = findViewById(R.id.buttonAgregarPerro);
        buttonAgregarSand = findViewById(R.id.buttonAgregarSand);
        udpConnection=new UDPConnection();
        udpConnection.start();
        udpConnection.PeerB(this);



        buttonAgregarJugo.setOnClickListener(
                (v)->{


                }
        );

        buttonAgregarBon.setOnClickListener(
                (v)->{

                }
        );

        buttonAgregarPerro.setOnClickListener(
                (v)->{

                }
        );

        buttonAgregarSand.setOnClickListener(
                (v)->{

                }
        );

    }


}