package ru.msokolov.onlineshop.user_database_api

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface LoginUserDao {

    @Query("SELECT EXISTS (SELECT 1 FROM users_table WHERE first_name = :firstName)")
    fun isUserExist(firstName: String): LiveData<Boolean>
}