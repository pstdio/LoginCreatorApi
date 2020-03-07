package eu.pstdio.LoginCreatorApi.business.service

import javax.persistence.EntityManager

interface EntityManagerFactory {
	fun create() : EntityManager
}