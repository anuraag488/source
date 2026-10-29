package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq3 {

    /* JADX INFO: renamed from: a */
    public static final w42 f26037a;

    static {
        w92 w92Var = new w92();
        C1192tr c1192tr = C1192tr.f31347a;
        w92Var.m12169b(nq3.class, c1192tr);
        w92Var.m12169b(C1195tu.class, c1192tr);
        f26037a = w92Var.m12168a();
    }

    /* JADX INFO: renamed from: a */
    public static C1195tu m8816a(String str, String str2, String str3, String str4, long j) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        C1195tu c1195tu = new C1195tu();
        if (str == null) {
            xy4.m12782k("Null rolloutId");
            return null;
        }
        c1195tu.f31436b = str;
        if (str2 == null) {
            xy4.m12782k("Null parameterKey");
            return null;
        }
        c1195tu.f31437c = str2;
        c1195tu.f31438d = str3;
        if (str4 == null) {
            xy4.m12782k("Null variantId");
            return null;
        }
        c1195tu.f31439e = str4;
        c1195tu.f31440f = j;
        VarHandle.storeStoreFence();
        return c1195tu;
    }
}
