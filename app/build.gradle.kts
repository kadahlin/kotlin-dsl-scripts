plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("mergedJacocoReport")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.kyledahlin.scriptsample"
        minSdkVersion(23)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {

        getByName("release") {
            isMinifyEnabled = true
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

    implementation(project(":messages"))
    implementation("androidx.appcompat:appcompat:${Libs.appCompat}")
    implementation("androidx.core:core-ktx:${Libs.ktx}")
    implementation("androidx.constraintlayout:constraintlayout:${Libs.constraintLayout}")

    //Test libs
    testImplementation("junit:junit:${TestLibs.junit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${TestLibs.espressoCore}")
    androidTestImplementation("androidx.test:runner:${TestLibs.androidxTest}")
    androidTestImplementation("androidx.test:rules:${TestLibs.androidxTest}")
}