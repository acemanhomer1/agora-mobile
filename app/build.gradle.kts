plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.agorahall.mobile"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.agorahall.mobile"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    flavorDimensions += "edition"
    productFlavors {
        create("user") {
            dimension = "edition"
            applicationIdSuffix = ".user"
            resValue("string", "app_name", "Agora")
            buildConfigField("String", "START_URL", "\"https://agora-hall.well-slug-5344.chatgpt.site/\"")
        }
        create("owner") {
            dimension = "edition"
            applicationIdSuffix = ".owner"
            resValue("string", "app_name", "Agora Owner")
            buildConfigField("String", "START_URL", "\"https://agora-hall.well-slug-5344.chatgpt.site/?tab=suggestions\"")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-ktx:1.10.0")
    implementation("androidx.webkit:webkit:1.12.1")
}
