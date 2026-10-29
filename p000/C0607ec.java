package p000;

import java.util.List;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0607ec implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17956a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ql3 f17957b;

    public /* synthetic */ C0607ec(byte b) {
        this.f17956a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f17956a;
        boolean z = true;
        ql3 ql3Var = this.f17957b;
        switch (b) {
            case 0:
                ql3Var.f28555a = (sl1) obj;
                return Boolean.TRUE;
            case 1:
                as1 as1Var = (as1) obj;
                if (z62.m13387o(as1Var.mo3221v0(), "waiting")) {
                    ql3Var.f28555a = as1Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                lx1 lx1Var = (lx1) obj;
                Object obj2 = ql3Var.f28555a;
                if (obj2 == null && lx1Var.f24434q) {
                    ql3Var.f28555a = lx1Var;
                } else if (obj2 != null) {
                    lx1Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                px0 px0Var = (pp4) obj;
                if (((mt2) px0Var).f25195a.f25208n) {
                    ql3Var.f28555a = px0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                vh2 vh2Var = ((rp4) ((pp4) obj)).f29517o;
                List listM7699b0 = (List) ql3Var.f28555a;
                if (listM7699b0 != null) {
                    listM7699b0.add(vh2Var);
                } else {
                    listM7699b0 = kx5.m7699b0(vh2Var);
                }
                ql3Var.f28555a = listM7699b0;
                return op4.f26939b;
            default:
                ql3Var.f28555a = (aa2) obj;
                return ju4.f22634a;
        }
    }
}
