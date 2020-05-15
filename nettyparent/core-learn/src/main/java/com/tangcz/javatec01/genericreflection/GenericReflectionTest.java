package com.tangcz.javatec01.genericreflection;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 月汐
 * @date 2019/09/29 17:03
 */
public class GenericReflectionTest {

    private static final String EXTENDS_STR = " extends ";

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter class name(e.g. java.util.Collections):");
                name = in.next();
            }
        }

        try {
            Class<?> c1 = Class.forName(name);
            printClass(c1);
            for (Method method : c1.getDeclaredMethods()) {
                printMethod(method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printClass(Class<?> c1) {
        System.out.print(c1);
        printTypes(c1.getTypeParameters(), "<", ", ", ">", true);
        Type sc = c1.getSuperclass();
        if (sc != null) {
            System.out.print(EXTENDS_STR);
            printType(sc, false);
        }
        printTypes(c1.getGenericInterfaces(), " implements ", ", ", "", false);
        System.out.println();
    }

    private static void printMethod(Method m) {
        String name = m.getName();
        System.out.print(Modifier.toString(m.getModifiers()));
        System.out.print(" ");
        printTypes(m.getParameterTypes(), "<", ", ", ">", true);

        printType(m.getGenericReturnType(), false);
        System.out.print(" ");
        System.out.print(name);
        System.out.print("(");
        printTypes(m.getGenericParameterTypes(), "", ", ", "", false);
        System.out.println(")");
    }

    private static void printTypes(Type[] types, String pre, String sep, String suf, boolean isDefinition) {
        if (EXTENDS_STR.equals(pre) && Arrays.equals(types, new Type[]{Object.class})) {
            return;
        }
        if (types.length > 0) {
            System.out.print(pre);
        }
        for (int i = 0; i < types.length; i++) {
            if (i > 0) {
                System.out.print(sep);
            }
            printType(types[i], isDefinition);
        }
        if (types.length > 0) {
            System.out.print(suf);
        }
    }

    private static void printType(Type type, boolean isDefinition) {
        if (type instanceof Class) {
            Class<?> t = (Class<?>) type;
            System.out.print(t.getName());
        } else if (type instanceof TypeVariable) {
            TypeVariable<?> t = (TypeVariable<?>) type;
            System.out.print(t.getName());
            if (isDefinition) {
                printTypes(t.getBounds(), EXTENDS_STR, " & ", "", false);
            }
        } else if (type instanceof WildcardType) {
            WildcardType t = (WildcardType) type;
            System.out.print("?");
            printTypes(t.getUpperBounds(), EXTENDS_STR, " & ", "", false);
            printTypes(t.getLowerBounds(), " super ", " & ", "", false);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType t = (ParameterizedType) type;
            Type owner = t.getOwnerType();
            if (owner != null) {
                printType(owner, false);
                System.out.print(".");
            }
            printType(t.getRawType(), false);
            printTypes(t.getActualTypeArguments(), "<", ", ", ">", false);
        } else if (type instanceof GenericArrayType) {
            GenericArrayType t = (GenericArrayType) type;
            System.out.print("");
            printType(t.getGenericComponentType(), isDefinition);
            System.out.print("[]");
        }
    }

}
