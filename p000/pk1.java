package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27687a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ qk1 f27688b;

    public /* synthetic */ pk1(byte b) {
        this.f27687a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f27687a;
        ju4 ju4Var = ju4.f22634a;
        qk1 qk1Var = this.f27688b;
        y60 y60Var = (y60) obj;
        switch (b) {
            case 0:
                View viewM13789v = zt5.m13789v(qk1Var);
                if (!viewM13789v.isFocused() && !viewM13789v.hasFocus()) {
                    zk1 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(qk1Var)).getFocusOwner();
                    View viewM13511H = zc6.m13511H(qk1Var);
                    Integer numM12316c = wk1.m12316c(y60Var.f34919a);
                    int[] iArr = new int[2];
                    viewM13511H.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewM13789v.getLocationOnScreen(iArr2);
                    sl1 sl1VarM13844H = zy5.m13844H(((bl1) focusOwner).f15396c);
                    Rect rect = null;
                    jl3 jl3VarM13846J = sl1VarM13844H != null ? zy5.m13846J(sl1VarM13844H) : null;
                    if (jl3VarM13846J != null) {
                        int i = (int) jl3VarM13846J.f22396a;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) jl3VarM13846J.f22397b;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) jl3VarM13846J.f22398c) + i2) - i3, (((int) jl3VarM13846J.f22399d) + i5) - i6);
                    }
                    if (!wk1.m12315b(viewM13789v, numM12316c, rect)) {
                        y60Var.f34920b = true;
                    }
                }
                break;
            default:
                zt5.m13789v(qk1Var);
                break;
        }
        return ju4Var;
    }
}
