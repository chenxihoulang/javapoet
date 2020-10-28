package com.chw.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.sun.istack.internal.Nullable;
import com.sun.net.httpserver.Headers;
import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.internal.ws.api.message.HeaderList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.LogRecord;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;

import sun.plugin2.message.Conversation;
import sun.plugin2.message.Message;
import sun.rmi.runtime.Log;

public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * package com.example.helloworld;
         *
         * public final class HelloWorld {
         *   public static void main(String[] args) {
         *     System.out.println("Hello, JavaPoet!");
         *   }
         * }
         */

//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .returns(void.class)
//                .addParameter(String[].class, "args")
//                .addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
//                .addMethod(main)
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
//                .build();
//
//        javaFile.writeTo(System.out);


//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .addCode(""
//                        + "int total = 0;\n"
//                        + "for (int i = 0; i < 10; i++) {\n"
//                        + "  total += i;\n"
//                        + "}\n")
//                .build();
//        System.out.println(main.toString());

//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .addStatement("int total = 0")
//                .beginControlFlow("for (int i = 0; i < 10; i++)")
//                .addStatement("total += i")
//                .endControlFlow()
//                .build();
//        System.out.println(main.toString());

//        MethodSpec main = computeRange("multiply10to20", 10, 20, "*");
//        System.out.println(main.toString());


//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .addStatement("long now = $T.currentTimeMillis()", System.class)
//                .beginControlFlow("if ($T.currentTimeMillis() < now)", System.class)
//                .addStatement("$T.out.println($S)", System.class, "Time travelling, woo hoo!")
//                .nextControlFlow("else if ($T.currentTimeMillis() == now)", System.class)
//                .addStatement("$T.out.println($S)", System.class, "Time stood still!")
//                .nextControlFlow("else")
//                .addStatement("$T.out.println($S)", System.class, "Ok, time still moving forward")
//                .endControlFlow()
//                .build();
//
//        System.out.println(main.toString());

//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .beginControlFlow("try")
//                .addStatement("throw new Exception($S)", "Failed")
//                .nextControlFlow("catch ($T e)", Exception.class)
//                .addStatement("throw new $T(e)", RuntimeException.class)
//                .endControlFlow()
//                .build();
//
//        System.out.println(main.toString());


//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
//                .addMethod(whatsMyName("slimShady"))
//                .addMethod(whatsMyName("eminem"))
//                .addMethod(whatsMyName("marshallMathers"))
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
//                .build();
//
//        javaFile.writeTo(System.out);

//        MethodSpec today = MethodSpec.methodBuilder("today")
//                .returns(Date.class)
//                .addStatement("return new $T()", Date.class)
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
//                .addMethod(today)
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
//                .build();
//
//        javaFile.writeTo(System.out);


//        ClassName hoverboard = ClassName.get("com.mattel", "Hoverboard");
//        MethodSpec today = MethodSpec.methodBuilder("tomorrow")
//                .returns(hoverboard)
//                .addStatement("return new $T()", hoverboard)
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
//                .addMethod(today)
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
//                .build();
//
//        javaFile.writeTo(System.out);


//        ClassName hoverboard = ClassName.get("com.mattel", "Hoverboard");
//        ClassName list = ClassName.get("java.util", "List");
//        ClassName arrayList = ClassName.get("java.util", "ArrayList");
//        //创建一个泛型类型
//        TypeName listOfHoverboards = ParameterizedTypeName.get(list, hoverboard);
//
//        MethodSpec beyond = MethodSpec.methodBuilder("beyond")
//                .returns(listOfHoverboards)
//                .addStatement("$T result = new $T<>()", listOfHoverboards, arrayList)
//                .addStatement("result.add(new $T())", hoverboard)
//                .addStatement("result.add(new $T())", hoverboard)
//                .addStatement("result.add(new $T())", hoverboard)
//                .addStatement("return result")
//                .build();
//        System.out.println(beyond.toString());


