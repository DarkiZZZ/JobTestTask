package ru.msokolov.onlineshop.page_one.domain.repository

import ru.msokolov.onlineshop.latest_api.models.LatestResponseDto

interface LatestApiRepository {

    suspend fun getLatestResponseDto(): LatestResponseDto
}