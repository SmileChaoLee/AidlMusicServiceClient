package com.smile.aidlmusicserviceclient.model

import com.smile.aidlmusicserviceclient.Constants

object RecentStatus {
    val status : ServiceStatus = ServiceStatus(""
        , bindEnabled = false, unbindEnabled = false
        , playResult = Constants.ErrorCode
        , pauseResult = Constants.ErrorCode
        , serverText = "")
}