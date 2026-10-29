package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class f06 {
    /* JADX INFO: renamed from: a */
    public static String m5439a(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m5441c(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m5441c(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m5440b(ym6 ym6Var) {
        StringBuilder sb = new StringBuilder(ym6Var.mo11067d());
        for (int i = 0; i < ym6Var.mo11067d(); i++) {
            byte bMo11065b = ym6Var.mo11065b(i);
            if (bMo11065b == 34) {
                sb.append("\\\"");
            } else if (bMo11065b == 39) {
                sb.append("\\'");
            } else if (bMo11065b != 92) {
                switch (bMo11065b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo11065b < 32 || bMo11065b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo11065b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo11065b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo11065b & 7) + 48));
                        } else {
                            sb.append((char) bMo11065b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m5441c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strM13621u = zi4.m13621u(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM13621u), (Throwable) e);
            return zi4.m13622v("<", strM13621u, " threw ", e.getClass().getName(), ">");
        }
    }
}
