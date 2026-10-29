package p000;

import ads_mobile_sdk.s22;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class th5 implements ch5 {

    /* JADX INFO: renamed from: a */
    public final ch5 f31177a;

    /* JADX INFO: renamed from: b */
    public final ch5 f31178b;

    /* JADX INFO: renamed from: c */
    public final yp1 f31179c;

    public th5(ch5 ch5Var, ch5 ch5Var2, yp1 yp1Var) {
        this.f31177a = ch5Var;
        this.f31178b = ch5Var2;
        this.f31179c = yp1Var;
    }

    @Override // p000.ch5
    /* JADX INFO: renamed from: a */
    public final qc5 mo2449a(String str) {
        qc5 qc5VarMo2449a = this.f31178b.mo2449a(str);
        if (qc5VarMo2449a == null) {
            ch5 ch5Var = this.f31177a;
            if (ch5Var.mo2449a(str) != null) {
                return ch5Var.mo2449a(str);
            }
            return null;
        }
        s22 s22Var = new s22();
        s22Var.f11152a = qc5VarMo2449a;
        s22Var.f11153b = this;
        VarHandle.storeStoreFence();
        return s22Var;
    }
}
