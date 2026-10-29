package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc3 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15924a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dc3 f15925b;

    public /* synthetic */ cc3(byte b) {
        this.f15924a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f15924a;
        dc3 dc3Var = this.f15925b;
        switch (b) {
            case 0:
                wr1 wr1Var = dc3Var.f16971b;
                return wr1Var != null ? wr1Var.mo3932a() : zp0.f36243f;
            case 1:
                return n40.m8501k(dc3Var.f16971b != null ? new ArrayList(0) : null);
            default:
                return Integer.valueOf(AbstractC0647fd.m5643A(dc3Var, (g24[]) dc3Var.f16979j.getValue()));
        }
    }
}
