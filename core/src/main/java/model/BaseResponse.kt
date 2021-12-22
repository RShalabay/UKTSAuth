package model

class BaseResponse(private val success: Boolean,
                   private val errorCode: Int,
                   private val errorText: String,
                   val errorDescription: String) { }