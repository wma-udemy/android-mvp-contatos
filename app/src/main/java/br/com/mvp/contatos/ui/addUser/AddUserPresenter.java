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

    @Override
    public void back() {
        view.backScreen();
    }

    @Override
    public void addUser(Context ctx, String user, String email, String password) {
        UserImplRepository userImplRepository = new UserImplRepository(ctx);

        Long insertedId = userImplRepository.insert(new UserEntity(user, email, password));

        if(insertedId == -1)
            view.showMessage("Erro ao adicionar novo usuário");
        else
            view.addUserConfirmed();
    }
}
