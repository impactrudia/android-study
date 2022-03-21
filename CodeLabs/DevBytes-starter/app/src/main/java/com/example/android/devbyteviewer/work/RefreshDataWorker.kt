package com.example.android.devbyteviewer.work

import android.content.Context
import androidx.work.*
import com.example.android.devbyteviewer.database.getDatabase
import com.example.android.devbyteviewer.repository.VideoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import timber.log.Timber

class RefreshDataWorker(appContext: Context, params: WorkerParameters) :
    CoroutineWorker(appContext, params) {

    private val applicationScope = CoroutineScope(Dispatchers.Default)

    override suspend fun doWork(): Result {
        val database = getDatabase(applicationContext)
        val repository = VideoRepository(database)

        try {
            repository.refreshVideos()
            Timber.d("WorkManager: Work request for sync is run")
        } catch (e: HttpException) {
            return Result.retry()
        }
        return Result.success()
    }

    companion object {
        const val WORK_NAME = "com.example.android.devbyteviewer.work.RefreshDataWorker"
    }
}