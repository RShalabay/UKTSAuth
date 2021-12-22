package model

open class BaseRequest {
    private val apikey: String = ""
    private var session: String = ""

    constructor() {
        //TODO: Сделать получение сессии
        this.session = ""
    }
}