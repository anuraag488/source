package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15682a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xb4 f15683b;

    public /* synthetic */ by2(byte b) {
        this.f15682a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f15682a;
        xb4 xb4Var = this.f15683b;
        switch (b) {
            case 0:
                float f = ((p11) xb4Var.getValue()).f27285a - 24.0f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                return p11.m9350a(f);
            case 1:
                Boolean bool = (Boolean) xb4Var.getValue();
                bool.getClass();
                return bool;
            default:
                C0530ck c0530ck = b14.f15024a;
                return b33.m3423a(((b33) xb4Var.getValue()).f15059a);
        }
    }
}
