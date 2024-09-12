package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dn_bigodera.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class ConferenciaDoblo extends AppCompatActivity {

    private TextView mensagem_doblo;

    private EditText atual;
    private Button verificar_doblo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conferencia_doblo);

        Objects.requireNonNull(getSupportActionBar()).hide();//tirar o nome do app da barra superior

        atual = (EditText) findViewById(R.id.atual);
        mensagem_doblo = (TextView) findViewById(R.id.mensagem_doblo);
        verificar_doblo = (Button) findViewById(R.id.verificar_doblo);


        verificar_doblo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int oleo = 0;//Atualizar a cada troca de óleo da viatura
                int km = Integer.parseInt(atual.getText().toString());


                if (km >= oleo + 10000) {
                    mensagem_doblo.setText("Trocar Óleo!");
                    mensagem_doblo.setBackgroundColor(Color.RED);
                    mensagem_doblo.setTextColor(Color.BLACK);

                }else if (km >= oleo + 8000) {
                    mensagem_doblo.setText("Trocar Óleo em Breve !");
                    mensagem_doblo.setBackgroundColor(Color.YELLOW);
                    mensagem_doblo.setTextColor(Color.BLACK);

                } else {
                    mensagem_doblo.setText("Óleo OK!");
                    mensagem_doblo.setBackgroundColor(Color.GREEN);
                    mensagem_doblo.setTextColor(Color.BLACK);
                }
            }



        });
//checkbox motor
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox mtbm = findViewById(R.id.motorBom);
        CheckBox mtrg = findViewById(R.id.motorRegular);
        CheckBox mtrm = findViewById(R.id.motorRuim);

        TextView nivel_oleo = findViewById(R.id.mt);

        mtbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    mtrg.setChecked(false);
                    mtrm.setChecked(false);

                    nivel_oleo.setTextColor(Color.GREEN);

                }
            }
        });

        mtrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    mtbm.setChecked(false);
                    mtrm.setChecked(false);

                    nivel_oleo.setTextColor(Color.YELLOW);
                }

            }
        });

        mtrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    mtbm.setChecked(false);
                    mtrg.setChecked(false);

                    nivel_oleo.setTextColor(Color.RED);
                }

            }
        });


//checkbox freio
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox frbm = findViewById(R.id.frBom);
        CheckBox frrg = findViewById(R.id.frRegular);
        CheckBox frrm = findViewById(R.id.frRuim);

        TextView nivel_freio = findViewById(R.id.fr);

        frbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    frrg.setChecked(false);
                    frrm.setChecked(false);

                    nivel_freio.setTextColor(Color.GREEN);

                }
            }
        });

        frrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    frbm.setChecked(false);
                    frrm.setChecked(false);

                    nivel_freio.setTextColor(Color.YELLOW);
                }

            }
        });

        frrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    frbm.setChecked(false);
                    frrg.setChecked(false);

                    nivel_freio.setTextColor(Color.RED);
                }

            }
        });
//checkbox direção
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox drbm = findViewById(R.id.dirBom);
        CheckBox drrg = findViewById(R.id.dirRegular);
        CheckBox drrm = findViewById(R.id.dirRuim);

        TextView nivel_direcao = findViewById(R.id.dir);

        drbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    drrg.setChecked(false);
                    drrm.setChecked(false);

                    nivel_direcao.setTextColor(Color.GREEN);

                }
            }
        });

        drrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    drbm.setChecked(false);
                    drrm.setChecked(false);

                    nivel_direcao.setTextColor(Color.YELLOW);
                }

            }
        });

        drrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    drbm.setChecked(false);
                    drrg.setChecked(false);

                    nivel_direcao.setTextColor(Color.RED);
                }

            }
        });