//        ClassName hoverboard = ClassName.get("com.mattel", "Hoverboard");
//        ClassName list = ClassName.get("java.util", "List");
//        ClassName arrayList = ClassName.get("java.util", "ArrayList");
//        //创建一个泛型类型
//        TypeName listOfHoverboards = ParameterizedTypeName.get(list, hoverboard);
//        System.out.println(listOfHoverboards);
//
//        ClassName namedBoards = ClassName.get("com.mattel", "Hoverboard", "Boards");
//        System.out.println(namedBoards);
//
//        MethodSpec beyond = MethodSpec.methodBuilder("beyond")
//                .returns(listOfHoverboards)
//                .addStatement("$T result = new $T<>()", listOfHoverboards, arrayList)
//                .addStatement("result.add($T.createNimbus(2000))", hoverboard)
//                .addStatement("result.add($T.createNimbus(\"2001\"))", hoverboard)
//                .addStatement("result.add($T.createNimbus($T.THUNDERBOLT))", hoverboard, namedBoards)
//                .addStatement("$T.sort(result)", Collections.class)
//                .addStatement("return result.isEmpty() ? $T.emptyList() : result", Collections.class)
//                .build();
//
//        TypeSpec hello = TypeSpec.classBuilder("HelloWorld")
//                .addMethod(beyond)
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloworld", hello)
//                .addStaticImport(hoverboard, "createNimbus")
//                .addStaticImport(namedBoards, "*")
//                .addStaticImport(Collections.class, "*")
//                .build();
//        javaFile.writeTo(System.out);


//        MethodSpec hexDigit = MethodSpec.methodBuilder("hexDigit")
//                .addParameter(int.class, "i")
//                .returns(char.class)
//                .addStatement("return (char) (i < 10 ? i + '0' : i - 10 + 'a')")
//                .build();
//
//        MethodSpec byteToHex = MethodSpec.methodBuilder("byteToHex")
//                .addParameter(int.class, "b")
//                .returns(String.class)
//                .addStatement("char[] result = new char[2]")
//                .addStatement("result[0] = $N((b >>> 4) & 0xf)", hexDigit)
//                .addStatement("result[1] = $N(b & 0xf)", hexDigit)
//                .addStatement("return new String(result)")
//                .build();
//        System.out.println(byteToHex.toString());

//        final CodeBlock block1 = CodeBlock.builder().add("I ate $L $L", 3, "tacos").build();
//        System.out.println(block1.toString());
//
//        final CodeBlock block2 = CodeBlock.builder().add("I ate $2L $1L", "tacos", 3).build();
//        System.out.println(block2.toString());
//
//        Map<String, Object> map = new LinkedHashMap<>();
//        map.put("food", "tacos");
//        map.put("count", 3);
//        final CodeBlock build3 = CodeBlock.builder().addNamed("I ate $count:L $food:L", map).build();
//        System.out.println(build3.toString());


//        MethodSpec flux = MethodSpec.methodBuilder("flux")
//                .addModifiers(Modifier.ABSTRACT, Modifier.PROTECTED)
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
//                .addMethod(flux)
//                .build();
//        System.out.println(helloWorld.toString());


//        MethodSpec flux = MethodSpec.constructorBuilder()
//                .addModifiers(Modifier.PUBLIC)
//                .addParameter(String.class, "greeting")
//                .addStatement("this.$N = $N", "greeting", "greeting")
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC)
//                .addField(String.class, "greeting", Modifier.PRIVATE, Modifier.FINAL)
//                .addMethod(flux)
//                .build();
//        System.out.println(helloWorld.toString());


//        ParameterSpec android = ParameterSpec.builder(String.class, "android")
//                .addModifiers(Modifier.FINAL)
//                .addAnnotation(Nullable.class)
//                .build();
//        System.out.println(android.toString());
//
//        MethodSpec welcomeOverlords = MethodSpec.methodBuilder("welcomeOverlords")
//                .addParameter(android)
//                .addParameter(String.class, "robot", Modifier.FINAL)
//                .addStatement("$T.out.println($N)", System.class, android)
//                .addStatement("$T.out.println($L)", System.class, "android")
//                .addStatement("$T.out.println($L)", System.class, "robot")
//                .build();
//        System.out.println(welcomeOverlords.toString());


