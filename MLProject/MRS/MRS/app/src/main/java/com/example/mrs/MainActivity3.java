package com.example.mrs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends Activity {
    TextView t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.print("hi");
        setContentView(R.layout.activity_main3);

        t=(TextView) findViewById(R.id.textView3);
        t1=(TextView) findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        String stuff = bundle.getString("t");
        t.setText(stuff);
        System.out.println(stuff);
        boolean i=stuff.contains("neutral");
        boolean j=stuff.contains("happy") || stuff.contains("joy");
        boolean k=stuff.contains("sadness");
        boolean l=stuff.contains("fear");
        boolean m=stuff.contains("anger");
        boolean n=stuff.contains("surprise");
        boolean o=stuff.contains("shame");
        boolean p=stuff.contains("disgust");
        if(i) {
            String s = "\n1.Memories-Maroon5 \n2.SugarCrash-ElyOtto \n3.Mood-24kGoldn,ianndior 4.Replay-Iyaz\n5.PastLives-11:11MusicGroup,Martin";
            t1.setText(s);
        }
        else if(j) {
            String s = "1. Cheap Thrills-Sia\n" +
                    "2. Symphony - Zara Larsson\n" +
                    "3. Blinding Lights - Weekend\n" +
                    "4. On the floor - Jennifer Lopez\n" +
                    "5. Runaway - Aurora";
            t1.setText(s);
        }
        else if(k) {
            String s = "1. Shalom margaret,Fasetya-Oceans\n" +
                    "2. Miley Cyrus - Wrecking Ball\n" +
                    "3. Dean Lewis,Half A Man\n" +
                    "4. Sasha Alex Sloan - Dancing With Your Ghost\n" +
                    "5. One More Light ~ Rachael Schroeder";
            t1.setText(s);
        }
        else if(l) {
            String s = "1. I Will Fear No More - The Afters \n" +
                    "2. Not Afraid - Eminem\n" +
                    "3. Brave - Fearless soul\n" +
                    "4. The Fear - The score\n" +
                    "5. Demons - Imagine Dragons";
            t1.setText(s);
        }
        else if(m) {
            String s = "1. Melanie Martinez - Mad Hatter\n" +
                    "2. Taylor Swift - Bad Blood\n" +
                    "3. Toxic -BoywithUke\n" +
                    "4. Lily's Theme - Alexandre desplat\n" +
                    "5. Heathens - Eighty one prayers";
            t1.setText(s);
        }
        else if(n) {
            String s = "1. E.T - Katy Perry\n" +
                    "2. Nevada - Vicetone,Cozi\n" +
                    "3. Perfect 10 unknown brain,Heather Sommer\n" +
                    "4. Seasons - Rival,Harley Bird\n" +
                    "5. Midnight City, M83";
            t1.setText(s);
        }
        else if(o) {
            String s = "1. Afterglow - Ed Sheeran\n" +
                    "2. Scars to your beautiful - Alessia Cara\n" +
                    "3. Katy Perry - Firework \n" +
                    "4. Superhero - Unknown Brain,Chris Linton\n" +
                    "5. Try Everything - Shakira";
            t1.setText(s);
        }
        else  if(p) {
            String s = "1. Afterglow - Ed Sheeran\n" +
                    "2. Scars to your beautiful - Alessia Cara\n" +
                    "3. Katy Perry - Firework \n" +
                    "4. Superhero - Unknown Brain,Chris Linton\n" +
                    "5. Try Everything - Shakira";
            t1.setText(s);
        }
        System.out.print(stuff);
    }
}
