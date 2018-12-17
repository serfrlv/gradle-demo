# gradle-demo
apply plugin: 'com.shinesolutions.demo.plugin'

buildscript {
	repositories {
		mavenLocal()
	}
	dependencies {
		classpath 'com.shineSolutions:gradle-demo:1.0.0-SNAPSHOT'
	}
}

demoSetting {
    message = "Hi from an extension"
}


http://www.thinkcode.se/blog/2015/03/22/a-gradle-plugin-written-in-java