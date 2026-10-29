package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o93 implements pm3 {

    /* JADX INFO: renamed from: a */
    public Set f26492a;

    /* JADX INFO: renamed from: b */
    public uw2 f26493b;

    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
        uw2 uw2Var = this.f26493b;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            pm3 pm3Var = ((mr1) objArr[i2]).f25168a;
            this.f26492a.remove(pm3Var);
            pm3Var.mo37c();
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
    }
}
