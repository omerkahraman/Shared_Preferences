package net.omerkahraman.shared_preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    EditText editText, editText2, editText3;
    Button button,button2;

    private String ISIM_KEY="net.omerkahraman.shared_preferences.ISIM";
    private String SOYAD_KEY="net.omerkahraman.shared_preferences.SOYAD";
    private String YAS_KEY="net.omerkahraman.shared_preferences.YAS";
    private String MAIN_KEY="net.omerkahraman.shared_preferences.MAIN_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);

        sharedPreferences=getSharedPreferences(MAIN_KEY, MODE_PRIVATE);
        editor=sharedPreferences.edit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(ISIM_KEY, editText.getText().toString());
                editor.putString(SOYAD_KEY, editText2.getText().toString());
                editor.putInt(YAS_KEY, Integer.parseInt(editText3.getText().toString()));
                editor.commit();

                Toast.makeText(MainActivity.this, "Veriler kaydedildi.", Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }

        });




    }
}
