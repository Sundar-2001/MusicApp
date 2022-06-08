package com.example.mrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    Button predict;
    TextView result;
    EditText score;
    String url = "https://musicapp-sundar.herokuapp.com/predict";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        score = findViewById(R.id.editTextTextPersonName);
        predict = findViewById(R.id.button2);
        result = findViewById(R.id.textView2);
        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // hit the API -> Volley
                StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener() {
                            @Override
                            public void onResponse(Object response) {
                                try {
                                    JSONObject jsonObject = new JSONObject((String) response);

                                    //System.out.println(data);
                                    Intent intent=new Intent(getApplicationContext(), MainActivity3.class);
                                    Bundle bundle = new Bundle();

                                    String data = jsonObject.getString("Result");
                                    bundle.putString("t",data);
                                    System.out.print(data);
                                    intent.putExtras(bundle);

                                    startActivity(intent);

                                    result.setText(data);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(MainActivity2.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }){
                    @Override
                    protected Map getParams(){
                        Map params = new HashMap();
                        params.put("Tex",score.getText().toString());
                        return params;
                    }
                };
                RequestQueue queue = Volley.newRequestQueue(MainActivity2.this);
                queue.add(stringRequest);
            }
        });
    }
}