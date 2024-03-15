package com.example.a7minuteworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Insert
     fun insert(historyEntity: HistoryEntity)

     @Query("SELECT * from `history-table`")
     fun fetchAllDates(): Flow<List<HistoryEntity>>
}