package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class le6 {

    /* JADX INFO: renamed from: g */
    public static final Object f23979g = new Object();

    /* JADX INFO: renamed from: h */
    public static volatile cd6 f23980h;

    /* JADX INFO: renamed from: i */
    public static final AtomicInteger f23981i;

    /* JADX INFO: renamed from: a */
    public final li0 f23982a;

    /* JADX INFO: renamed from: b */
    public final String f23983b;

    /* JADX INFO: renamed from: c */
    public final Object f23984c;

    /* JADX INFO: renamed from: d */
    public volatile int f23985d = -1;

    /* JADX INFO: renamed from: e */
    public volatile Object f23986e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ byte f23987f;

    static {
        new AtomicReference();
        f23981i = new AtomicInteger();
    }

    public /* synthetic */ le6(li0 li0Var, String str, Object obj, byte b) {
        this.f23987f = b;
        if (((Uri) li0Var.f24044c) == null) {
            C1077qn.m9987m("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.f23982a = li0Var;
        this.f23983b = str;
        this.f23984c = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7958a(Object obj) {
        byte b = this.f23987f;
        String str = this.f23983b;
        switch (b) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String string = obj.toString();
                Log.e("PhenotypeFlag", c75.m3882n(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (qc6.f28389b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (qc6.f28390c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String string2 = obj.toString();
                Log.e("PhenotypeFlag", c75.m3882n(new StringBuilder(str.length() + 28 + string2.length()), "Invalid boolean value for ", str, ": ", string2));
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String string3 = obj.toString();
                Log.e("PhenotypeFlag", c75.m3882n(new StringBuilder(str.length() + 27 + string3.length()), "Invalid double value for ", str, ": ", string3));
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a A[PHI: r2
  0x005a: PHI (r2v1 y53) = (r2v0 y53), (r2v0 y53), (r2v4 y53), (r2v4 y53) binds: [B:8:0x0014, B:10:0x0018, B:12:0x0024, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX INFO: renamed from: b */
    public final Object m7959b() {
        String str;
        Object objM7958a;
        String strM10308h;
        qe4 qe4Var;
        x64 x64Var;
        int i = f23981i.get();
        if (this.f23985d < i) {
            synchronized (this) {
                try {
                    if (this.f23985d < i) {
                        cd6 cd6Var = f23980h;
                        y53 y53Var = C1275w.f32997a;
                        Object objM7958a2 = null;
                        if (cd6Var == null || (qe4Var = cd6Var.f15964b) == null) {
                            str = null;
                        } else {
                            y53Var = (y53) qe4Var.get();
                            if (y53Var.mo2967b()) {
                                kd6 kd6Var = (kd6) y53Var.mo2966a();
                                Uri uri = (Uri) this.f23982a.f24044c;
                                String str2 = this.f23983b;
                                if (uri != null) {
                                    x64Var = (x64) kd6Var.f23079a.get(uri.toString());
                                } else {
                                    kd6Var.getClass();
                                    x64Var = null;
                                }
                                if (x64Var == null) {
                                    str = null;
                                } else {
                                    str = (String) x64Var.get("".concat(str2));
                                }
                            } else {
                                str = null;
                            }
                        }
                        dt0.m4722x("Must call PhenotypeFlagInitializer.maybeInit() first", cd6Var != null);
                        li0 li0Var = this.f23982a;
                        Uri uri2 = (Uri) li0Var.f24044c;
                        if (uri2 == null) {
                            Context context = cd6Var.f15963a;
                            throw null;
                        }
                        hd6 hd6VarM6361a = wd6.m12240a(cd6Var.f15963a, uri2) ? hd6.m6361a(cd6Var.f15963a.getContentResolver(), uri2, p62.f27400c) : null;
                        if (hd6VarM6361a != null) {
                            String str3 = (String) hd6VarM6361a.m6363b().get(this.f23983b);
                            if (str3 != null) {
                                objM7958a = m7958a(str3);
                            } else {
                                objM7958a = null;
                            }
                        } else {
                            objM7958a = null;
                        }
                        if (objM7958a == null) {
                            if (!li0Var.f24043b && (strM10308h = rd6.m10299f(cd6Var.f15963a).m10308h(this.f23983b)) != null) {
                                objM7958a2 = m7958a(strM10308h);
                            }
                            objM7958a = objM7958a2 == null ? this.f23984c : objM7958a2;
                        }
                        if (y53Var.mo2967b()) {
                            objM7958a = str == null ? this.f23984c : m7958a(str);
                        }
                        this.f23986e = objM7958a;
                        this.f23985d = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f23986e;
    }
}
