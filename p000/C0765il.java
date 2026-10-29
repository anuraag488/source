package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: il */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0765il implements PointerInputEventHandler {

    /* JADX INFO: renamed from: b */
    public static final C0765il f21522b = new C0765il(0);

    /* JADX INFO: renamed from: c */
    public static final C0765il f21523c = new C0765il(1);

    /* JADX INFO: renamed from: d */
    public static final C0765il f21524d = new C0765il(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21525a;

    public /* synthetic */ C0765il(byte b) {
        this.f21525a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f21525a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ju4Var;
            case 1:
                Object objM5720d = fi4.m5720d(pc3Var, null, new r54((byte) 1), wm0Var, 7);
                return objM5720d == ap0.f14763a ? objM5720d : ju4Var;
            default:
                return ju4Var;
        }
    }
}
