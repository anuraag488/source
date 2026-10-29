package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jf0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ xn2 f22202a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lf0 f22203b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f22204c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ oq1 f22205d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ nq1 f22206e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ wp1 f22207f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ lv1 f22208g;

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        lf0 lf0Var = this.f22203b;
        xn2 xn2Var = this.f22202a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "enabled gestures " + lf0Var.f23991a, null);
            }
        }
        Object objM6084i = gq6.m6084i(pc3Var, new if0(new mx4(), this.f22204c, this.f22202a, lf0Var, this.f22205d, this.f22206e, this.f22207f, this.f22208g, null), wm0Var);
        return objM6084i == ap0.f14763a ? objM6084i : ju4.f22634a;
    }
}
