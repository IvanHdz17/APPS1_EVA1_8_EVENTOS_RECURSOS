package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    TextView txtVwNom, txtVwAp;
    EditText edtTxtNom, edtTxtAp;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEs, rdBtnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwAp = findViewById(R.id.txtVwAp);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtAp = findViewById(R.id.edtTxtAp);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnIn = findViewById(R.id.rdBtnIn);
        rdGrpIdioma.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if(checkedId == R.id.rdBtnEs) {
            txtVwNom.setText(R.string.txt_vw_nom);
            edtTxtNom.setHint(R.string.edt_txt_nom);
            txtVwAp.setText(R.string.txt_vw_ap);
            edtTxtAp.setHint(R.string.edt_txt_ap);
            rdBtnEs.setText(R.string.rd_btn_es);
            rdBtnIn.setText(R.string.rd_btn_in);
        }else{
            txtVwNom.setText(R.string.txt_vw_nom_en);
            edtTxtNom.setHint(R.string.edt_txt_nom_en);
            txtVwAp.setText(R.string.txt_vw_ap_en);
            edtTxtAp.setHint(R.string.edt_txt_ap_en);
            rdBtnEs.setText(R.string.rd_btn_es_en);
            rdBtnIn.setText(R.string.rd_btn_in_en);
        }
    }
}