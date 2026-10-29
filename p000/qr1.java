package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qr1 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final vr1 f28724a;

    /* JADX INFO: renamed from: b */
    public vr1 f28725b;

    public qr1(vr1 vr1Var) {
        this.f28724a = vr1Var;
        if (vr1Var.m11980f()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f28725b = vr1Var.m11982i();
    }

    /* JADX INFO: renamed from: d */
    public static void m10044d(j62 j62Var, int i) {
        String str = "Element at index " + (j62Var.size() - i) + " is null.";
        for (int size = j62Var.size() - 1; size >= i; size--) {
            j62Var.remove(size);
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: a */
    public final vr1 m10045a() {
        vr1 vr1VarM10046b = m10046b();
        vr1VarM10046b.getClass();
        if (vr1.m11976e(vr1VarM10046b, true)) {
            return vr1VarM10046b;
        }
        throw new fu4();
    }

    /* JADX INFO: renamed from: b */
    public final vr1 m10046b() {
        boolean zM11980f = this.f28725b.m11980f();
        vr1 vr1Var = this.f28725b;
        if (!zM11980f) {
            return vr1Var;
        }
        vr1Var.getClass();
        rh3 rh3Var = rh3.f29290c;
        rh3Var.getClass();
        rh3Var.m10338a(vr1Var.getClass()).mo6180b(vr1Var);
        vr1Var.m11981g();
        return this.f28725b;
    }

    /* JADX INFO: renamed from: c */
    public final void m10047c() {
        if (this.f28725b.m11980f()) {
            return;
        }
        vr1 vr1VarM11982i = this.f28724a.m11982i();
        vr1 vr1Var = this.f28725b;
        rh3 rh3Var = rh3.f29290c;
        rh3Var.getClass();
        rh3Var.m10338a(vr1VarM11982i.getClass()).mo6179a(vr1VarM11982i, vr1Var);
        this.f28725b = vr1VarM11982i;
    }

    public final Object clone() {
        qr1 qr1Var = (qr1) this.f28724a.mo3989b(5);
        qr1Var.f28725b = m10046b();
        return qr1Var;
    }
}
