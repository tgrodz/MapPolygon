package com.tgrodz.mappolygon.network

import com.tgrodz.mappolygon.model.Area
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.*


interface AreaApi {

    @Headers("Accept: application/json", "Content-type:application/json")
    @GET("api_esb/AgileRider/api/GetCornFieldsByDevice")
    fun getData(@Header("DeviceID") header: String,
                @Query("dev_ID") deviceId: String) : Call<List<Area>>

}
