package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class io0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21603a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21604b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21605c;

    public /* synthetic */ io0(byte b) {
        this.f21603a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f21603a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                Object objM13685q = zp0.m13685q(new C0871lg(pc3Var, (yj4) this.f21604b, (pk4) this.f21605c, null, (byte) 2), wm0Var);
                return objM13685q == ap0.f14763a ? objM13685q : ju4Var;
            default:
                Object objM6084i = gq6.m6084i(pc3Var, new z54((d64) this.f21604b, (lv1) this.f21605c, null), wm0Var);
                return objM6084i == ap0.f14763a ? objM6084i : ju4Var;
        }
    }
}
