package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo4 {

    /* JADX INFO: renamed from: a */
    public sq4 f35429a;

    /* JADX INFO: renamed from: b */
    public d83 f35430b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ dp4 f35431c;

    /* JADX INFO: renamed from: a */
    public final xo4 m13208a(yp1 yp1Var, Object obj, AbstractC0654fk abstractC0654fk, yp1 yp1Var2) {
        sq4 sq4Var = this.f35429a;
        dp4 dp4Var = this.f35431c;
        d83 d83Var = this.f35430b;
        xo4 xo4Var = (xo4) d83Var.getValue();
        if (xo4Var == null) {
            Object objInvoke = yp1Var2.invoke(dp4Var.f17258a.mo11188l());
            AbstractC0654fk abstractC0654fk2 = (AbstractC0654fk) sq4Var.f30508a.invoke(yp1Var2.invoke(dp4Var.f17258a.mo11188l()));
            abstractC0654fk2.mo3609d();
            bp4 bp4Var = new bp4(dp4Var, objInvoke, abstractC0654fk2, sq4Var);
            xo4Var = new xo4();
            xo4Var.f34511d = this;
            xo4Var.f34508a = bp4Var;
            xo4Var.f34509b = yp1Var;
            xo4Var.f34510c = yp1Var2;
            VarHandle.storeStoreFence();
            d83Var.setValue(xo4Var);
            dp4Var.f17267j.add(bp4Var);
        }
        xo4Var.f34510c = yp1Var2;
        xo4Var.f34509b = yp1Var;
        xo4Var.m12725a(dp4Var.m4645g(), obj, abstractC0654fk);
        return xo4Var;
    }
}
