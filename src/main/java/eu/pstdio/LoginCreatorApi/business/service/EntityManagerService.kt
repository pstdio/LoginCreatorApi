package eu.pstdio.LoginCreatorApi.business.service

import javax.persistence.EntityManager

interface EntityManagerService {
	fun getEntityManager() : EntityManager?
}