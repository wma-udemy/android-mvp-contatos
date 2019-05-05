package br.com.mvp.contatos.model.room.factory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import br.com.mvp.contatos.model.room.entity.UserEntity;
import br.com.mvp.contatos.model.room.repository.UserRepository;

@Database(entities = {UserEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserRepository userRepository();

    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if(INSTANCE != null)
            return INSTANCE;
        else {
            return INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "contatos")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
    }

    public static void detachDataBase() {
        if(INSTANCE != null) {
            if(INSTANCE.isOpen())
                INSTANCE.close();

            INSTANCE = null;
        }
    }

}
