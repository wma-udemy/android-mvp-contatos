package br.com.mvp.contatos.model.room.factory;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import br.com.mvp.contatos.model.room.entity.UserEntity;
import br.com.mvp.contatos.model.room.repository.UserRepository;

@Database(entities = {UserEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserRepository userRepository();

    public static AppDatabase getAppDatabase(Context context){
        return Room.databaseBuilder(context, AppDatabase.class, "contatos")
        .allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build();
    }

}
