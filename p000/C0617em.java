package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: em */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0617em implements ne1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Context f18248a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0950nl f18249b;

    @Override // p000.ne1
    /* JADX INFO: renamed from: a */
    public final oe1 mo5198a(Object obj, b63 b63Var) {
        Context context = this.f18248a;
        C0950nl c0950nl = this.f18249b;
        C0693gm c0693gm = new C0693gm();
        c0693gm.f19871a = context;
        c0693gm.f19872b = (C0532cm) obj;
        c0693gm.f19873c = c0950nl;
        VarHandle.storeStoreFence();
        return c0693gm;
    }
}
