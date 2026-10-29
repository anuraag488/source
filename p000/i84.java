package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i84 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21172a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f21173b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21174c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f21175d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21176e;

    public /* synthetic */ i84(byte b) {
        this.f21172a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f21172a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                Object objM13685q = zp0.m13685q(new C0980oe(pc3Var, (nv2) this.f21174c, (k84) this.f21175d, this.f21173b, (sw2) this.f21176e, null, (byte) 9), wm0Var);
                return objM13685q == ap0.f14763a ? objM13685q : ju4Var;
            default:
                Object objM6084i = gq6.m6084i(pc3Var, new eh4((nh4) this.f21174c, new ml3(), (C1354y3) this.f21175d, (zo0) this.f21176e, this.f21173b, null), wm0Var);
                return objM6084i == ap0.f14763a ? objM6084i : ju4Var;
        }
    }
}
