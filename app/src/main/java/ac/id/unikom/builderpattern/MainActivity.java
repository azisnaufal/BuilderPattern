package ac.id.unikom.builderpattern;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = findViewById(R.id.hello_world);

        new AlertDialog.Builder(this)
                .setTitle("Apa pendapatmu?")
                .setMessage("Kerak telor lebih enak dari pada ayam geprek.")
                .setNegativeButton("Tidak Setuju", (dialogInterface, i) -> {
                    helloWorld.setText("Kamu memilih tidak setuju");
                })
                .setPositiveButton("Setuju", ((dialogInterface, i) -> {
                    helloWorld.setText("Kamu memilih setuju");
                }))
                .show();
    }
}