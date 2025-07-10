plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.zebpay_xenith_assignment_anmol"
    //noinspection GradleDependency
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.zebpay_xenith_assignment_anmol"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //koin
//    implementation(platform(libs.koin.bom))
//    implementation(libs.koin.core)
//    implementation(libs.koin.android)
//    implementation(libs.koin.compose)
//    implementation(libs.koin.start)
//
//    coil
//    implementation(libs.coil.compose)
//    implementation(libs.coil.svg)
//
//    //ktor
//    implementation(libs.ktor.client.core)
//
//    // Paging
//    implementation(libs.paging.runtime.ktx)
//    implementation(libs.paging.common.ktx)
//
//    //google fonts
//    implementation(libs.ui.text.google.fonts)
//
//    //firebase
//    implementation(platform(libs.firebase.bom))
//    implementation(libs.firebase.messaging.ktx)
//    implementation(libs.firebase.crashlytics.ktx)
//    implementation(libs.firebase.analytics.ktx)

}