package p000;

import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x05 extends pq3 {
    @Override // p000.pq3
    /* JADX INFO: renamed from: i */
    public final void mo9611i(boolean z) {
        ((WindowInsetsController) this.f27896b).setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // p000.pq3
    /* JADX INFO: renamed from: k */
    public final void mo9612k(boolean z) {
        ((WindowInsetsController) this.f27896b).setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // p000.pq3
    /* JADX INFO: renamed from: l */
    public final void mo9613l(int i) {
        ((WindowInsetsController) this.f27896b).setSystemBarsBehavior(i);
    }
}
