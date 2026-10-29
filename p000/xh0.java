package p000;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh0 implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34278b;

    public /* synthetic */ xh0(byte b) {
        this.f34277a = b;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.f34277a;
        Object obj = this.f34278b;
        switch (b) {
            case 0:
                ((t82) obj).mo4993a(null);
                break;
            default:
                pk4 pk4Var = (pk4) obj;
                if (pk4Var != null) {
                    uj2 uj2Var = pk4Var.f27696d;
                    if (uj2Var != null) {
                        uj2Var.f31911B.setValue(ql4.m9897a(ql4.f28556b));
                    }
                    uj2 uj2Var2 = pk4Var.f27696d;
                    if (uj2Var2 != null) {
                        uj2Var2.f31910A.setValue(ql4.m9897a(ql4.f28556b));
                    }
                }
                break;
        }
    }
}
