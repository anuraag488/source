package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o66 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final s66 f26372a;

    /* JADX INFO: renamed from: b */
    public s66 f26373b;

    public o66(s66 s66Var) {
        this.f26372a = s66Var;
        if (s66Var.m10541h()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f26373b = s66Var.m10544n();
    }

    /* JADX INFO: renamed from: a */
    public final s66 m8970a() {
        boolean zM10541h = this.f26373b.m10541h();
        s66 s66Var = this.f26373b;
        if (zM10541h) {
            s66Var.getClass();
            da6.f16886b.m4415a(s66Var.getClass()).mo8656c(s66Var);
            s66Var.m10539e();
            s66Var = this.f26373b;
        }
        s66Var.getClass();
        if (s66.m10532i(s66Var, true)) {
            return s66Var;
        }
        throw new jb6();
    }

    /* JADX INFO: renamed from: b */
    public final void m8971b() {
        if (this.f26373b.m10541h()) {
            return;
        }
        s66 s66VarM10544n = this.f26372a.m10544n();
        da6.f16886b.m4415a(s66VarM10544n.getClass()).mo8659f(s66VarM10544n, this.f26373b);
        this.f26373b = s66VarM10544n;
    }

    public final Object clone() {
        o66 o66Var = (o66) this.f26372a.mo3836j(5);
        boolean zM10541h = this.f26373b.m10541h();
        s66 s66Var = this.f26373b;
        if (zM10541h) {
            s66Var.getClass();
            da6.f16886b.m4415a(s66Var.getClass()).mo8656c(s66Var);
            s66Var.m10539e();
            s66Var = this.f26373b;
        }
        o66Var.f26373b = s66Var;
        return o66Var;
    }
}
