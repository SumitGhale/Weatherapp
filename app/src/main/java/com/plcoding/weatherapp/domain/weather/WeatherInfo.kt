package com.plcoding.weatherapp.domain.weather

import com.plcoding.weatherapp.data.remote.WeatherDto

data class WeatherInfo (
    val weatherDataPerDay: Map<Int,List<WeatherData>>,
    val currentWeatherData: WeatherData?
)