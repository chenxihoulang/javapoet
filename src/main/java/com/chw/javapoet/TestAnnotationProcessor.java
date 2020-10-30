package com.chw.javapoet;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Modifier;

public class TestAnnotationProcessor {
    public static void main(String[] args) {
        String sourceText = generateFileUseJavaPoet("com.chw.javapoet.MyAnnotation");
        System.out.println(sourceText);
    }

    private static String generateFileUseJavaPoet(String path) {
        int period = path.lastIndexOf('.');
        //获取包名
        String myPackage = period > 0 ? path.substring(0, period) : null;
        //获取类名
        String clazz = path.substring(period + 1);

        ParameterizedTypeName listStr = ParameterizedTypeName.get(List.class, String.class);
        FieldSpec annotationField = FieldSpec.builder(listStr, "sAnnotations")
                .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                .build();

        CodeBlock.Builder staticInitBlockBuilder = CodeBlock.builder()
                .addStatement("$N=new $T<>()", annotationField, ArrayList.class);
        writeMethodLinesUseJavaPoet(staticInitBlockBuilder);

        MethodSpec methodSpec = MethodSpec.methodBuilder("getAnnotations")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(listStr)
                .addStatement("return sAnnotations")
                .build();

        TypeSpec clazzType = TypeSpec.classBuilder(clazz)
                .addModifiers(Modifier.PUBLIC)
                .addField(annotationField)
                .addStaticBlock(staticInitBlockBuilder.build())
                .addMethod(methodSpec)
                .build();

        JavaFile javaFile = JavaFile.builder(myPackage, clazzType).build();

        return javaFile.toString();
    }

    private static void writeMethodLinesUseJavaPoet(CodeBlock.Builder builder) {
        for (int i = 0; i < 10; i++) {
            builder.addStatement("sAnnotations.add($S)", String.valueOf(i));
        }
    }
}
