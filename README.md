# Android-Library-test
It creates simple custom alertdialog having card shape
To use this library
Step 1. add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.m666362:Android-Library-test:1.0.0.2'
	}
	
Step 3. Initialize it in onCreate() of Activity.java

	SiemensDialog siemensDialog = new SiemensDialog( this );
	
Step 4. Implement it by: 

	siemensDialog.setView()
		     .setTitle( titleText, Color.GRAY )
		     .setMessage( messageText, Color.BLACK )
		     .build();
		    
