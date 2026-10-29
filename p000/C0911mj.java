package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0911mj extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f24960i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ sw2 f24961j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0911mj(sw2 sw2Var, byte b) {
        super(0);
        this.f24960i = b;
        this.f24961j = sw2Var;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f24960i;
        sw2 sw2Var = this.f24961j;
        switch (b) {
            case 0:
                sw2Var.setValue(Boolean.FALSE);
                return ju4.f22634a;
            default:
                return b33.m3423a(((b33) sw2Var.getValue()).f15059a);
        }
    }
}
