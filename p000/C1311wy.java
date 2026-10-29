package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: wy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1311wy implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33844a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ co4 f33845b;

    public /* synthetic */ C1311wy(byte b) {
        this.f33844a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f33844a;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var2 = null;
        switch (b) {
            case 0:
                Object objM13685q = zp0.m13685q(new C1273vy(pc3Var, this.f33845b, wm0Var2, (byte) 0), wm0Var);
                return objM13685q == ap0.f14763a ? objM13685q : ju4Var;
            default:
                Object objM13685q2 = zp0.m13685q(new C1273vy(pc3Var, this.f33845b, wm0Var2, (byte) 1), wm0Var);
                return objM13685q2 == ap0.f14763a ? objM13685q2 : ju4Var;
        }
    }
}
