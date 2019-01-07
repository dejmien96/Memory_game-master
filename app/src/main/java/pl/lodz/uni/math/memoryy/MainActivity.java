package pl.lodz.uni.math.memoryy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button g1,g2,g3,g4,g5,g6,game,hider;
    TextView v1,v2,v3,v4,v5,v6;
    int v1_int=0, v2_int=0, v3_int=0, v4_int=0, v5_int=0, v6_int=0;
    ImageView foto_present;
    TextView textView;
    String category="NULL";
    Integer true_counter=0;
    String[] g1_tab = new String[20];
    String[] g2_tab = new String[20];
    String[] g3_tab = new String[20];
    String[] g4_tab = new String[20];
    String[] g5_tab = new String[20];
    String[] g6_tab = new String[20];

    static String group1_1,group1_2,group2_1,group2_2,group3_1,group3_2,group4_1,group4_2,group5_1,group5_2,group6_1,group6_2,zakrywacz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.foto_present=this.findViewById(R.id.imageView_foto);
        this.textView=this.findViewById(R.id.textView);

        g1= this.findViewById(R.id.button_group1);
        g2= this.findViewById(R.id.button_group2);
        g3= this.findViewById(R.id.button_group3);
        g4= this.findViewById(R.id.button_group4);
        g5= this.findViewById(R.id.button_group5);
        g6= this.findViewById(R.id.button_group6);
        game= this.findViewById(R.id.game);
        hider= this.findViewById(R.id.button_hide);

        v1= this.findViewById(R.id.textView_counter_1);
        v2= this.findViewById(R.id.textView_counter_2);
        v3= this.findViewById(R.id.textView_counter_3);
        v4= this.findViewById(R.id.textView_counter_4);
        v5= this.findViewById(R.id.textView_counter_5);
        v6= this.findViewById(R.id.textView_counter_6);

        View.OnClickListener g1_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("NATURA");
                category="NATURA";
            }
        };
        g1.setOnClickListener(g1_l);

        View.OnClickListener g2_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("AUTA");
                category="AUTA";
            }
        };
        g2.setOnClickListener(g2_l);

        View.OnClickListener g3_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("JEDZENIE");
                category="JEDZENIE";
            }
        };
        g3.setOnClickListener(g3_l);

        View.OnClickListener g4_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("LUDZIE");
                category="LUDZIE";
            }
        };
        g4.setOnClickListener(g4_l);

        View.OnClickListener g5_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("ZWIERZETA");
                category="ZWIERZE";
            }
        };
        g5.setOnClickListener(g5_l);

        View.OnClickListener g6_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                textView.setText("ZNAKI");
                category="ZNAKI";
            }
        };
        g6.setOnClickListener(g6_l);

        View.OnClickListener g7_l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fotki=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(fotki,1);
                category="HIDER";
            }
        };
        hider.setOnClickListener(g7_l);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == Activity.RESULT_OK){

            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            foto_present.setImageBitmap(bitmap);
            String image_string = BitMapToString(bitmap);

            if(category=="NATURA")
            {
                g1_tab[v1_int]=image_string;
                v1_int++;
                v1.setText(Integer.toString(v1_int));
            }
            else if(category=="AUTA")
            {
                g2_tab[v2_int]=image_string;
                v2_int++;
                v2.setText(Integer.toString(v2_int));
            }
            else if(category=="JEDZENIE")
            {
                g3_tab[v3_int]=image_string;
                v3_int++;
                v3.setText(Integer.toString(v3_int));
            }
            else if(category=="LUDZIE")
            {
                g4_tab[v4_int]=image_string;
                v4_int++;
                v4.setText(Integer.toString(v4_int));
            }
            else if(category=="ZWIERZE")
            {
                g5_tab[v5_int]=image_string;
                v5_int++;
                v5.setText(Integer.toString(v5_int));
            }
            else if(category=="ZNAKI")
            {
                g6_tab[v6_int]=image_string;
                v6_int++;
                v6.setText(Integer.toString(v6_int));
            }
            else if(category=="HIDER")
            {
                zakrywacz=image_string;
            }
            else
            {
                Toast.makeText(this, "SOME ERROR", Toast.LENGTH_LONG).show();
            }

        }
    }

    public String BitMapToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);
        return temp;
    }

    static public Bitmap StringToBitMap(String encodedString) {
        try {
            byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0,
                    encodeByte.length);
            return bitmap;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public void lets_play(View v)
    {
        if(v1_int>1){true_counter++;}
        if(v2_int>1){true_counter++;}
        if(v3_int>1){true_counter++;}
        if(v4_int>1){true_counter++;}
        if(v5_int>1){true_counter++;}
        if(v6_int>1){true_counter++;}
        if(true_counter==6)
        {
            if(v1_int==2){group1_1=g1_tab[0];group1_2=g1_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v1_int ) + 0;
                group1_1=g1_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v1_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group1_2=g1_tab[i];
                        break;
                    }
                }
            }

            if(v2_int==2){group2_1=g2_tab[0];group2_2=g2_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v2_int ) + 0;
                group2_1=g2_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v2_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group2_2=g2_tab[i];
                        break;
                    }
                }
            }

            if(v3_int==2){group3_1=g3_tab[0];group3_2=g3_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v3_int ) + 0;
                group3_1=g3_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v3_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group3_2=g3_tab[i];
                        break;
                    }
                }
            }

            if(v4_int==2){group4_1=g4_tab[0];group4_2=g4_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v4_int ) + 0;
                group4_1=g4_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v4_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group4_2=g4_tab[i];
                        break;
                    }
                }
            }

            if(v5_int==2){group5_1=g5_tab[0];group5_2=g5_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v5_int ) + 0;
                group5_1=g5_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v5_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group5_2=g5_tab[i];
                        break;
                    }
                }
            }

            if(v6_int==2){group6_1=g6_tab[0];group6_2=g6_tab[1];}
            else
            {
                int was;
                Random r = new Random();
                int i = r.nextInt(v6_int ) + 0;
                group6_1=g6_tab[i];
                was=i;
                while(true)
                {
                    i = r.nextInt(v6_int ) + 0;
                    if(i==was){}
                    else
                    {
                        group6_2=g6_tab[i];
                        break;
                    }
                }
            }
            true_counter=0;
            Intent Intent = new Intent(this, Game.class);
            startActivity(Intent);
        }
        else {
            true_counter=0;
            Toast.makeText(this,"Za mało elementów", Toast.LENGTH_LONG).show();
        }
    }
}
