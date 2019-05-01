package br.com.mvp.contatos.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import br.com.mvp.contatos.R;
import br.com.mvp.contatos.model.room.entity.UserEntity;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter presenter;
    private EditText etUser, etPassword;
    private TextView tvCreateAccount;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUser.getText().toString();
                String password = etPassword.getText().toString();

                presenter.signIn(getApplicationContext(), user, password);
            }
        });
    }

    private void initComponents() {
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        tvCreateAccount = findViewById(R.id.tvCreateAccount);
        btLogin = findViewById(R.id.btLogin);

        presenter = new MainPresenter(this);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signIn() {
        Toast.makeText(getApplicationContext(), "LOGIN EFETUADO", Toast.LENGTH_SHORT).show();
    }
}
