package net.omerkahraman.shared_preferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import junit.framework.TestCase;

public class Main2Activity extends AppCompatActivity {

    String isimVerisi, soyadVerisi;
    int yasVerisi;
    private String ISIM_KEY="net.omerkahraman.shared_preferences.ISIM";
    private String SOYAD_KEY="net.omerkahraman.shared_preferences.SOYAD";
    private String YAS_KEY="net.omerkahraman.shared_preferences.YAS";
    private String MAIN_KEY="net.omerkahraman.shared_preferences.MAIN_DATA";

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=(TextView)findViewById(R.id.textView);


        isimVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getString(ISIM_KEY, "isim bulunamadı.");
        soyadVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getString(SOYAD_KEY, "soyad bulunamadı.");
     //   yasVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getString(YAS_KEY, -1);  -1 döndürmüyo
     // değişiklik




        tv.setText("Adınız: "+ isimVerisi + "\n" + "Soyadınız: " + soyadVerisi + "\n" + "Yaşınız: " + yasVerisi);



    }
}
