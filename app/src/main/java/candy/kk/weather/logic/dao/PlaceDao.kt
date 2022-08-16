package candy.kk.weather.logic.dao

import android.content.Context
import androidx.core.content.edit
import candy.kk.weather.CandyWeatherApplication
import candy.kk.weather.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        CandyWeatherApplication.context.getSharedPreferences("candy_weather", Context.MODE_PRIVATE)
}