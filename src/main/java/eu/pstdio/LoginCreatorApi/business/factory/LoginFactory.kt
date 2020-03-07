package eu.pstdio.LoginCreatorApi.business.factory

import eu.pstdio.LoginCreatorApi.business.model.InputMessage

interface LoginFactory {
	fun create(credentials : InputMessage)
}