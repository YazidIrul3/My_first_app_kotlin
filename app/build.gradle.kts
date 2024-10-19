plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

}

android {
    namespace = "com.example.myproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//    implementation("androidx.cardview:cardview:1.0.0")
//    implementation("androidx.recyclerview:recyclerview:1.3.2")
//    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
//    implementation("com.squareup.moshi:moshi-kotlin:1.12.0")
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
//    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.9.0"))
//    implementation("com.squareup.okhttp3:okhttp")
//    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation(libs.glide)

//    implementation("com.google.dagger:hilt-android")

//    implementation("com.github.bumptect.glide:compiler:4.16.0")
    implementation(libs.androidx.swiperefreshlayout)
}