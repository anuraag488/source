package p000;

import android.os.Build;

/* JADX INFO: renamed from: wr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1304wr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C1304wr f33646a = new C1304wr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f33647b = pe1.m9501b("packageName");

    /* JADX INFO: renamed from: c */
    public static final pe1 f33648c = pe1.m9501b("versionName");

    /* JADX INFO: renamed from: d */
    public static final pe1 f33649d = pe1.m9501b("appBuildVersion");

    /* JADX INFO: renamed from: e */
    public static final pe1 f33650e = pe1.m9501b("deviceManufacturer");

    /* JADX INFO: renamed from: f */
    public static final pe1 f33651f = pe1.m9501b("currentProcessDetails");

    /* JADX INFO: renamed from: g */
    public static final pe1 f33652g = pe1.m9501b("appProcessDetails");

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        C1213ub c1213ub = (C1213ub) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8479a(f33647b, c1213ub.f31762a);
        n23Var.mo8479a(f33648c, c1213ub.f31763b);
        n23Var.mo8479a(f33649d, c1213ub.f31764c);
        n23Var.mo8479a(f33650e, Build.MANUFACTURER);
        n23Var.mo8479a(f33651f, c1213ub.f31765d);
        n23Var.mo8479a(f33652g, c1213ub.f31766e);
    }
}
