package com.example.aparcar;

import android.app.admin.SystemUpdateInfo;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView txtEmail;
    TextView txtPassword;
    Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        txtEmail = findViewById(R.id.txtEmail);
//        txtPassword = findViewById(R.id.txtPassword);
//        btnRegister = findViewById(R.id.btnRegister);

        //btnRegister.setOnClickListener(MainActivity.this);

        ViewPager viewPager = findViewById( R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter( this );
        viewPager.setAdapter( adapter );

    }




    @Override
    public void onClick(View v) {
        //System.out.println( txtEmail.getText() );
        //System.out.println( txtPassword.getText());

//        MediaType MEDIA_TYPE = MediaType.parse("application/json");
//        User user = new User( txtEmail.getText().toString(),  txtPassword.getText().toString()   );


//okhttp
//        OkHttpClient client = new OkHttpClient();
//        RequestBody body = RequestBody.create( MEDIA_TYPE, user.toJson() );



        //String jsonData = null;

        //sincronico
/*        try {
            Response response = client.newCall(request).execute();
            jsonData =  response.body().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

System.out.println(jsonData);*/

//asincronico


//        Request request = new Request.Builder()
//                .url("http://www.aparcar.com.ar:8080/aparcar/v1/driver/register")
//                .post(body)
//                .header("Accept", "application/json")
//                .header("Content-Type", "application/json")
//                .build();
//
//
//        client.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                e.printStackTrace();
//            }
//
//            @Override
//            public void onResponse(Call call, final Response response) throws IOException {
//                if (!response.isSuccessful()) {
//                    throw new IOException("Unexpected code " + response);
//                } else {
//
//                    System.out.println( response );
//
//
//                }
//            }
//        });


    }



}
