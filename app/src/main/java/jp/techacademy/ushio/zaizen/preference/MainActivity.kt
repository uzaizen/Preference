package jp.techacademy.ushio.zaizen.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = PreferenceManager.getDefaultSharedPreferences(this)

        putButton.setOnClickListener{
            val editor = preference.edit()
            editor.putString("TExT",editText.text.toString())
            editor.commit()
        }

        getButton.setOnClickListener{
            editText.setText(preference.getString("TEXT","まだ保存されていません"))
        }
    }
}