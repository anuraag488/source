package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vn2 extends pn2 {

    /* JADX INFO: renamed from: a */
    public te0 f32748a;

    @Override // p000.pn2
    /* JADX INFO: renamed from: a */
    public final void mo9587a(k44 k44Var, String str, String str2, Throwable th) {
        te0 te0Var = this.f32748a;
        try {
            if (th == null) {
                int iOrdinal = k44Var.ordinal();
                if (iOrdinal == 0) {
                    Log.v(str2, str);
                    return;
                }
                if (iOrdinal == 1) {
                    Log.d(str2, str);
                    return;
                }
                if (iOrdinal == 2) {
                    Log.i(str2, str);
                    return;
                }
                if (iOrdinal == 3) {
                    Log.w(str2, str);
                    return;
                } else if (iOrdinal == 4) {
                    Log.e(str2, str);
                    return;
                } else {
                    if (iOrdinal != 5) {
                        throw new gf0();
                    }
                    Log.println(7, str2, str);
                    return;
                }
            }
            int iOrdinal2 = k44Var.ordinal();
            if (iOrdinal2 == 0) {
                Log.v(str2, str, th);
                return;
            }
            if (iOrdinal2 == 1) {
                Log.d(str2, str, th);
                return;
            }
            if (iOrdinal2 == 2) {
                Log.i(str2, str, th);
                return;
            }
            if (iOrdinal2 == 3) {
                Log.w(str2, str, th);
                return;
            }
            if (iOrdinal2 == 4) {
                Log.e(str2, str, th);
                return;
            }
            if (iOrdinal2 != 5) {
                throw new gf0();
            }
            Log.println(7, str2, str + '\n' + Log.getStackTraceString(th));
        } catch (RuntimeException unused) {
            te0Var.mo9587a(k44Var, str, str2, th);
        } catch (UnsatisfiedLinkError unused2) {
            te0Var.mo9587a(k44Var, str, str2, th);
        }
    }
}
