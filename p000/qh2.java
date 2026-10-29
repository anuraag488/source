package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qh2 {

    /* JADX INFO: renamed from: a */
    public Object f28469a;

    /* JADX INFO: renamed from: b */
    public sh2 f28470b;

    /* JADX INFO: renamed from: c */
    public int f28471c;

    /* JADX INFO: renamed from: d */
    public int f28472d;

    /* JADX INFO: renamed from: e */
    public qh2 f28473e;

    /* JADX INFO: renamed from: f */
    public boolean f28474f;

    /* JADX INFO: renamed from: g */
    public d83 f28475g;

    /* JADX INFO: renamed from: a */
    public final qh2 m9887a() {
        if (this.f28474f) {
            t32.m10970c("Pin should not be called on an already disposed item ");
        }
        if (this.f28472d == 0) {
            this.f28470b.f30273a.add(this);
            qh2 qh2Var = (qh2) this.f28475g.getValue();
            if (qh2Var != null) {
                qh2Var.m9887a();
            } else {
                qh2Var = null;
            }
            this.f28473e = qh2Var;
        }
        this.f28472d++;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m9888b() {
        if (this.f28474f) {
            return;
        }
        if (this.f28472d <= 0) {
            t32.m10970c("Release should only be called once");
        }
        int i = this.f28472d - 1;
        this.f28472d = i;
        if (i == 0) {
            this.f28470b.f30273a.remove(this);
            qh2 qh2Var = this.f28473e;
            if (qh2Var != null) {
                qh2Var.m9888b();
            }
            this.f28473e = null;
        }
    }
}
