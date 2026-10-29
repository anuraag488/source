package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xo4 implements xb4 {

    /* JADX INFO: renamed from: a */
    public bp4 f34508a;

    /* JADX INFO: renamed from: b */
    public yp1 f34509b;

    /* JADX INFO: renamed from: c */
    public yp1 f34510c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ yo4 f34511d;

    /* JADX INFO: renamed from: a */
    public final void m12725a(zo4 zo4Var, Object obj, AbstractC0654fk abstractC0654fk) {
        bp4 bp4Var = this.f34508a;
        Object objInvoke = this.f34510c.invoke(zo4Var.mo3111d());
        if (this.f34511d.f35431c.m4648j()) {
            bp4Var.m3658g(this.f34510c.invoke(zo4Var.mo3110a()), objInvoke, (ag1) this.f34509b.invoke(zo4Var));
        } else {
            bp4Var.m3659h(objInvoke, (ag1) this.f34509b.invoke(zo4Var), obj, abstractC0654fk);
        }
    }

    @Override // p000.xb4
    public final Object getValue() {
        m12725a(this.f34511d.f35431c.m4645g(), null, null);
        return this.f34508a.f15494j.getValue();
    }
}
