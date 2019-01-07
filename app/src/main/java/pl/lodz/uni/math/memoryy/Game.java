package pl.lodz.uni.math.memoryy;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

import static pl.lodz.uni.math.memoryy.MainActivity.StringToBitMap;
import static pl.lodz.uni.math.memoryy.MainActivity.group1_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group1_2;
import static pl.lodz.uni.math.memoryy.MainActivity.group2_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group2_2;
import static pl.lodz.uni.math.memoryy.MainActivity.group3_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group3_2;
import static pl.lodz.uni.math.memoryy.MainActivity.group4_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group4_2;
import static pl.lodz.uni.math.memoryy.MainActivity.group5_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group5_2;
import static pl.lodz.uni.math.memoryy.MainActivity.group6_1;
import static pl.lodz.uni.math.memoryy.MainActivity.group6_2;
import static pl.lodz.uni.math.memoryy.MainActivity.zakrywacz;

public class Game extends AppCompatActivity {

    ImageView foto1,foto2,foto3,foto4,foto5,foto6,foto7,foto8,foto9,foto10,foto11,foto12;
    String[] photos = {group1_1,group1_2,group2_1,group2_2,group3_1,group3_2,group4_1,group4_2,group5_1,group5_2,group6_1,group6_2};
    Boolean[] check = new Boolean[12];
    int[] groups = new int[12];
    int good=0;
    TextView good_text;
    int first_numer=50,second_number=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

       for (int i = 0; i < 12; i++) {check[i] = false;}

        this.foto1 = this.findViewById(R.id.imageView_foto1);
        this.foto2 = this.findViewById(R.id.imageView_foto2);
        this.foto3 = this.findViewById(R.id.imageView_foto3);
        this.foto4 = this.findViewById(R.id.imageView_foto4);
        this.foto5 = this.findViewById(R.id.imageView_foto5);
        this.foto6 = this.findViewById(R.id.imageView_foto6);
        this.foto7 = this.findViewById(R.id.imageView_foto7);
        this.foto8 = this.findViewById(R.id.imageView_foto8);
        this.foto9 = this.findViewById(R.id.imageView_foto9);
        this.foto10 = this.findViewById(R.id.imageView_foto10);
        this.foto11 = this.findViewById(R.id.imageView_foto11);
        this.foto12 = this.findViewById(R.id.imageView_foto12);
        this.good_text = this.findViewById(R.id.textView2);

