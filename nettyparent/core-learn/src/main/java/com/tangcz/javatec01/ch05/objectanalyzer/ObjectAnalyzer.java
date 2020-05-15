package com.tangcz.javatec01.ch05.objectanalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 月汐
 * @date 2019/09/23 15:27
 */
public class ObjectAnalyzer {

    private List<Object> visited = new ArrayList<>();

    public String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {
            return "...";
        }
        visited.add(obj);
        Class c1 = obj.getClass();
        if (c1 == String.class) {
            return (String) obj;
        }
        if (c1.isArray()) {
            StringBuilder r = new StringBuilder(c1.getComponentType() + "[]{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    r.append(", ");
                }
                Object val = Array.get(obj, i);
                if (c1.getComponentType().isPrimitive()) {
                    r.append(val);
                } else {
                    r.append(toString(val));
                }
            }
            return r.append("}").toString();
        }

        StringBuilder r = new StringBuilder(c1.getName());
        do {
            r.append("[");
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    if (r.charAt(r.length() - 1) != '[') {
                        r.append(",");
                    }
                    r.append(field.getName()).append("=");
                    try {
                        Class t = field.getType();
                        Object val = field.get(obj);
                        if (t.isPrimitive()) {
                            r.append(val);
                        } else {
                            r.append(toString(val));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r.append("]");
            c1 = c1.getSuperclass();
        } while (c1 != null);
        return r.toString();
    }

}
