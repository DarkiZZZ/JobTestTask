plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = NameSpaces.coreLatestApiNameSpace
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}

dependencies {
    implementation(Network.retrofitCore)
    implementation(Network.retrofitGson)
}