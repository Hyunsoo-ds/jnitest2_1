#include <Calculator.h>
#include <cstring>
#include <iostream>
#include <stdio.h>

JNIEXPORT jstring JNICALL Java_com_example_jnitest2_WebAppInterface_getSum
        (JNIEnv *env, jobject thiz, jstring text) {
    char buffer[10];

    const char *source = env->GetStringUTFChars(text, NULL);
    strcpy(buffer,source);

    env->ReleaseStringUTFChars(text,source);

    return text;
}

