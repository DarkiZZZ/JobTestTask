object NameSpaces {
    ///////
    private const val appNameSpace = Config.appNameSpace

    ///   utils and others

    //const val networkUtils = "$appNameSpace.network_utils"

    ///   core
    private const val coreNameSpace = "$appNameSpace.core"
    private const val utilsNameSpace = "$appNameSpace.utils"
    private const val storageNameSpace = "$appNameSpace.storage"
    private const val featureNameSpace = "$appNameSpace.feature"

    const val coreUiNameSpace = "$coreNameSpace.ui"
    const val coreDaggerNameSpace = "$coreNameSpace.dagger"

    const val storageUserDatabaseNameSpace = "$storageNameSpace.user_database"
    const val storageUserDatabaseApiNameSpace = "$storageNameSpace.user_database_api"

    const val coreDetailedInfoApiNameSpace = "$coreNameSpace.page_two_api"
    const val coreDetailedInfoApiInternalNameSpace = "$coreNameSpace.page_two_api_internal"

    const val coreLatestApiNameSpace = "$coreNameSpace.latest_api"
    const val coreLatestApiInternalNameSpace = "$coreNameSpace.latest_api_internal"

    const val coreSaleApiNameSpace = "$coreNameSpace.sale_api"
    const val coreSaleApiInternalNameSpace = "$coreNameSpace.sale_api_internal"

    const val coreSearchApiNameSpace = "$coreNameSpace.search_api"
    const val coreSearchApiInternalNameSpace = "$coreNameSpace.search_api_internal"

    const val coreNavigationNameSpace = "$coreNameSpace.navigation"

    const val utilsNetworkNameSpace = "$utilsNameSpace.network"
    const val utilsLiveDataNameSpace = "$utilsNameSpace.livedata"


    //const val coreProductDetailedApiNameSpace = "$coreNameSpace.product_detailed_api"
    //const val coreProductDetailedApiInterfaceNameSpace = "$coreNameSpace.product_detailed_api_interface"

    ///   features
    //private const val featureNameSpace = "$appNameSpace.feature"

    //const val featureSplashScreenNameSpace = "$featureNameSpace.splashscreen"
    //const val featureHomeNameSpace = "$featureNameSpace.home"
    //const val featureCartNameSpace = "$featureNameSpace.cart"
    //const val featureProductDetailedNameSpace = "$featureNameSpace.product_detailed"
}