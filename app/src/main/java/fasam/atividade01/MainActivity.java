package fasam.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtMarca;
    EditText txtModelo;
    EditText txtCor;
    EditText txtTamnanho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        //ENTRADA

        txtMarca = findViewById(R.id.txtMarca);
        txtModelo = findViewById(R.id.txtModelo);
        txtCor = findViewById(R.id.txtCor);
        txtTamnanho = findViewById(R.id.txtTamanho);

        //PROCESSAMENTO
        String marca, modelo, cor, tamanho;
        marca = txtMarca.getText().toString();
        modelo = txtModelo.getText().toString();
        cor = txtCor.getText().toString();
        tamanho = txtTamnanho.getText().toString();

        //SAÍDA
        //%s - string
        // %d - inteiro
        // %f - float
        String dados = String.format("Os dados digitados foram: Marca: %s\n Modelo: %s\n Cor: %s\n Tamanho: %s",
                marca,modelo,cor, tamanho);
        Toast.makeText(this, dados, Toast.LENGTH_LONG).show();

    }
}