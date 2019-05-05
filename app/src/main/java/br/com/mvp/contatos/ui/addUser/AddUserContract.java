package br.com.mvp.contatos.ui.addUser;

import android.content.Context;

public interface AddUserContract {
    interface View {
        void showMessage(String message);
        void backScreen();
        void addUserConfirmed();
    }

    interface Presenter {
        void back();
        void addUser(Context ctx, String user, String email, String password);
    }
}
