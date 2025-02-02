package com.plcoding.githubrepoapp.data.remote

import com.plcoding.githubrepoapp.data.remote.dto.RepoDetailDto
import com.plcoding.githubrepoapp.data.remote.dto.RepoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("/users/allegro/repos")
    suspend fun getRepos(): List<RepoDto>

    @GET("/repositories/{repoId}")
    suspend fun getRepoById(@Path("repoId") repoId: Int): RepoDetailDto
}