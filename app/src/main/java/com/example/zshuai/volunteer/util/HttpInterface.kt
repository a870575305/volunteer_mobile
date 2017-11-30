package com.example.zshuai.volunteer.util

import org.json.JSONObject

/**
 * Created by wei on 2017/11/29.
 */
interface HttpInterface {
    fun sendDataToSalesforce(url: String, data: JSONObject)

    fun getDataForSalesforce(url: String): JSONObject
}