package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf4 implements PointerInputEventHandler, vq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ mq1 f28440a;

    @Override // p000.vq1
    /* JADX INFO: renamed from: a */
    public final iq1 mo6032a() {
        return this.f28440a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof vq1)) {
            return z62.m13387o(this.f28440a, ((vq1) obj).mo6032a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f28440a.hashCode();
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(pc3 pc3Var, wm0 wm0Var) {
        return this.f28440a.invoke(pc3Var, wm0Var);
    }
}