//        FieldSpec android = FieldSpec.builder(String.class, "android")
//                .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
//                .build();
//
//        FieldSpec androidInit = FieldSpec.builder(String.class, "androidInit")
//                .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
//                .initializer("$S + $L", "Lollipop v.", 5.0d)
//                .addJavadoc("默认$S系统", "5.0")
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC)
//                .addField(android)
//                .addField(androidInit)
//                .addJavadoc("声明两个字段,一个初始化,一个不初始化")
//                .addField(String.class, "robot", Modifier.PRIVATE, Modifier.FINAL)
//                .build();
//
//        System.out.println(helloWorld.toString());


//        TypeSpec helloWorld = TypeSpec.interfaceBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC)
//                .addField(FieldSpec.builder(String.class, "ONLY_THING_THAT_IS_CONSTANT")
//                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
//                        .initializer("$S", "change")
//                        .build()
//                )
//                .addMethod(MethodSpec.methodBuilder("beep")
//                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
//                        .build()
//                )
//                .build();
//        System.out.println(helloWorld.toString());


//        TypeSpec helloWorld = TypeSpec.enumBuilder("Roshambo")
//                .addModifiers(Modifier.PUBLIC)
//                .addEnumConstant("ROCK")
//                .addEnumConstant("SCISSORS")
//                .addEnumConstant("PAPER")
//                .build();
//        System.out.println(helloWorld.toString());

//        TypeSpec helloWorld = TypeSpec.enumBuilder("Roshambo")
//                .addModifiers(Modifier.PUBLIC)
//                .addEnumConstant("ROCK", TypeSpec.anonymousClassBuilder("$S", "fist")
//                        .addMethod(MethodSpec.methodBuilder("toString")
//                                .addAnnotation(Override.class)
//                                .addModifiers(Modifier.PUBLIC)
//                                .returns(String.class)
//                                .addStatement("return $S", "avalanche!")
//                                .build())
//                        .build())
//                .addEnumConstant("SCISSORS", TypeSpec.anonymousClassBuilder("$S", "peace")
//                        .build())
//                .addEnumConstant("PAPER", TypeSpec.anonymousClassBuilder("$S", "flat")
//                        .build())
//                .addField(String.class, "handsign", Modifier.PRIVATE, Modifier.FINAL)
//                .addMethod(MethodSpec.constructorBuilder()
//                        .addParameter(String.class, "handsign")
//                        .addStatement("this.$N = $N", "handsign", "handsign")
//                        .build())
//                .build();
//        System.out.println(helloWorld.toString());
//
//        Roshambo roshambo = Roshambo.ROCK;
//        System.out.println(roshambo);
//        roshambo = Roshambo.SCISSORS;
//        System.out.println(roshambo);


