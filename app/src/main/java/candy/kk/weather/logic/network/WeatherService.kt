package candy.kk.weather.logic.network

import candy.kk.weather.CandyWeatherApplication
import candy.kk.weather.logic.model.DailyResponse
import candy.kk.weather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.6/${CandyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.6/${CandyWeatherApplication.TOKEN}/{lng},{lat}/daily?dailysteps=7")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}