package br.com.mvp.contatos.ui.main;

import android.content.Context;
import android.content.Intent;

public interface MainContract {
    interface View {
        void showMessage(String message);
        void signIn();
        void callActivity(Intent intent);
    }

    interface Presenter {
        void signIn(Context ctx, String user, String password);
        void callActivity(Intent intent);
    }
}
