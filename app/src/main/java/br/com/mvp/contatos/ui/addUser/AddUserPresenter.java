package br.com.mvp.contatos.ui.addUser;

import android.content.Context;

import br.com.mvp.contatos.model.room.entity.UserEntity;
import br.com.mvp.contatos.model.room.repository.impl.UserImplRepository;
import br.com.mvp.contatos.ui.main.MainContract;

public class AddUserPresenter implements AddUserContract.Presenter{
    private AddUserContract.View view;

    public AddUserPresenter(AddUserContract.View view) {
        this.view = view;
    }
}
