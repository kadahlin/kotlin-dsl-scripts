plugins {
    id("com.android.library")
    id("kotlin-android")
    id("mergedJacocoReport")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }

    buildTypes {

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
            isTestCoverageEnabled = true
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Deps.kotlin}")
    implementation("androidx.appcompat:appcompat:${Libs.appCompat}")
    implementation("androidx.core:core-ktx:${Libs.ktx}")
    implementation("androidx.constraintlayout:constraintlayout:${Libs.constraintLayout}")

    //Test libs
    testImplementation("junit:junit:${TestLibs.junit}")
}
