package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fu3 implements pm3 {

    /* JADX INFO: renamed from: a */
    public dv3 f19321a;

    /* JADX INFO: renamed from: b */
    public lu3 f19322b;

    /* JADX INFO: renamed from: c */
    public String f19323c;

    /* JADX INFO: renamed from: d */
    public Object f19324d;

    /* JADX INFO: renamed from: e */
    public Object[] f19325e;

    /* JADX INFO: renamed from: f */
    public ku3 f19326f;

    /* JADX INFO: renamed from: g */
    public g32 f19327g;

    /* JADX INFO: renamed from: a */
    public final void m5810a() {
        String strM4680B;
        g32 g32Var = this.f19327g;
        lu3 lu3Var = this.f19322b;
        ku3 ku3Var = this.f19326f;
        if (ku3Var != null) {
            xy4.m12783l("entry(", ku3Var, ") is not null");
            return;
        }
        if (lu3Var != null) {
            Object objInvoke = g32Var.invoke();
            if (objInvoke == null || lu3Var.mo8110b(objInvoke)) {
                this.f19326f = lu3Var.mo8109a(this.f19323c, g32Var);
                return;
            }
            if (objInvoke instanceof p94) {
                p94 p94Var = (p94) objInvoke;
                if (p94Var.mo131e() == o85.f26450j || p94Var.mo131e() == ia5.f21230u || p94Var.mo131e() == o85.f26454n) {
                    strM4680B = "MutableState containing " + p94Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM4680B = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM4680B = dt0.m4680B(objInvoke);
            }
            throw new IllegalArgumentException(strM4680B);
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
        m5810a();
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
        ku3 ku3Var = this.f19326f;
        if (ku3Var != null) {
            ((tt2) ku3Var).m11145D();
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
        ku3 ku3Var = this.f19326f;
        if (ku3Var != null) {
            ((tt2) ku3Var).m11145D();
        }
    }
}
