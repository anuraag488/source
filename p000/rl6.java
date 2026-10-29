package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl6 extends gl6 {

    /* JADX INFO: renamed from: g */
    public boolean f29401g;

    public rl6(qm6 qm6Var) {
        super(qm6Var.f28602l);
        this.f19870f = qm6Var;
        qm6Var.f28608r++;
    }

    /* JADX INFO: renamed from: u */
    public final void m10368u() {
        if (this.f29401g) {
            return;
        }
        C1077qn.m9989o("Not initialized");
    }

    /* JADX INFO: renamed from: v */
    public final void m10369v() {
        if (this.f29401g) {
            C1077qn.m9989o("Can't initialize twice");
            return;
        }
        mo3209x();
        this.f19870f.f28609s++;
        this.f29401g = true;
    }

    /* JADX INFO: renamed from: x */
    public void mo3209x() {
    }
}
