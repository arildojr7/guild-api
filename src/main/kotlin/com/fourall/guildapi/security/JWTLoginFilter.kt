package com.fourall.guildapi.security

import javax.servlet.ServletException
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletResponse
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.security.web.util.matcher.AntPathRequestMatcher
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.core.Authentication
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter
import java.util.*
import javax.servlet.http.HttpServletRequest

class JWTLoginFilter(url: String, authManager: AuthenticationManager) : AbstractAuthenticationProcessingFilter(AntPathRequestMatcher(url)) {

    init {
        authenticationManager = authManager
    }

    @Throws(AuthenticationException::class, IOException::class, ServletException::class)
    override fun attemptAuthentication(request: HttpServletRequest, response: HttpServletResponse): Authentication {

        val credentials = ObjectMapper()
                .readValue(request.inputStream, AccountCredentials::class.java)

        return authenticationManager.authenticate(
                UsernamePasswordAuthenticationToken(
                        credentials.username,
                        credentials.password,
                        Collections.emptyList()
                )
        )
    }

    @Throws(IOException::class, ServletException::class)
    override fun successfulAuthentication(request: HttpServletRequest?, response: HttpServletResponse?, chain: FilterChain?, authResult: Authentication?) {
        if (response != null && authResult != null) {
            TokenAuthenticationService.addAuthentication(response, authResult.name)
        }
    }
}