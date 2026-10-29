package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dj6 extends dp5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f17108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj6(String str, byte b) {
        super(str);
        this.f17108c = b;
    }

    @Override // p000.dp5
    /* JADX INFO: renamed from: f */
    public final aq5 mo4517f(r36 r36Var, List list) {
        byte b = this.f17108c;
        vq5 vq5Var = aq5.f14781np;
        switch (b) {
            case 0:
                return vq5Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new xo5(Double.valueOf(0.0d));
            default:
                return vq5Var;
        }
    }
}
