package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23096a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lf0 f23097b;

    public /* synthetic */ kf0(byte b) {
        this.f23096a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f23096a;
        lf0 lf0Var = this.f23097b;
        switch (b) {
            case 0:
                zr1 zr1Var = (zr1) lf0Var.f23993c.getValue();
                if (zr1Var == null) {
                    return null;
                }
                switch (zr1Var.ordinal()) {
                    case 0:
                    case 1:
                        return wf4.f33339a;
                    case 2:
                    case 3:
                        return wf4.f33340b;
                    case 4:
                    case 5:
                        return wf4.f33341c;
                    case 6:
                    case 7:
                        return wf4.f33342d;
                    default:
                        C0670g.m5864c();
                        return null;
                }
            default:
                fs1 fs1VarM7960a = lf0Var.m7960a();
                Set set = lf0Var.f23991a;
                if (!(fs1VarM7960a instanceof cs1)) {
                    fs1VarM7960a = null;
                }
                cs1 cs1Var = (cs1) fs1VarM7960a;
                if (cs1Var == null) {
                    return null;
                }
                wf4 wf4Var = cs1Var.f16424a;
                zr1 zr1VarM6572G = i20.m6572G(wf4Var, cs1Var.f16425b);
                if (!set.contains(zr1VarM6572G)) {
                    zr1VarM6572G = null;
                }
                if (zr1VarM6572G == null) {
                    zr1VarM6572G = i20.m6572G(wf4Var, false);
                    if (!set.contains(zr1VarM6572G)) {
                        return null;
                    }
                }
                return zr1VarM6572G;
        }
    }
}
