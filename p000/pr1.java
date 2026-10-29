package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pr1 implements ms2, Cloneable {

    /* JADX INFO: renamed from: a */
    public final tr1 f27911a;

    /* JADX INFO: renamed from: b */
    public tr1 f27912b;

    public pr1(tr1 tr1Var) {
        this.f27911a = tr1Var;
        if (tr1Var.m11107o()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f27912b = tr1Var.m11110s();
    }

    /* JADX INFO: renamed from: b */
    public final tr1 m9628b() {
        tr1 tr1VarM9629c = m9629c();
        tr1VarM9629c.getClass();
        if (tr1.m11096n(tr1VarM9629c, true)) {
            return tr1VarM9629c;
        }
        throw new eu4();
    }

    /* JADX INFO: renamed from: c */
    public final tr1 m9629c() {
        boolean zM11107o = this.f27912b.m11107o();
        tr1 tr1Var = this.f27912b;
        if (!zM11107o) {
            return tr1Var;
        }
        tr1Var.getClass();
        ph3 ph3Var = ph3.f27607c;
        ph3Var.getClass();
        ph3Var.m9531a(tr1Var.getClass()).mo5829b(tr1Var);
        tr1Var.m11108p();
        return this.f27912b;
    }

    /* JADX INFO: renamed from: d */
    public final pr1 m9630d() {
        pr1 pr1VarM11109q = this.f27911a.mo11102d();
        pr1VarM11109q.f27912b = m9629c();
        return pr1VarM11109q;
    }

    /* JADX INFO: renamed from: e */
    public final void m9631e() {
        if (this.f27912b.m11107o()) {
            return;
        }
        tr1 tr1VarM11110s = this.f27911a.m11110s();
        tr1 tr1Var = this.f27912b;
        ph3 ph3Var = ph3.f27607c;
        ph3Var.getClass();
        ph3Var.m9531a(tr1VarM11110s.getClass()).mo5828a(tr1VarM11110s, tr1Var);
        this.f27912b = tr1VarM11110s;
    }
}
