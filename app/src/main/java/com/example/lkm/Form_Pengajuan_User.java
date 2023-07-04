package com.example.lkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form_Pengajuan_User extends AppCompatActivity {

    EditText InputNama, InputTelepon, InputLokasi, InputTanggal, InputLaporan;

    Button BtnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pengajuan_user);

        InputNama= findViewById(R.id.inputNama);
        InputTelepon= findViewById(R.id.inputTelepon);
        InputLokasi= findViewById(R.id.inputLokasi);
        InputLaporan= findViewById(R.id.inputLaporan);
        BtnSend= findViewById(R.id.BtnSend);

        BtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama= InputNama.getText().toString().trim();
                String telepon= InputTelepon.getText().toString().trim();

                if (nama.isEmpty()){
                    InputNama.setError("Username wajib diisi");
                    return;
                }
                if (telepon.isEmpty()){
                    InputTelepon.setError("Password wajib diisi");
                    return;
                }

                Intent open = new Intent(Form_Pengajuan_User.this, Daftar_Riwayat_User.class);
                startActivity(open);
            }
        });

    }
}