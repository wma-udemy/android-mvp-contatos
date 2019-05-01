package br.com.mvp.contatos.ui.main;

import android.content.Context;

import br.com.mvp.contatos.model.room.entity.UserEntity;
import br.com.mvp.contatos.model.room.repository.impl.UserImplRepository;

public class MainPresenter implements MainContract.Presenter{
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void signIn(Context ctx, String user, String password) {
        UserImplRepository userImplRepository = new UserImplRepository(ctx);

        UserEntity userEntity = userImplRepository.signIn(user, password);

        if(userEntity != null)
            view.signIn();
        else
            view.showMessage("Usuário ou Senha incorretos.");
    }
}
