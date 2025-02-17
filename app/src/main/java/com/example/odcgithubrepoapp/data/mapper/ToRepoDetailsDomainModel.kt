package com.example.odcgithubrepoapp.data.mapper

import com.example.odcgithubrepoapp.data.data_sources.remote.retrofit.data_model.repo_details.RepoDetailsDataModel
import com.example.odcgithubrepoapp.data.data_sources.remote.retrofit.data_model.repo_list.Item
import com.example.odcgithubrepoapp.domain.model.GithubReposDomainModel
import com.example.odcgithubrepoapp.domain.model.RepoDetailsDomainModel
import com.example.odcgithubrepoapp.presentation.screens.repo_details_screen.model.RepoDetailsUiModel

fun RepoDetailsDataModel.toRepoDetailsDomainModel(): RepoDetailsDomainModel {
    return RepoDetailsDomainModel(
        id = this.id,
        name = this.name,
        owner = this.owner.login,
        avatar = this.owner.avatar_url,
        stars = this.stargazers_count,
        description = this.description,
        fullName = this.full_name,
        forks = this.forks,
        url = this.url,
        createdAt = created_at,
        language = this.language ?: ""
    )
}