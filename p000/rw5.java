package p000;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw5 {
    /* JADX INFO: renamed from: a */
    public static String m10479a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX INFO: renamed from: b */
    public static void m10480b(String str, String str2, Object... objArr) {
        Throwable th;
        if (Log.isLoggable(str, 3)) {
            int length = objArr.length;
            if (length == 0) {
                th = null;
            } else {
                Object obj = objArr[length - 1];
                if (obj instanceof Throwable) {
                    th = (Throwable) obj;
                } else {
                    th = null;
                }
            }
            if ((th == null && objArr.length > 0) || objArr.length > 1) {
                str2 = String.format(Locale.US, str2, objArr);
            }
            String strConcat = "cn_".concat(String.valueOf(str));
            if (th != null) {
                Log.d(strConcat, str2, th);
            } else {
                Log.d(strConcat, str2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX INFO: renamed from: c */
    public static void m10481c(String str, String str2, Object... objArr) {
        Throwable th;
        if (Log.isLoggable(str, 2)) {
            int length = objArr.length;
            if (length == 0) {
                th = null;
            } else {
                Object obj = objArr[length - 1];
                if (obj instanceof Throwable) {
                    th = (Throwable) obj;
                } else {
                    th = null;
                }
            }
            if ((th == null && objArr.length > 0) || objArr.length > 1) {
                str2 = String.format(Locale.US, str2, objArr);
            }
            String strConcat = "cn_".concat(str);
            if (th != null) {
                Log.v(strConcat, str2, th);
            } else {
                Log.v(strConcat, str2);
            }
        }
    }
}
