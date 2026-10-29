package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.ff3;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i85 implements wl0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ff3 f21177a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i82 f21178b;

    @Override // p000.wl0
    public final void accept(Object obj) {
        ff3 ff3Var = this.f21177a;
        i82 i82Var = this.f21178b;
        vi4 vi4Var = (vi4) obj;
        String str = "JavaScriptIsolate terminated: " + vi4Var;
        AbstractC0137h.m1115c(str, null);
        ff3Var.f3478f.m2570a("SandboxJavascriptEngine.onIsolateTerminated", new n85(str, null));
        int i = vi4Var.f32651a;
        ff3Var.m922a(i82Var, i == 2 || i == 3);
    }
}
