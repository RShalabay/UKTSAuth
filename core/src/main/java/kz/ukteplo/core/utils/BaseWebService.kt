package kz.ukteplo.core.utils

import model.base.SignUpRequest
import model.base.SignUpResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

internal interface BaseWebService {
    @POST("?signUp")
    fun signUp(@Body request: SignUpRequest): Call<SignUpResponse>
}