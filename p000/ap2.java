package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 implements zo2 {

    /* JADX INFO: renamed from: a */
    public qf2 f14768a;

    @Override // p000.zo2
    /* JADX INFO: renamed from: a */
    public final cf2 mo3108a(cf2 cf2Var) {
        vo2 vo2Var;
        vo2 vo2Var2 = cf2Var instanceof vo2 ? (vo2) cf2Var : null;
        if (vo2Var2 != null) {
            return vo2Var2;
        }
        e13 e13Var = (e13) cf2Var;
        uo2 uo2VarMo4869X0 = e13Var.mo4869X0();
        return (uo2VarMo4869X0 == null || (vo2Var = uo2VarMo4869X0.f32029x) == null) ? e13Var : vo2Var;
    }

    @Override // p000.zo2
    /* JADX INFO: renamed from: b */
    public final cf2 mo3109b() {
        return (cf2) this.f14768a.invoke();
    }
}
