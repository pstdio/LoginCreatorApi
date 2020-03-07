package eu.pstdio.LoginCreatorApi.business.factory

import kotlin.reflect.KClass

interface MessageFactory {
	fun <T> create(input : String, clazz : Class<T>) : T
}