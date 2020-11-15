package com.iplant.database

import androidx.appcompat.app.AppCompatDelegate
import com.chibatching.kotpref.KotprefModel

object Prefs : KotprefModel() {
    var nightMode by intPref(default = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
}
