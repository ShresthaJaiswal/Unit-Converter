package com.example.unitconverter.utils

object ConverterUtil {

    val CONVERTER_TYPES = listOf(
        "Currency",
        "Time",
        "Distance"
    )


    private val currency = mapOf(
        "Chinese yuan" to 9.167160,
        "Euro" to 1.313670,
        "Japanese yen" to 188.117000,
        "U.K. pound" to 1.135070,
        "U.S. dollar" to 1.276500,
        "Indian rupee" to 105.168000,
        "Korean won" to 1821.560000,
        "Russian ruble" to 80.490700,
        "Singapore dollar" to 1.815180,
        "South African rand" to 23.250900
    )

    private val time = mapOf(
        "Nanosecond" to 6e+10,
        "Microsecond" to 6e+7,
        "Millisecond" to 6e+4,
        "Second" to 60.0,
        "Minute" to 1.0,
        "Hour" to 0.0167,
        "Day" to 0.000694,
        "Week" to 9.9206e-5,
        "Month" to 2.2831e-5,
        "Year" to 1.9026e-6,
        "Decade" to 1.9026e-7,
        "Century" to 1.9026e-8,
    )

    private val distance = mapOf(
        "Kilometre" to 0.001,
        "Metre" to 1.0,
        "Centimetre" to 100.0,
        "Millimetre" to 1000.0,
        "Micrometre" to 1e+6,
        "Nanometre" to 1e+9,
        "Mile" to 0.000621371,
        "Yard" to 1.09361,
        "Foot" to 3.28084,
        "Inch" to 0.0254
    )

    fun convert(
        converterType: String,
        convertFrom: String,
        convertTo: String,
        amount: Double
    ):Double{
        return when(converterType){
            "Currency"-> amount * currency[convertTo]!! / currency[convertFrom]!!
            "Time" -> amount * time[convertTo]!! / time[convertFrom]!!
            "Distance" -> amount * distance[convertTo]!! / distance[convertFrom]!!
            else -> 0.0
        }
    }

    fun getConverterValues(
        converterType: String
    ): List<String>{
        return when(converterType){
            "Currency" -> currency.keys
            "Time" -> time.keys
            "Distance" -> distance.keys
            else -> setOf()
        }.toList()
    }
}



















