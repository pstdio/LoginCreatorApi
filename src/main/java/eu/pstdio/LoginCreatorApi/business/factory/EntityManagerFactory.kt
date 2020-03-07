package eu.pstdio.LoginCreatorApi.business.factory

import javax.persistence.EntityManager

interface EntityManagerFactory {
	fun create() : EntityManager
}