package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yg4 implements InterfaceC1147sj {

    /* JADX INFO: renamed from: a */
    public d83 f35217a;

    /* JADX INFO: renamed from: c */
    public static nt2 m13125c(yg4 yg4Var, C0853kz c0853kz) {
        r54 r54Var = new r54((byte) 12);
        yg4Var.getClass();
        pg4 pg4Var = new pg4();
        pg4Var.f27600a = c0853kz;
        pg4Var.f27601b = r54Var;
        VarHandle.storeStoreFence();
        return pg4Var;
    }

    @Override // p000.InterfaceC1147sj
    /* JADX INFO: renamed from: b */
    public final dp4 mo2997b() {
        return (dp4) this.f35217a.getValue();
    }
}
