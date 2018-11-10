buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.0-alpha03")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.kotlin}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
