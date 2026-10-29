package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k64 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22942a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i64 f22943b;

    public /* synthetic */ k64(byte b) {
        this.f22942a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22942a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b(this.f22943b.f21142b, k43.m7396u(), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262140);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    d24.m4302c(this.f22943b.f21143c, n74.m8579g(kt2.f23428a, 40.0f), ir1Var2, 432, 248);
                }
                break;
        }
        return ju4Var;
    }
}
