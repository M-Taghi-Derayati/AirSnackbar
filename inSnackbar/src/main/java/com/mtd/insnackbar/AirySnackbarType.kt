package com.mtd.insnackbar

import androidx.annotation.ColorRes


sealed interface AirySnackbarType

sealed class Type : AirySnackbarType {
    object Success : Type()
    object Error : Type()
    object Info : Type()
    object Warning : Type()
    object Default : Type()
    data class Custom(@ColorRes val bgColor: Int) : Type()
}