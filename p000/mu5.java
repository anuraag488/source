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
public abstract class mu5 {

    /* JADX INFO: renamed from: a */
    public static final char[] f25225a;

    static {
        char[] cArr = new char[80];
        f25225a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m8400a(StringBuilder sb, int i, String str, Object obj) {
        byte[] bArr;
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8400a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8400a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m8401b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append('_');
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
                    strReplace = rw5.m10479a(strReplace2.getBytes(StandardCharsets.UTF_8));
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
        if (obj instanceof aj6) {
            sb.append(": \"");
            aj6 aj6Var = (aj6) obj;
            int iMo3015d = aj6Var.mo3015d();
            if (iMo3015d == 0) {
                bArr = kr5.f23354a;
            } else {
                byte[] bArr2 = new byte[iMo3015d];
                aj6Var.mo3017g(iMo3015d, bArr2);
                bArr = bArr2;
            }
            sb.append(rw5.m10479a(bArr));
            sb.append('\"');
            return;
        }
        if (obj instanceof ur1) {
            sb.append(" {");
            m8402c((ur1) obj, sb, i + 2);
            sb.append('\n');
            m8401b(i, sb);
            sb.append('}');
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
        m8400a(sb, i4, "key", entry.getKey());
        m8400a(sb, i4, "value", entry.getValue());
        sb.append('\n');
        m8401b(i, sb);
        sb.append('}');
    }

    /* JADX INFO: renamed from: b */
    public static void m8401b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f25225a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX INFO: renamed from: c */
    public static void m8402c(ur1 ur1Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ur1Var.getClass().getDeclaredMethods();
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
                    m8400a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), ur1.m11630j(method2, ur1Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m8400a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), ur1.m11630j(method, ur1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM11630j = ur1.m11630j(method4, ur1Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) ur1.m11630j(method5, ur1Var, new Object[0])).booleanValue();
                    } else if (objM11630j instanceof Boolean) {
                        if (((Boolean) objM11630j).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM11630j instanceof Integer) {
                        if (((Integer) objM11630j).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM11630j instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM11630j).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM11630j instanceof Double)) {
                        if (objM11630j instanceof String) {
                            zEquals = objM11630j.equals("");
                        } else if (objM11630j instanceof aj6) {
                            zEquals = objM11630j.equals(aj6.f14569b);
                        } else if (!(objM11630j instanceof iv5) ? !((objM11630j instanceof Enum) && ((Enum) objM11630j).ordinal() == 0) : objM11630j != ((ur1) ((ur1) ((iv5) objM11630j)).mo5307i(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM11630j).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m8400a(sb, i, strSubstring, objM11630j);
                    }
                }
            }
            i2 = i3;
        }
        ax5 ax5Var = ur1Var.unknownFields;
        if (ax5Var != null) {
            for (int i5 = 0; i5 < ax5Var.f14933a; i5++) {
                m8400a(sb, i, String.valueOf(ax5Var.f14934b[i5] >>> 3), ax5Var.f14935c[i5]);
            }
        }
    }
}
