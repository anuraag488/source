package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: vd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1252vd implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32528a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32529b;

    public /* synthetic */ C1252vd(byte b) {
        this.f32528a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f32528a;
        byte b2 = 1;
        byte b3 = 2;
        wm0 wm0Var2 = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                Object objM6084i = gq6.m6084i(pc3Var, new C1215ud((C1289wd) this.f32529b, wm0Var2, (byte) 0), wm0Var);
                return objM6084i == ap0.f14763a ? objM6084i : ju4Var;
            case 1:
                Object objM11889O0 = ((vf4) pc3Var).m11889O0(new C1215ud((lv1) this.f32529b, wm0Var2, b2), wm0Var);
                return objM11889O0 == ap0.f14763a ? objM11889O0 : ju4Var;
            case 2:
                Object objM6084i2 = gq6.m6084i(pc3Var, new C1162sy((qw2) this.f32529b, wm0Var2, b2), wm0Var);
                return objM6084i2 == ap0.f14763a ? objM6084i2 : ju4Var;
            case 3:
                Object objM11889O1 = ((vf4) pc3Var).m11889O0(new C1162sy((zn0) this.f32529b, wm0Var2, b3), wm0Var);
                return objM11889O1 == ap0.f14763a ? objM11889O1 : ju4Var;
            case 4:
                Object objM6084i3 = gq6.m6084i(pc3Var, new q04((td4) this.f32529b, null), wm0Var);
                return objM6084i3 == ap0.f14763a ? objM6084i3 : ju4Var;
            case 5:
                Object objM6084i4 = gq6.m6084i(pc3Var, new C1215ud(new C0633f0(1, (ij4) this.f32529b, ij4.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 23), wm0Var2, b3), wm0Var);
                ap0 ap0Var = ap0.f14763a;
                if (objM6084i4 != ap0Var) {
                    objM6084i4 = ju4Var;
                }
                return objM6084i4 == ap0Var ? objM6084i4 : ju4Var;
            case 6:
                pk4 pk4Var = (pk4) this.f32529b;
                Object objM69g = C0006a5.m69g(pc3Var, pk4Var.f27718z, pk4Var.f27717y, wm0Var);
                return objM69g == ap0.f14763a ? objM69g : ju4Var;
            default:
                Object objM13685q = zp0.m13685q(new C0858l3(pc3Var, (yj4) this.f32529b, wm0Var2, b3), wm0Var);
                ap0 ap0Var2 = ap0.f14763a;
                if (objM13685q != ap0Var2) {
                    objM13685q = ju4Var;
                }
                return objM13685q == ap0Var2 ? objM13685q : ju4Var;
        }
    }
}
