package eu.pstdio.LoginCreatorApi.integration.entity

interface LoginEntity {
	fun setLogin(login : String)
	fun getlogin() : String
	fun setHashedPasswd(hashedPasswd : String)
	fun getHashedPasswd() : String
	fun setSalt(salt : String)
	fun getSalt() : String
}