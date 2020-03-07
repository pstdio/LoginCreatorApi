package eu.pstdio.LoginCreatorApi.presentation.controller

import eu.pstdio.LoginCreatorApi.business.service.LoginService;

interface LoginController {
	fun postLogin(json : String) : String
}