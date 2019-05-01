package br.com.mvp.contatos.ui.main;

import android.content.Context;

import br.com.mvp.contatos.model.room.entity.UserEntity;

public interface MainContract {
    interface View {
        void showMessage(String message);
        void signIn();
    }

    interface Presenter {
        void signIn(Context ctx, String user, String password);
    }
}
