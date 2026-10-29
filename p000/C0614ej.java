package p000;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0614ej extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f18128i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0690gj f18129j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0614ej(C0690gj c0690gj, byte b) {
        super(1);
        this.f18128i = b;
        this.f18129j = c0690gj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f18128i;
        ju4 ju4Var = ju4.f22634a;
        C0690gj c0690gj = this.f18129j;
        switch (b) {
            case 0:
                db3 db3Var = c0690gj.f19811s;
                long j = c0690gj.f19813u;
                cb3.m3943m((cb3) obj, db3Var, c0690gj.f19809q.f20616b.mo3927a((((long) db3Var.f16899a) << 32) | (4294967295L & ((long) db3Var.f16900b)), j, df2.f17011a));
                break;
            default:
                db3 db3Var2 = c0690gj.f19810r;
                long j2 = c0690gj.f19812t;
                cb3.m3943m((cb3) obj, db3Var2, c0690gj.f19809q.f20616b.mo3927a((((long) db3Var2.f16899a) << 32) | (4294967295L & ((long) db3Var2.f16900b)), j2, df2.f17011a));
                break;
        }
        return ju4Var;
    }
}
