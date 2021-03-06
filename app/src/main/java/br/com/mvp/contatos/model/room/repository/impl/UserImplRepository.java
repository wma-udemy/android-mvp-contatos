package br.com.mvp.contatos.model.room.repository.impl;

import android.content.Context;
import br.com.mvp.contatos.model.room.entity.UserEntity;
import br.com.mvp.contatos.model.room.factory.AppDatabase;

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
