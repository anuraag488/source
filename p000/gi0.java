package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19799a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ii0 f19800b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f19801c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ mq1 f19802d;

    public /* synthetic */ gi0(byte b) {
        this.f19799a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19799a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f19801c;
                ii0 ii0Var = this.f19800b;
                mq1 mq1Var = this.f19802d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    ir1Var.m6885d0(866651995);
                    ij0.m6811a(viewTreeObserverOnGlobalLayoutListenerC1140sc, ii0Var.f21445l, mq1Var, ir1Var, 0);
                    ir1Var.m6912r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.f19800b.m6805a(this.f19801c, this.f19802d, (mi0) obj, vd6.m11838V(1));
                break;
        }
        return ju4Var;
    }
}
