package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y54 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f34914a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zo0 f34915b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ d64 f34916c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ wp1 f34917d;

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        boolean z = this.f34914a;
        zo0 zo0Var = this.f34915b;
        d64 d64Var = this.f34916c;
        wp1 wp1Var = this.f34917d;
        C0453ag c0453ag = new C0453ag((byte) 3);
        c0453ag.f14443b = z;
        c0453ag.f14445d = zo0Var;
        c0453ag.f14446e = d64Var;
        c0453ag.f14444c = wp1Var;
        VarHandle.storeStoreFence();
        Object objM5720d = fi4.m5720d(pc3Var, null, c0453ag, wm0Var, 7);
        return objM5720d == ap0.f14763a ? objM5720d : ju4.f22634a;
    }
}
