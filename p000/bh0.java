package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bh0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15264a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lr2 f15265b;

    public /* synthetic */ bh0(byte b) {
        this.f15264a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15264a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b((String) this.f15265b.f24314a.invoke(null), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    l02.m7759a((g12) this.f15265b.f24315b.invoke(null), null, 0L, ir1Var2, 48, 12);
                }
                break;
        }
        return ju4Var;
    }
}