//checkbox radiador
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox rdbm = findViewById(R.id.rdBom);
        CheckBox rdrg = findViewById(R.id.rdRegular);
        CheckBox rdrm = findViewById(R.id.rdRuim);

        TextView nivel_radiador = findViewById(R.id.rd);

        rdbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    rdrg.setChecked(false);
                    rdrm.setChecked(false);

                    nivel_radiador.setTextColor(Color.GREEN);

                }
            }
        });

        rdrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    rdbm.setChecked(false);
                    rdrm.setChecked(false);

                    nivel_radiador.setTextColor(Color.YELLOW);
                }

            }
        });

        rdrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    rdbm.setChecked(false);
                    rdrg.setChecked(false);

                    nivel_radiador.setTextColor(Color.RED);
                }

            }
        });

        //checkbox parabrisa
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox pbbm = findViewById(R.id.pbBom);
        CheckBox pbrg = findViewById(R.id.pbRegular);
        CheckBox pbrm = findViewById(R.id.pbRuim);

        TextView nivel_pb = findViewById(R.id.pb);

        pbbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    pbrg.setChecked(false);
                    pbrm.setChecked(false);

                    nivel_pb.setTextColor(Color.GREEN);

                }
            }
        });

        pbrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    pbbm.setChecked(false);
                    pbrm.setChecked(false);

                    nivel_pb.setTextColor(Color.YELLOW);
                }

            }
        });

        pbrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    pbbm.setChecked(false);
                    pbrg.setChecked(false);

                    nivel_pb.setTextColor(Color.RED);
                }

            }
        });

        //checkbox pneus
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox pnbm = findViewById(R.id.pnBom);
        CheckBox pnrg = findViewById(R.id.pnRegular);
        CheckBox pnrm = findViewById(R.id.pnRuim);

        TextView cal_pn = findViewById(R.id.pn);

        pnbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    pnrg.setChecked(false);
                    pnrm.setChecked(false);

                    cal_pn.setTextColor(Color.GREEN);

                }
            }
        });

        pnrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    pnbm.setChecked(false);
                    pnrm.setChecked(false);

                    cal_pn.setTextColor(Color.YELLOW);
                }

            }
        });

        pnrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    pnbm.setChecked(false);
                    pnrg.setChecked(false);

                    cal_pn.setTextColor(Color.RED);
                }

            }
        });

//checkbox iluminação
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox ilbm = findViewById(R.id.ilBom);
        CheckBox ilrg = findViewById(R.id.ilRegular);
        CheckBox ilrm = findViewById(R.id.ilRuim);

        TextView iluminacao = findViewById(R.id.il);

        ilbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    ilrg.setChecked(false);
                    ilrm.setChecked(false);

                    iluminacao.setTextColor(Color.GREEN);

                }
            }
        });

        ilrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    ilbm.setChecked(false);
                    ilrm.setChecked(false);

                    iluminacao.setTextColor(Color.YELLOW);
                }

            }
        });

        ilrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    ilbm.setChecked(false);
                    ilrg.setChecked(false);

                    iluminacao.setTextColor(Color.RED);
                }

            }
        });

//checkbox combustivel
        // Obter os Checkbox e TextViews de uma linha específica
        CheckBox cbbm = findViewById(R.id.cbBom);
        CheckBox cbrg = findViewById(R.id.cbRegular);
        CheckBox cbrm = findViewById(R.id.cbRuim);

        TextView nivel_cb = findViewById(R.id.cb);


        cbbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox1 e alterar o TextView1 para verde
                    cbrg.setChecked(false);
                    cbrm.setChecked(false);

                    nivel_cb.setTextColor(Color.GREEN);

                }
            }
        });

        cbrg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    cbbm.setChecked(false);
                    cbrm.setChecked(false);

                    nivel_cb.setTextColor(Color.YELLOW);
                }

            }
        });

        cbrm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Marcar somente o Checkbox2 e alterar o TextView2 para verde
                    cbbm.setChecked(false);
                    cbrg.setChecked(false);

                    nivel_cb.setTextColor(Color.RED);
                }


            }
        });
//printar a tela e salvar em Downloads
        Button button = findViewById(R.id.relatorio);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                // Captura a tela como imagem
                View screenView = getWindow().getDecorView().getRootView();
                screenView.setDrawingCacheEnabled(true);
                Bitmap bitmap = Bitmap.createBitmap(screenView.getDrawingCache());
                screenView.setDrawingCacheEnabled(false);

                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                rootView.setDrawingCacheEnabled(true);
                Bitmap screenshot = Bitmap.createBitmap(rootView.getDrawingCache());
                rootView.setDrawingCacheEnabled(false);

                String filename = "Relatório_VW.png";
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString();
                File file = new File(path, filename);

                try {
                    FileOutputStream out = new FileOutputStream(file);
                    screenshot.compress(Bitmap.CompressFormat.PNG, 100, out);
                    out.flush();
                    out.close();
                    Toast.makeText(getApplicationContext(), "Salvo na sua Galeria, Enviar ao responsável pela Vtr", Toast.LENGTH_LONG).show();


                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Erro, Print a tela Manualmente", Toast.LENGTH_LONG).show();
                }

            }


        });
    }
}