package com.mindorks.example.coroutines.data.api

import com.mindorks.example.coroutines.data.model.ApiUser

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers() = apiService.getUsers()

    override suspend fun getMoreUsers() = apiService.getMoreUsers()

    override suspend fun getUsersWithError() = apiService.getUsersWithError()
    override suspend fun deleteUser(): List<ApiUser> {
        return listOf()
    }

}