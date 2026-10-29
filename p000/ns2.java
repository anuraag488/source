package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ns2 {

    /* JADX INFO: renamed from: a */
    public static final char[] f26070a;

    static {
        char[] cArr = new char[80];
        f26070a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m8834a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f26070a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8835b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8835b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8835b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m8834a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            o50 o50Var = t50.f30782b;
            sb.append(kx5.m7683N(new o50(((String) obj).getBytes(k62.f22939a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof t50) {
            sb.append(": \"");
            sb.append(kx5.m7683N((t50) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof tr1) {
            sb.append(" {");
            m8836c((tr1) obj, sb, i + 2);
            sb.append("\n");
            m8834a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m8835b(sb, i3, "key", entry.getKey());
        m8835b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m8834a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX INFO: renamed from: c */
    public static void m8836c(tr1 tr1Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = tr1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m8835b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), tr1.m11095m(method2, tr1Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m8835b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), tr1.m11095m(method, tr1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM11095m = tr1.m11095m(method4, tr1Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM11095m instanceof Boolean) {
                            zEquals = !((Boolean) objM11095m).booleanValue();
                        } else if (objM11095m instanceof Integer) {
                            if (((Integer) objM11095m).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11095m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM11095m).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11095m instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM11095m).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11095m instanceof String) {
                            zEquals = objM11095m.equals("");
                        } else if (objM11095m instanceof t50) {
                            zEquals = objM11095m.equals(t50.f30782b);
                        } else if (!(objM11095m instanceof AbstractC1240v1) ? !((objM11095m instanceof Enum) && ((Enum) objM11095m).ordinal() == 0) : objM11095m != ((AbstractC1240v1) objM11095m).mo45a()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) tr1.m11095m(method5, tr1Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m8835b(sb, i, strSubstring, objM11095m);
                    }
                }
            }
            i2 = i3;
        }
        nu4 nu4Var = tr1Var.unknownFields;
        if (nu4Var != null) {
            for (int i5 = 0; i5 < nu4Var.f26098a; i5++) {
                m8835b(sb, i, String.valueOf(nu4Var.f26099b[i5] >>> 3), nu4Var.f26100c[i5]);
            }
        }
    }
}