//        TypeSpec comparator = TypeSpec.anonymousClassBuilder("")
//                .addSuperinterface(ParameterizedTypeName.get(Comparator.class, String.class))
//                .addMethod(MethodSpec.methodBuilder("compare")
//                        .addAnnotation(Override.class)
//                        .addModifiers(Modifier.PUBLIC)
//                        .addParameter(String.class, "a")
//                        .addParameter(String.class, "b")
//                        .returns(int.class)
//                        .addStatement("return $N.length() - $N.length()", "a", "b")
//                        .build())
//                .build();
//
//        TypeSpec myName = TypeSpec.anonymousClassBuilder("$S","chw")
//                .superclass(MyName.class)
//                .addMethod(MethodSpec.methodBuilder("getName")
//                        .addAnnotation(Override.class)
//                        .addModifiers(Modifier.PROTECTED)
//                        .returns(String.class)
//                        .addStatement("return $S+$L", "my name is:", "name")
//                        .build())
//                .build();
//        System.out.println(myName);
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .addMethod(MethodSpec.methodBuilder("sortByLength")
//                        .addParameter(ParameterizedTypeName.get(List.class, String.class), "strings")
//                        .addStatement("$T.sort($N, $L)", Collections.class, "strings", comparator)
//                        .build())
//                .addMethod(MethodSpec.methodBuilder("getMyName")
//                        .returns(String.class)
//                        .addParameter(String.class, "name", Modifier.FINAL)
//                        .addStatement("$T myName=$L", MyName.class, myName)
//                        .addStatement("return new $T($L).getName()", MyName.class, "name")
//                        .build())
//                .build();
//        System.out.println(helloWorld.toString());


//        MethodSpec toString = MethodSpec.methodBuilder("toString")
//                .addAnnotation(Override.class)
//                .returns(String.class)
//                .addModifiers(Modifier.PUBLIC)
//                .addStatement("return $S", "Hoverboard")
//                .build();
//        System.out.println(toString.toString());
//
//        MethodSpec logRecord = MethodSpec.methodBuilder("recordEvent")
//                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
//                .addAnnotation(AnnotationSpec.builder(Headers.class)
//                        .addMember("accept", "$S", "application/json; charset=utf-8")
//                        .addMember("userAgent", "$S", "Square Cash")
//                        .build())
//                .addParameter(LogRecord.class, "logRecord")
//                .returns(void.class)
//                .build();
//        System.out.println(logRecord.toString());

//        MethodSpec logRecord = MethodSpec.methodBuilder("recordEvent")
//                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
//                .addAnnotation(AnnotationSpec.builder(HeaderList.class)
//                        .addMember("value", "$L", AnnotationSpec.builder(Header.class)
//                                .addMember("name", "$S", "Accept")
//                                .addMember("value", "$S", "application/json; charset=utf-8")
//                                .build())
//                        .addMember("value", "$L", AnnotationSpec.builder(Header.class)
//                                .addMember("name", "$S", "User-Agent")
//                                .addMember("value", "$S", "Square Cash")
//                                .build())
//                        .build())
//                .addParameter(LogRecord.class, "logRecord")
//                .returns(void.class)
//                .build();
//        System.out.println(logRecord.toString());


        MethodSpec dismiss = MethodSpec.methodBuilder("dismiss")
                .addJavadoc("Hides {@code message} from the caller's history. Other\n"
                        + "participants in the conversation will continue to see the\n"
                        + "message in their own history unless they also delete it.\n")
                .addJavadoc("\n")
                .addJavadoc("<p>Use {@link #delete($T)} to delete the entire\n"
                        + "conversation for all participants.\n", Conversation.class)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .addParameter(Message.class, "message")
                .build();
        System.out.println(dismiss.toString());
    }

    /**
     * 使用字符串拼接
     */
    private static MethodSpec computeRange(String name, int from, int to, String op) {
        return MethodSpec.methodBuilder(name)
                .returns(int.class)
                .addStatement("int result = 1")
                .beginControlFlow("for (int i = " + from + "; i < " + to + "; i++)")
                .addStatement("result = result " + op + " i")
                .endControlFlow()
                .addStatement("return result")
                .build();
    }

    /**
     * 使用占位符,变量不转义,直接进行替换
     */
    private MethodSpec computeRange1(String name, int from, int to, String op) {
        return MethodSpec.methodBuilder(name)
                .returns(int.class)
                .addStatement("int result = 0")
                .beginControlFlow("for (int i = $L; i < $L; i++)", from, to)
                .addStatement("result = result $L i", op)
                .endControlFlow()
                .addStatement("return result")
                .build();
    }

    private static MethodSpec whatsMyName(String name) {
        return MethodSpec.methodBuilder(name)
                .returns(String.class)
                .addStatement("return $S", name)
                .build();
    }

    public static String byteToHex(int b) {
        char[] result = new char[2];
        result[0] = hexDigit((b >>> 4) & 0xf);
        result[1] = hexDigit(b & 0xf);
        return new String(result);
    }

    public static char hexDigit(int i) {
        return (char) (i < 10 ? i + '0' : i - 10 + 'a');
    }
}
