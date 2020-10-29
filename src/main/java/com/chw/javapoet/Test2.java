package com.chw.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.WildcardTypeName;

import java.util.List;

import javax.lang.model.element.Modifier;

public class Test2 {
    public static void main(String[] args) {
        final ClassName myName = ClassName.get("com.chw.javapoet", "MyName");

        final ParameterizedTypeName listStrType = ParameterizedTypeName.get(List.class, String.class);
        final ParameterizedTypeName listMyNameType = ParameterizedTypeName.get(ClassName.get(List.class), myName);

        //泛型类型变量 T
        final TypeVariableName typeVariableName = TypeVariableName.get("T");
        System.out.println(typeVariableName);
        //通配符类型 ? extends com.chw.javapoet.MyName
        final WildcardTypeName wildcardTypeName = WildcardTypeName.subtypeOf(MyName.class);
        System.out.println(wildcardTypeName);
        //通配符类型 ? super com.chw.javapoet.MyName
        final WildcardTypeName wildcardTypeName1 = WildcardTypeName.supertypeOf(MyName.class);
        System.out.println(wildcardTypeName1);

        final ParameterizedTypeName listMyNameExtendType = ParameterizedTypeName.get(ClassName.get(List.class), wildcardTypeName);
        final ParameterizedTypeName listMyNameSuperType = ParameterizedTypeName.get(ClassName.get(List.class), wildcardTypeName1);

        // `JavaFile` 代表 Java 文件
        JavaFile javaFile = JavaFile.builder("com.walfud.howtojavapoet",
                // TypeSpec 代表一个类
                TypeSpec.classBuilder("Clazz")
                        // 给类添加一个属性
                        .addField(FieldSpec.builder(int.class, "mField", Modifier.PRIVATE).build())
                        .addField(FieldSpec.builder(int[].class, "myIntArr", Modifier.PRIVATE).build())
                        .addField(FieldSpec.builder(listStrType, "listStr", Modifier.PRIVATE).build())
                        .addField(FieldSpec.builder(listMyNameType, "listMyName", Modifier.PRIVATE).build())
                        .addField(FieldSpec.builder(listMyNameExtendType, "listMyNameExtendType", Modifier.PRIVATE).build())
                        .addField(FieldSpec.builder(listMyNameSuperType, "listMyNameSuperType", Modifier.PRIVATE).build())
                        // 给类添加一个方法
                        .addMethod(MethodSpec.methodBuilder("method")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(void.class)
                                .addStatement("$T.out.println(str)", System.class)
                                .build())
                        .build())
                .build();

        System.out.println(javaFile.toString());
    }
}
