package eu.pstdio.LoginCreatorApi.integration.dao

import eu.pstdio.LoginCreatorApi.integration.entity.LoginEntity;

interface LoginDao {
	fun create(loginEntity : LoginEntity)
}