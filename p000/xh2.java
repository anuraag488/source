package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34279a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ si2 f34280b;

    public /* synthetic */ xh2(byte b) {
        this.f34279a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        int i;
        byte b = this.f34279a;
        si2 si2Var = this.f34280b;
        switch (b) {
            case 0:
                i = si2Var.m10789h().f24954o;
                break;
            default:
                i = ((mi2) si2Var.f30300f.getValue()).f24950k;
                break;
        }
        return Integer.valueOf(i);
    }
}
