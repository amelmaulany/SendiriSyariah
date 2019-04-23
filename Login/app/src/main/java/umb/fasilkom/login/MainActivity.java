package umb.fasilkom.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText)findViewById(R.id.txt_username);
        txtPassword = (EditText)findViewById(R.id.txt_password);
        btnLogin = (Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if(username.equals("aaa") && password.equals("aaa")){
                    Toast.makeText(MainActivity.this, "Login Sukses!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Gagal!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
