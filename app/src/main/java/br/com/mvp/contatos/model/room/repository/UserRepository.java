package br.com.mvp.contatos.model.room.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import br.com.mvp.contatos.model.room.entity.UserEntity;

@Dao
public interface UserRepository {
    @Insert
    Long insert(UserEntity userEntity);

    @Query("SELECT * FROM user u WHERE u.email = :email AND u.password = :password")
    UserEntity signIn(String email, String password);
}