        Random r = new Random();
        int i = r.nextInt(12) + 0;
        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto1.setImageBitmap(StringToBitMap(zakrywacz));
                groups[0]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto2.setImageBitmap(StringToBitMap(zakrywacz));
                groups[1]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto3.setImageBitmap(StringToBitMap(zakrywacz));
                groups[2]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto4.setImageBitmap(StringToBitMap(zakrywacz));
                groups[3]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto5.setImageBitmap(StringToBitMap(zakrywacz));
                groups[4]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto6.setImageBitmap(StringToBitMap(zakrywacz));
                groups[5]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto7.setImageBitmap(StringToBitMap(zakrywacz));
                groups[6]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto8.setImageBitmap(StringToBitMap(zakrywacz));
                groups[7]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto9.setImageBitmap(StringToBitMap(zakrywacz));
                groups[8]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto10.setImageBitmap(StringToBitMap(zakrywacz));
                groups[9]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto11.setImageBitmap(StringToBitMap(zakrywacz));
                groups[10]=i;
                check[i] = true;
                break;
            }
        }

        while (true) {
            i = r.nextInt(12) + 0;

            if (check[i] == false) {
                foto12.setImageBitmap(StringToBitMap(zakrywacz));
                groups[11]=i;
                check[i] = true;
                break;
            }
        }
    }

    public void click1(View v){

            if(first_numer==50)
            {
                foto1.setImageBitmap(StringToBitMap(photos[groups[0]]));
                first_numer=groups[0];
            }
            else
            {
                foto1.setImageBitmap(StringToBitMap(photos[groups[0]]));
                second_number=groups[0];

                if(try_numbers()){}
                else
                {
                    SystemClock.sleep(1000);
                    hide();
                    foto1.setImageBitmap(StringToBitMap(zakrywacz));
                }
            }
    }

    public void click2(View v){

        if(first_numer==50)
        {
            foto2.setImageBitmap(StringToBitMap(photos[groups[1]]));
            first_numer=groups[1];
        }
        else
        {
            foto2.setImageBitmap(StringToBitMap(photos[groups[1]]));
            second_number=groups[1];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto2.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click3(View v){

        if(first_numer==50)
        {
            foto3.setImageBitmap(StringToBitMap(photos[groups[2]]));
            first_numer=groups[2];
        }
        else
        {
            foto3.setImageBitmap(StringToBitMap(photos[groups[2]]));
            second_number=groups[2];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto3.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click4(View v){

        if(first_numer==50)
        {
            foto4.setImageBitmap(StringToBitMap(photos[groups[3]]));
            first_numer=groups[3];
        }
        else
        {
            foto4.setImageBitmap(StringToBitMap(photos[groups[3]]));
            second_number=groups[3];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto4.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click5(View v){

        if(first_numer==50)
        {
            foto5.setImageBitmap(StringToBitMap(photos[groups[4]]));
            first_numer=groups[4];
        }
        else
        {
            foto5.setImageBitmap(StringToBitMap(photos[groups[4]]));
            second_number=groups[4];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                 foto5.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click6(View v){

        if(first_numer==50)
        {
            foto6.setImageBitmap(StringToBitMap(photos[groups[5]]));
            first_numer=groups[5];
        }
        else
        {
            foto6.setImageBitmap(StringToBitMap(photos[groups[5]]));
            second_number=groups[5];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto6.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click7(View v){


        if(first_numer==50)
        {
            foto7.setImageBitmap(StringToBitMap(photos[groups[6]]));
            first_numer=groups[6];
        }
        else
        {
            foto7.setImageBitmap(StringToBitMap(photos[groups[6]]));
            second_number=groups[6];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto7.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click8(View v){

        if(first_numer==50)
        {
            foto8.setImageBitmap(StringToBitMap(photos[groups[7]]));
            first_numer=groups[7];
        }
        else
        {
            foto8.setImageBitmap(StringToBitMap(photos[groups[7]]));
            second_number=groups[7];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto8.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click9(View v){

        if(first_numer==50)
        {
            foto9.setImageBitmap(StringToBitMap(photos[groups[8]]));
            first_numer=groups[8];
        }
        else
        {
            foto9.setImageBitmap(StringToBitMap(photos[groups[8]]));
            second_number=groups[8];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto9.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click10(View v){

        if(first_numer==50)
        {
            foto10.setImageBitmap(StringToBitMap(photos[groups[9]]));
            first_numer=groups[9];
        }
        else
        {
            foto10.setImageBitmap(StringToBitMap(photos[groups[9]]));
            second_number=groups[9];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto10.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click11(View v){

        if(first_numer==50)
        {
            foto11.setImageBitmap(StringToBitMap(photos[groups[10]]));
            first_numer=groups[10];
        }
        else
        {
            second_number=groups[10];
            foto11.setImageBitmap(StringToBitMap(photos[groups[10]]));

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto11.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }
    public void click12(View v){

        if(first_numer==50)
        {
            foto12.setImageBitmap(StringToBitMap(photos[groups[11]]));
            first_numer=groups[11];
        }
        else
        {
            foto12.setImageBitmap(StringToBitMap(photos[groups[11]]));
            second_number=groups[11];

            if(try_numbers()){}
            else
            {
                SystemClock.sleep(1000);
                hide();
                foto12.setImageBitmap(StringToBitMap(zakrywacz));
            }
        }
    }

    public void hide(){
        if(first_numer==groups[0]) {foto1.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[1]) {foto2.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[2]) {foto3.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[3]) {foto4.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[4]) {foto5.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[5]) {foto6.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[6]) {foto7.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[7]) {foto8.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[8]) {foto9.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[9]) {foto10.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[10]) {foto11.setImageBitmap(StringToBitMap(zakrywacz));}
        else if(first_numer==groups[11]) {foto12.setImageBitmap(StringToBitMap(zakrywacz));}
        first_numer=50;
    }

    public Boolean try_numbers(){

        if(first_numer%2==0){
            if(second_number==first_numer+1){
                second_number=50;
                first_numer=50;
                good++;
                good_text.setText(Integer.toString(good));
                return true;
            }
            else
            {
                second_number=50;
                return false;
            }
        }
        else
        {
            if(second_number==first_numer-1){
                second_number=50;
                first_numer=50;
                good++;
                good_text.setText(Integer.toString(good));
                return true;
            }
            else
            {
                second_number=50;
                return false;
            }
        }
    }
}
