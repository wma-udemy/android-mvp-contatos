package br.com.mvp.contatos.main.model.repository.impl;

import android.content.Context;
import br.com.mvp.contatos.main.model.entity.UserEntity;
import br.com.mvp.contatos.config.room.AppDatabase;

public class UserImplRepository {
    private AppDatabase appDatabase;

    public UserImplRepository(Context ctx) {
        this.appDatabase = AppDatabase.getAppDatabase(ctx);
    }

    public Long insert(UserEntity userEntity) {
        return appDatabase.userRepository().insert(userEntity);
    }

    public UserEntity signIn(String email, String password){
        return appDatabase.userRepository().signIn(email, password);
    }
}
