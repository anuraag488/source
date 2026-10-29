package p000;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0749i4 implements jk2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21111a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21112b;

    public /* synthetic */ C0749i4(byte b) {
        this.f21111a = b;
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        byte b = this.f21111a;
        Object obj = this.f21112b;
        switch (b) {
            case 0:
                ((yp1) obj).invoke(ek2Var);
                break;
            case 1:
                mh0 mh0Var = (mh0) obj;
                mh0Var.getClass();
                mh0Var.f24911b = ek2Var.m5149a();
                mh0Var.m8322a();
                break;
            case 2:
                zu3 zu3Var = (zu3) obj;
                if (ek2Var == ek2.ON_START) {
                    zu3Var.f36391h = true;
                } else if (ek2Var == ek2.ON_STOP) {
                    zu3Var.f36391h = false;
                }
                break;
            default:
                AbstractC1091r0 abstractC1091r0 = (AbstractC1091r0) obj;
                if (ek2Var == ek2.ON_DESTROY) {
                    abstractC1091r0.m10171e();
                }
                break;
        }
    }
}
