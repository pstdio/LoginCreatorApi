package eu.pstdio.LoginCreatorApi.business.factory

interface MessageFactory {
	fun <T> create(input : String, clazz : Class<T>) : T
}