package p000;

import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d76 extends lc6 {

    /* JADX INFO: renamed from: L */
    public x66 f16831L;

    /* JADX INFO: renamed from: g */
    public char f16832g;

    /* JADX INFO: renamed from: h */
    public long f16833h;

    /* JADX INFO: renamed from: i */
    public String f16834i;

    /* JADX INFO: renamed from: j */
    public x66 f16835j;

    /* JADX INFO: renamed from: k */
    public x66 f16836k;

    /* JADX INFO: renamed from: l */
    public x66 f16837l;

    /* JADX INFO: renamed from: m */
    public x66 f16838m;

    /* JADX INFO: renamed from: n */
    public x66 f16839n;

    /* JADX INFO: renamed from: o */
    public x66 f16840o;

    /* JADX INFO: renamed from: p */
    public x66 f16841p;

    /* JADX INFO: renamed from: q */
    public x66 f16842q;

    /* JADX INFO: renamed from: B */
    public static String m4399B(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strM4400C = m4400C(obj, z);
        String strM4400C2 = m4400C(obj2, z);
        String strM4400C3 = m4400C(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM4400C)) {
            sb.append(str2);
            sb.append(strM4400C);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM4400C2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM4400C2);
        }
        if (!TextUtils.isEmpty(strM4400C3)) {
            sb.append(str3);
            sb.append(strM4400C3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m4400C(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof z66) {
                return ((z66) obj).f35798a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = oa6.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: y */
    public static z66 m4401y(String str) {
        if (str == null) {
            return null;
        }
        z66 z66Var = new z66();
        z66Var.f35798a = str;
        VarHandle.storeStoreFence();
        return z66Var;
    }

    /* JADX INFO: renamed from: A */
    public final String m4402A() {
        String str;
        synchronized (this) {
            try {
                str = this.f16834i;
                if (str == null) {
                    ((oa6) ((oa6) this.f36084a).f26512d.f36084a).getClass();
                    str = "FA";
                    this.f16834i = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: z */
    public final void m4403z(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m4402A(), i)) {
            Log.println(i, m4402A(), m4399B(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        y42.m12854a0(str);
        ea6 ea6Var = ((oa6) this.f36084a).f26515g;
        if (ea6Var == null) {
            Log.println(6, m4402A(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!ea6Var.f23955f) {
            Log.println(6, m4402A(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i >= 9) {
            i = 8;
        }
        v66 v66Var = new v66();
        v66Var.f32432b = i;
        v66Var.f32433c = str;
        v66Var.f32434d = obj;
        v66Var.f32435e = obj2;
        v66Var.f32436f = obj3;
        v66Var.f32437g = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(v66Var);
    }
}
