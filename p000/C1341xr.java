package p000;

import android.os.Build;

/* JADX INFO: renamed from: xr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1341xr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C1341xr f34552a = new C1341xr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f34553b = pe1.m9501b("appId");

    /* JADX INFO: renamed from: c */
    public static final pe1 f34554c = pe1.m9501b("deviceModel");

    /* JADX INFO: renamed from: d */
    public static final pe1 f34555d = pe1.m9501b("sessionSdkVersion");

    /* JADX INFO: renamed from: e */
    public static final pe1 f34556e = pe1.m9501b("osVersion");

    /* JADX INFO: renamed from: f */
    public static final pe1 f34557f = pe1.m9501b("logEnvironment");

    /* JADX INFO: renamed from: g */
    public static final pe1 f34558g = pe1.m9501b("androidAppInfo");

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        C0533cn c0533cn = (C0533cn) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8479a(f34553b, c0533cn.f16131a);
        n23Var.mo8479a(f34554c, Build.MODEL);
        n23Var.mo8479a(f34555d, "2.1.2");
        n23Var.mo8479a(f34556e, Build.VERSION.RELEASE);
        n23Var.mo8479a(f34557f, jn2.f22441b);
        n23Var.mo8479a(f34558g, c0533cn.f16132b);
    }
}
