package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends se0 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f25339u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ pn1 f25340v;

    public /* synthetic */ mz0(byte b) {
        this.f25339u = b;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: P */
    public final View mo8456P(int i) {
        switch (this.f25339u) {
            case 0:
                Dialog dialog = ((nz0) this.f25340v).f26216g0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.f25340v + " does not have a view");
        }
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: Q */
    public final boolean mo8457Q() {
        switch (this.f25339u) {
            case 0:
                return ((nz0) this.f25340v).f26220k0;
            default:
                return false;
        }
    }
}
