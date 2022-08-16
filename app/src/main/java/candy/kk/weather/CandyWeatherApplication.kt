package candy.kk.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class CandyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "" // 填入申请到的令牌值
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}