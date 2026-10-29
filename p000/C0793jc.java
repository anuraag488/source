package p000;

/* JADX INFO: renamed from: jc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0793jc implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22158a;

    /* JADX INFO: renamed from: b */
    public Object f22159b;

    public /* synthetic */ C0793jc(byte b) {
        this.f22158a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22158a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                int i = ((mk1) obj).f24973a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numM12316c = wk1.m12316c(i);
                if (numM12316c != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f22159b).playSoundEffect(C1148sk.f30348a.m10834a(numM12316c.intValue(), zBooleanValue));
                }
                break;
            default:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    l02.m7759a(((xx2) this.f22159b).f34697b, null, 0L, ir1Var, 48, 12);
                }
                break;
        }
        return ju4Var;
    }
}
