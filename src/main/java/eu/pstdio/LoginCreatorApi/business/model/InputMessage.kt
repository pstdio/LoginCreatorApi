package eu.pstdio.LoginCreatorApi.business.model

interface InputMessage {
	fun setLogin(login : String)
	fun getLogin() : String
	fun setPasswd(passwd : String)
	fun getPasswd() : String
}