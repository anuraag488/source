package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dz2 {

    /* JADX INFO: renamed from: a */
    public hz2 f17527a;

    /* JADX INFO: renamed from: b */
    public List f17528b;

    /* JADX INFO: renamed from: c */
    public List f17529c;

    /* JADX INFO: renamed from: d */
    public nz2 f17530d;

    /* JADX INFO: renamed from: e */
    public boolean f17531e;

    /* JADX INFO: renamed from: f */
    public boolean f17532f;

    /* JADX INFO: renamed from: g */
    public C1283w7 f17533g;

    public dz2(hz2 hz2Var, boolean z, int i) {
        this.f17527a = hz2Var;
        v71 v71Var = v71.f32439a;
        this.f17528b = v71Var;
        this.f17529c = v71Var;
        this.f17530d = lz2.f24483a;
        this.f17531e = z;
        this.f17532f = false;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4812a();

    /* JADX INFO: renamed from: b */
    public abstract void mo4813b();

    /* JADX INFO: renamed from: c */
    public abstract void mo4814c(bz2 bz2Var);

    /* JADX INFO: renamed from: d */
    public abstract void mo4815d(bz2 bz2Var);

    /* JADX INFO: renamed from: f */
    public final void m4817f() {
        C1283w7 c1283w7 = this.f17533g;
        if (c1283w7 == null || !((dw2) c1283w7.f33129e).m4780h(this)) {
            return;
        }
        jz2 jz2Var = (jz2) c1283w7.f33128d;
        if (equals(jz2Var.f22758f)) {
            int i = jz2Var.f22759g;
            lz2 lz2Var = lz2.f24483a;
            if (i == -1) {
                this.f17530d = lz2Var;
                mo4812a();
            } else if (i == 1) {
                this.f17530d = lz2Var;
                mo4816e();
            }
            jz2Var.f22758f = null;
            jz2Var.f22759g = 0;
            jz2Var.f22760h = null;
        }
        jz2Var.f22756d.remove(this);
        jz2Var.f22757e.remove(this);
        this.f17533g = null;
        jz2Var.m7348b();
    }

    /* JADX INFO: renamed from: g */
    public final void m4818g(boolean z) {
        jz2 jz2Var;
        if (this.f17531e == z) {
            return;
        }
        this.f17531e = z;
        C1283w7 c1283w7 = this.f17533g;
        if (c1283w7 == null || (jz2Var = (jz2) c1283w7.f33128d) == null) {
            return;
        }
        jz2Var.m7348b();
    }

    /* JADX INFO: renamed from: e */
    public void mo4816e() {
    }
}
