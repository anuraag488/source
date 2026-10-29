package p000;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1073qj extends ue2 implements nq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ yp1 f28517i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ dp4 f28518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073qj(yp1 yp1Var, dp4 dp4Var) {
        super(3);
        this.f28517i = yp1Var;
        this.f28518j = dp4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        zq2 zq2Var = (zq2) obj;
        db3 db3VarMo5826e = ((sq2) obj2).mo5826e(((kl0) obj3).f23210a);
        if (zq2Var.mo3587z()) {
            if (((Boolean) this.f28517i.invoke(this.f28518j.f17261d.getValue())).booleanValue()) {
                j = (((long) db3VarMo5826e.f16899a) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) db3VarMo5826e.f16899a) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L);
        }
        return zq2Var.mo3583l0((int) (j >> 32), (int) (4294967295L & j), w71.f33134a, new C1036pj(db3VarMo5826e, (byte) 0));
    }
}
