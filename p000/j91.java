package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f22109i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ yp1 f22110j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j91(yp1 yp1Var, byte b) {
        super(1);
        this.f22109i = b;
        this.f22110j = yp1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22109i;
        yp1 yp1Var = this.f22110j;
        switch (b) {
            case 0:
                return o52.m8954a(((long) ((Number) yp1Var.invoke(Integer.valueOf((int) (((w52) obj).f33109a >> 32)))).intValue()) << 32);
            case 1:
                return o52.m8954a(((long) ((Number) yp1Var.invoke(Integer.valueOf((int) (((w52) obj).f33109a & 4294967295L)))).intValue()) & 4294967295L);
            case 2:
                return o52.m8954a(((long) ((Number) yp1Var.invoke(Integer.valueOf((int) (((w52) obj).f33109a >> 32)))).intValue()) << 32);
            default:
                return o52.m8954a(((long) ((Number) yp1Var.invoke(Integer.valueOf((int) (((w52) obj).f33109a & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}
