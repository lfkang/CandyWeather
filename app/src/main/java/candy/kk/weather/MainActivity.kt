package candy.kk.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (CandyWeatherApplication.TOKEN.isEmpty()) {
            Toast.makeText(this, "请在CandyWeatherApplication中填入你的令牌值", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}