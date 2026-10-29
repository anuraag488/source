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
public abstract class sj6 {

    /* JADX INFO: renamed from: a */
    public static final char[] f30347a;

    static {
        char[] cArr = new char[80];
        f30347a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m10831a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m10831a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10831a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m10833c(i, sb);
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
            ig6 ig6Var = ig6.f21412c;
            sb.append(ay5.m3373a(new ig6(((String) obj).getBytes(ni6.f25875a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ig6) {
            sb.append(": \"");
            sb.append(ay5.m3373a((ig6) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zh6) {
            sb.append(" {");
            m10832b((zh6) obj, sb, i + 2);
            sb.append("\n");
            m10833c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m10831a(sb, i3, "key", entry.getKey());
        m10831a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m10833c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0200  */
    /* JADX INFO: renamed from: b */
    public static void m10832b(zh6 zh6Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zh6Var.getClass().getDeclaredMethods();
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
                    m10831a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zh6.m13564m(method2, zh6Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m10831a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zh6.m13564m(method, zh6Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM13564m = zh6.m13564m(method4, zh6Var, new Object[0]);
                    if (method5 == null) {
                        if (objM13564m instanceof Boolean) {
                            if (((Boolean) objM13564m).booleanValue()) {
                                m10831a(sb, i, strSubstring, objM13564m);
                            }
                        } else if (objM13564m instanceof Integer) {
                            if (((Integer) objM13564m).intValue() != 0) {
                                m10831a(sb, i, strSubstring, objM13564m);
                            }
                        } else if (objM13564m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM13564m).floatValue()) != 0) {
                                m10831a(sb, i, strSubstring, objM13564m);
                            }
                        } else if (!(objM13564m instanceof Double)) {
                            if (objM13564m instanceof String) {
                                zEquals = objM13564m.equals("");
                            } else if (objM13564m instanceof ig6) {
                                zEquals = objM13564m.equals(ig6.f21412c);
                            } else if (objM13564m instanceof ef6) {
                                if (objM13564m != ((zh6) ((zh6) ((ef6) objM13564m)).mo97n(6))) {
                                    m10831a(sb, i, strSubstring, objM13564m);
                                }
                            } else if (!(objM13564m instanceof Enum) || ((Enum) objM13564m).ordinal() != 0) {
                                m10831a(sb, i, strSubstring, objM13564m);
                            }
                            if (!zEquals) {
                                m10831a(sb, i, strSubstring, objM13564m);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM13564m).doubleValue()) != 0) {
                            m10831a(sb, i, strSubstring, objM13564m);
                        }
                    } else if (((Boolean) zh6.m13564m(method5, zh6Var, new Object[0])).booleanValue()) {
                        m10831a(sb, i, strSubstring, objM13564m);
                    }
                }
            }
            i2 = i3;
        }
        el6 el6Var = zh6Var.zzc;
        if (el6Var != null) {
            for (int i5 = 0; i5 < el6Var.f18243a; i5++) {
                m10831a(sb, i, String.valueOf(el6Var.f18244b[i5] >>> 3), el6Var.f18245c[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10833c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f30347a, 0, i2);
            i -= i2;
        }
    }
}
