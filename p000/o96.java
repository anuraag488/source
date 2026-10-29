package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o96 {

    /* JADX INFO: renamed from: a */
    public static final char[] f26495a;

    static {
        char[] cArr = new char[80];
        f26495a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m9009a(StringBuilder sb, int i, String str, Object obj) {
        byte[] bArr;
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9009a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9009a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m9010b(i, sb);
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
            String strReplace2 = (String) obj;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < strReplace2.length(); i3++) {
                char cCharAt2 = strReplace2.charAt(i3);
                if (cCharAt2 < ' ' || cCharAt2 > '~') {
                    strReplace = yt5.m13237a(strReplace2.getBytes(StandardCharsets.UTF_8));
                    sb.append(strReplace);
                    sb.append('\"');
                    return;
                } else {
                    if (cCharAt2 == '\"') {
                        z3 = true;
                    } else if (cCharAt2 == '\'') {
                        z2 = true;
                    } else if (cCharAt2 == '\\') {
                        z = true;
                    }
                }
            }
            if (z) {
                strReplace2 = strReplace2.replace("\\", "\\\\");
            }
            strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
            if (z3) {
                strReplace = strReplace.replace("\"", "\\\"");
            }
            sb.append(strReplace);
            sb.append('\"');
            return;
        }
        if (obj instanceof r46) {
            sb.append(": \"");
            r46 r46Var = (r46) obj;
            int iMo8519d = r46Var.mo8519d();
            if (iMo8519d == 0) {
                bArr = j76.f22079a;
            } else {
                byte[] bArr2 = new byte[iMo8519d];
                r46Var.mo8521g(iMo8519d, bArr2);
                bArr = bArr2;
            }
            sb.append(yt5.m13237a(bArr));
            sb.append('\"');
            return;
        }
        if (obj instanceof s66) {
            sb.append(" {");
            m9011c((s66) obj, sb, i + 2);
            sb.append("\n");
            m9010b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i4 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m9009a(sb, i4, "key", entry.getKey());
        m9009a(sb, i4, "value", entry.getValue());
        sb.append("\n");
        m9010b(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m9010b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f26495a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX INFO: renamed from: c */
    public static void m9011c(s66 s66Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = s66Var.getClass().getDeclaredMethods();
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
                    m9009a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), s66.m10534o(method2, s66Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m9009a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), s66.m10534o(method, s66Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM10534o = s66.m10534o(method4, s66Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) s66.m10534o(method5, s66Var, new Object[0])).booleanValue();
                    } else if (objM10534o instanceof Boolean) {
                        if (((Boolean) objM10534o).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM10534o instanceof Integer) {
                        if (((Integer) objM10534o).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM10534o instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM10534o).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM10534o instanceof Double)) {
                        if (objM10534o instanceof String) {
                            zEquals = objM10534o.equals("");
                        } else if (objM10534o instanceof r46) {
                            zEquals = objM10534o.equals(r46.f29010b);
                        } else if (!(objM10534o instanceof u36) ? !((objM10534o instanceof Enum) && ((Enum) objM10534o).ordinal() == 0) : objM10534o != ((s66) ((s66) ((u36) objM10534o)).mo3836j(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM10534o).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m9009a(sb, i, strSubstring, objM10534o);
                    }
                }
            }
            i2 = i3;
        }
        mb6 mb6Var = s66Var.zzc;
        if (mb6Var != null) {
            for (int i5 = 0; i5 < mb6Var.f24802a; i5++) {
                m9009a(sb, i, String.valueOf(mb6Var.f24803b[i5] >>> 3), mb6Var.f24804c[i5]);
            }
        }
    }
}
