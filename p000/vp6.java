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
public abstract class vp6 {

    /* JADX INFO: renamed from: a */
    public static final char[] f32788a;

    static {
        char[] cArr = new char[80];
        f32788a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m11950a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m11950a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11950a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m11951b(i, sb);
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
            ym6 ym6Var = ym6.f35338c;
            sb.append(f06.m5440b(new ym6(((String) obj).getBytes(ro6.f29484a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ym6) {
            sb.append(": \"");
            sb.append(f06.m5440b((ym6) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof jo6) {
            sb.append(" {");
            m11952c((jo6) obj, sb, i + 2);
            sb.append("\n");
            m11951b(i, sb);
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
        m11950a(sb, i3, "key", entry.getKey());
        m11950a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m11951b(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m11951b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f32788a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fb  */
    /* JADX INFO: renamed from: c */
    public static void m11952c(jo6 jo6Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = jo6Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m11950a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), jo6.m7196j(method2, jo6Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m11950a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), jo6.m7196j(method, jo6Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM7196j = jo6.m7196j(method4, jo6Var, new Object[0]);
                    if (method5 == null) {
                        if (objM7196j instanceof Boolean) {
                            if (((Boolean) objM7196j).booleanValue()) {
                                m11950a(sb, i, strSubstring, objM7196j);
                            }
                        } else if (objM7196j instanceof Integer) {
                            if (((Integer) objM7196j).intValue() != 0) {
                                m11950a(sb, i, strSubstring, objM7196j);
                            }
                        } else if (objM7196j instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM7196j).floatValue()) != 0) {
                                m11950a(sb, i, strSubstring, objM7196j);
                            }
                        } else if (!(objM7196j instanceof Double)) {
                            if (objM7196j instanceof String) {
                                zEquals = objM7196j.equals("");
                            } else if (objM7196j instanceof ym6) {
                                zEquals = objM7196j.equals(ym6.f35338c);
                            } else if (objM7196j instanceof hm6) {
                                if (objM7196j != ((jo6) ((jo6) ((hm6) objM7196j)).mo205g(6))) {
                                    m11950a(sb, i, strSubstring, objM7196j);
                                }
                            } else if (!(objM7196j instanceof Enum) || ((Enum) objM7196j).ordinal() != 0) {
                                m11950a(sb, i, strSubstring, objM7196j);
                            }
                            if (!zEquals) {
                                m11950a(sb, i, strSubstring, objM7196j);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM7196j).doubleValue()) != 0) {
                            m11950a(sb, i, strSubstring, objM7196j);
                        }
                    } else if (((Boolean) jo6.m7196j(method5, jo6Var, new Object[0])).booleanValue()) {
                        m11950a(sb, i, strSubstring, objM7196j);
                    }
                }
            }
            i2 = 3;
        }
    }
}
