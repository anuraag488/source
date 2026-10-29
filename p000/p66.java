package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p66 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f27407b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f27408c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f27409d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public y86 f27410a;

    /* JADX INFO: renamed from: g */
    public static final String m9365g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        y42.m12854a0(atomicReference);
        y42.m12849V(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final String m9366a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f27410a.m13049a() ? str : m9365g(str, vd6.f32545h, vd6.f32543f, f27407b);
    }

    /* JADX INFO: renamed from: b */
    public final String m9367b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f27410a.m13049a() ? str : m9365g(str, oh6.f26722P, oh6.f26721O, f27408c);
    }

    /* JADX INFO: renamed from: c */
    public final String m9368c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f27410a.m13049a()) {
            return str.startsWith("_exp_") ? zi4.m13621u("experiment_id(", str, ")") : m9365g(str, gq6.f20050o, gq6.f20049n, f27409d);
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public final String m9369d(ys5 ys5Var) {
        String string;
        y86 y86Var = this.f27410a;
        if (!y86Var.m13049a()) {
            return ys5Var.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(ys5Var.f35506f);
        sb.append(",name=");
        sb.append(m9366a(ys5Var.f35504d));
        sb.append(",params=");
        os5 os5Var = ys5Var.f35505e;
        if (os5Var == null) {
            string = null;
        } else {
            string = !y86Var.m13049a() ? os5Var.f27065d.toString() : m9370e(os5Var.m9261d());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m9370e(Bundle bundle) {
        String strM9371f;
        if (bundle == null) {
            return null;
        }
        if (!this.f27410a.m13049a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m9367b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM9371f = m9371f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM9371f = m9371f((Object[]) obj);
            } else {
                strM9371f = obj instanceof ArrayList ? m9371f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM9371f);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m9371f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM9370e = obj instanceof Bundle ? m9370e((Bundle) obj) : String.valueOf(obj);
            if (strM9370e != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM9370e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
