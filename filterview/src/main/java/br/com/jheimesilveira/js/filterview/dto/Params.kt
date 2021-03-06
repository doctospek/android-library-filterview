package br.com.jheimesilveira.js.filterview.dto

import java.io.Serializable
import java.util.ArrayList

class Params: Serializable {
    companion object {
        var finishListener: ((params: Params) -> Unit)? = null
        var changeDialogListener: ((params: Params) -> Unit)? = null
        var changeGroupSelected: ((index: Int, jsGroupFilterModel: JSGroupFilterModel) -> Unit)?  = null
    }
    var colorBackground: Int = 0
    var colorText: Int = 0
    var title: String? = null
    var idDrawableIcon: Int? = null
    var listDataSetFilterSelected = ArrayList<JSGroupFilterModel>()
    var listDataSetFilter = ArrayList<JSGroupFilterModel>()
}