package eu.pstdio.LoginCreatorApi.business.factory

import eu.pstdio.LoginCreatorApi.business.model.InputMessage
import eu.pstdio.LoginCreatorApi.integration.entity.LoginEntity

interface LoginFactory {
	fun create(credentials : InputMessage) : LoginEntity
}