package br.com.mvp.contatos.addUser;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.com.mvp.contatos.R;

public class AddUserActivity extends AppCompatActivity {

    private EditText etUser, etEmail, etPassword;
    private TextView tvback;
    private Button btSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        initComponents();
    }

    private void initComponents() {
        etUser = findViewById(R.id.etUser);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        tvback = findViewById(R.id.tvback);
        btSignUp = findViewById(R.id.btSignUp);
    }
}
