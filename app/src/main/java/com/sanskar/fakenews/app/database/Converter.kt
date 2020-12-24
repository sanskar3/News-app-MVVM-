package com.sanskar.fakenews.app.database

import androidx.room.TypeConverter
import com.sanskar.fakenews.app.models.Source


class Converter {

    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}