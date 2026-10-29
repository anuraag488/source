package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0653fj extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f19018i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0690gj f19019j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f19020k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0653fj(C0690gj c0690gj, long j, byte b) {
        super(1);
        this.f19018i = b;
        this.f19019j = c0690gj;
        this.f19020k = j;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ag1 ag1Var;
        byte b = this.f19018i;
        long j = 0;
        long j2 = this.f19020k;
        C0690gj c0690gj = this.f19019j;
        switch (b) {
            case 0:
                zo4 zo4Var = (zo4) obj;
                if (!z62.m13387o(zo4Var.mo3110a(), c0690gj.f19809q.mo3110a())) {
                    xb4 xb4Var = (xb4) c0690gj.f19809q.f20618d.m8132g(zo4Var.mo3110a());
                    j2 = xb4Var != null ? ((w52) xb4Var.getValue()).f33109a : 0L;
                } else if (!w52.m12108c(c0690gj.f19816x, -9223372034707292160L)) {
                    j2 = c0690gj.f19816x;
                }
                xb4 xb4Var2 = (xb4) c0690gj.f19809q.f20618d.m8132g(zo4Var.mo3111d());
                j = xb4Var2 != null ? ((w52) xb4Var2.getValue()).f33109a : 0L;
                q74 q74Var = (q74) c0690gj.f19808p.getValue();
                return (q74Var == null || (ag1Var = (ag1) q74Var.f28264a.invoke(w52.m12106a(j2), w52.m12106a(j))) == null) ? qq2.m10014I(0.0f, 400.0f, null, 5) : ag1Var;
            default:
                if (z62.m13387o(obj, c0690gj.f19809q.mo3110a())) {
                    j = w52.m12108c(c0690gj.f19816x, -9223372034707292160L) ? j2 : c0690gj.f19816x;
                } else {
                    xb4 xb4Var3 = (xb4) c0690gj.f19809q.f20618d.m8132g(obj);
                    if (xb4Var3 != null) {
                        j = ((w52) xb4Var3.getValue()).f33109a;
                    }
                }
                return w52.m12106a(j);
        }
    }
}
