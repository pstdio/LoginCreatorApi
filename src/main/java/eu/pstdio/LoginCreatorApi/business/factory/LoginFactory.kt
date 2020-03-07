package eu.pstdio.LoginCreatorApi.business.factory

interface LoginFactory {
	fun create(login : String, passwd : String)
}