package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gq5 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final ur1 f20034a;

    /* JADX INFO: renamed from: b */
    public ur1 f20035b;

    public gq5(ur1 ur1Var) {
        this.f20034a = ur1Var;
        if (ur1Var.m11634g()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f20035b = (ur1) ur1Var.mo5307i(4);
    }

    /* JADX INFO: renamed from: a */
    public final ur1 m6061a() {
        boolean zM11634g = this.f20035b.m11634g();
        ur1 ur1Var = this.f20035b;
        if (zM11634g) {
            ur1Var.getClass();
            uv5.f32208b.m11661a(ur1Var.getClass()).mo9290a(ur1Var);
            ur1Var.m11632d();
            ur1Var = this.f20035b;
        }
        ur1Var.getClass();
        if (ur1.m11629h(ur1Var, true)) {
            return ur1Var;
        }
        throw new uw5();
    }

    /* JADX INFO: renamed from: b */
    public final void m6062b() {
        if (this.f20035b.m11634g()) {
            return;
        }
        ur1 ur1Var = (ur1) this.f20034a.mo5307i(4);
        uv5.f32208b.m11661a(ur1Var.getClass()).mo9291b(ur1Var, this.f20035b);
        this.f20035b = ur1Var;
    }

    public final Object clone() {
        gq5 gq5Var = (gq5) this.f20034a.mo5307i(5);
        boolean zM11634g = this.f20035b.m11634g();
        ur1 ur1Var = this.f20035b;
        if (zM11634g) {
            ur1Var.getClass();
            uv5.f32208b.m11661a(ur1Var.getClass()).mo9290a(ur1Var);
            ur1Var.m11632d();
            ur1Var = this.f20035b;
        }
        gq5Var.f20035b = ur1Var;
        return gq5Var;
    }
}
