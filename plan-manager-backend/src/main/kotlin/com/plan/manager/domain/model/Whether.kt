package com.plan.manager.domain.model

import com.plan.manager.domain.type.Temperature
import java.util.Date

/**
 * 天気予報エンティティ
 */
data class Whether(
        val dt: Date,
        val tem: Temperature,
        val sunrise: Date,
        val sunset: Date,
        val whether: String
) {
    companion object {
        /**
         * 予報情報がない場合に返す。
         */
        fun createdNotWhetherForecast(): Whether {
            return Whether(
                    Date(),
                Temperature(
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                ),
                Date(),
                Date(),
                "晴天"
            )
        }
    }
}