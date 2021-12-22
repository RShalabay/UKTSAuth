package model.base

import model.BaseRequest

class SignUpRequest(val username: String,
                    val password: String,
                    val email: String) : BaseRequest() {
    private val lang: String = "ru"
    private val password2: String = this.password
    private val deviceId: String = ""

    init {
        //TODO: Сделать получение DeviceId из настроек
    }
}