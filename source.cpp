#include<iostream>
#include<C:\Users\Viktor\Desktop\jni_test\com_Main.h>
using namespace std;

JNIEXPORT jint JNICALL Java_com_Main_getSize(JNIEnv *, jclass, jobject){

	return  sizeof(jobject);

}