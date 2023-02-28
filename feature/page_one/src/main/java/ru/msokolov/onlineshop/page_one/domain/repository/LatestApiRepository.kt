package ru.msokolov.onlineshop.page_one.domain.repository

import ru.msokolov.onlineshop.page_one.data.entity.LatestListEntity

interface LatestApiRepository {

    suspend fun getLatestResponseDto(): LatestListEntity
}